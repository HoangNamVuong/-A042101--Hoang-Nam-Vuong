package library.service.Impl;

import library.model.Book;
import library.model.Keycode;
import library.model.Status;
import library.repository.IBookRepository;
import library.repository.IKeycodeRepository;
import library.service.IKeycodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeycodeService implements IKeycodeService {

    @Autowired
    IKeycodeRepository keycodeRepository;

    @Autowired
    IBookRepository bookRepository;

    @Override
    public List<Keycode> findAll() {
        return this.keycodeRepository.findAll();
    }

    @Override
    public Keycode findById(Long id) {
        return keycodeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Keycode keycode) {
        keycodeRepository.save(keycode);
    }

    @Override
    public List<Keycode> findAllKeycodeByBookId(Long id) {
        return keycodeRepository.findKeycodeByBook_Id(id);
    }

    @Override
    public List<Keycode> findAvailableKeycodeByBookId(Long id) {
        return keycodeRepository.findKeycodeByBook_IdAndStatus_Id(id, 1L);
    }

    @Override
    public List<Keycode> findUsedKeycodeByBookId(Long id) {
        return keycodeRepository.findKeycodeByBook_IdAndStatus_Id(id, 2L);
    }

    @Override
    public void returnBookByKeycode(Book book, Integer returnKeycode) {
        Keycode keycode = keycodeRepository.findById(returnKeycode).orElse(null);
        book = keycode.getBook();
        book.returnBook();
        bookRepository.save(book);
        keycode.setStatus(new Status(1L, "available"));
    }
}
