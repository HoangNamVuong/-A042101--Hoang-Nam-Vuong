package library.service.Impl;

import library.exception.NotAvailableException;
import library.exception.WrongKeycodeException;
import library.model.Book;
import library.model.Keycode;
import library.model.Status;
import library.repository.IBookRepository;
import library.service.IBookService;
import library.service.IKeycodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BookService implements IBookService {

    @Autowired
    IBookRepository bookRepository;

    @Autowired
    IKeycodeService keycodeService;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
        Status available = new Status(1L);
        for (int i = 0; i < book.getNumber(); i++) {
            int number = 10000 + new Random().nextInt(90000);
            Keycode keycode = new Keycode(number, bookRepository.findById(book.getId()).orElse(null), available);
            keycodeService.save(keycode);
            book.generateKeycode(keycode);
        }
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void borrow(Book book, Integer usedKeycode) {
        List<Keycode> keycodeList = keycodeService.findAllKeycodeByBookId(book.getId());
        for (Keycode keycode : keycodeList) {
            if (keycode.getCode().equals(usedKeycode)) {
                keycode.setStatus(new Status(2L, "used"));
                break;
            }
        }
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Keycode getNextAvailableKeycode(Book book) throws NotAvailableException {
        List<Keycode> keycodeList = keycodeService.findAvailableKeycodeByBookId(book.getId());
        if (keycodeList.size() == 0) {
            throw new NotAvailableException();
        }
        return keycodeList.get(0);
    }

    @Override
    public void returnBook(Book book, Long returnKeycode) throws NotAvailableException, WrongKeycodeException {
        List<Keycode> keycodeList = keycodeService.findUsedKeycodeByBookId(book.getId());
        if (keycodeList.size() == 0) {
            throw new NotAvailableException();
        }
        boolean isCorrectCode = false;
        for (Keycode keycode : keycodeList) {
            if (keycode.getCode().equals(returnKeycode)) {
                keycode.setStatus(new Status(1L, "available"));
                keycodeService.save(keycode);
                book.returnBook();
                bookRepository.save(book);
                isCorrectCode = true;
                break;
            }
        }
        if (!isCorrectCode) {
            throw new WrongKeycodeException();
        }
    }

    @Override
    public boolean checkNoUsedKeycode(Book book) {
        List<Keycode> availableKeycodeList = keycodeService.findAvailableKeycodeByBookId(book.getId());
        List<Keycode> allKeycodeList = keycodeService.findAllKeycodeByBookId(book.getId());
        return availableKeycodeList.size() == allKeycodeList.size();
    }
}
