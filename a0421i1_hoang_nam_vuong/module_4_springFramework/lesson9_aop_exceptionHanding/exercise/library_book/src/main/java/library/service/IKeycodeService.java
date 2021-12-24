package library.service;

import library.model.Book;
import library.model.Keycode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IKeycodeService {

    List<Keycode> findAll();

    Keycode findById(Long id);

    void save(Keycode keycode);

    List<Keycode> findAllKeycodeByBookId(Long id);

    List<Keycode> findAvailableKeycodeByBookId(Long id);

    List<Keycode> findUsedKeycodeByBookId(Long id);

    void returnBookByKeycode(Book book, Integer returnKeycode);
}
