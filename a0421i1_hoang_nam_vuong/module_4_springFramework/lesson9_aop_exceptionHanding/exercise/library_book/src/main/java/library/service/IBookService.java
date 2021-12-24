package library.service;

import library.exception.NotAvailableException;
import library.exception.WrongKeycodeException;
import library.model.Book;
import library.model.Keycode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBookService {

    List<Book> findAll();

    void save(Book book);

    Book findById(Long id);

    void borrow(Book book, Integer usedKeycode);

    void delete(Long id);

    Keycode getNextAvailableKeycode(Book book) throws NotAvailableException, NotAvailableException;

    void returnBook(Book book, Long returnKeycode) throws NotAvailableException, WrongKeycodeException;

    public boolean checkNoUsedKeycode(Book book);
}
