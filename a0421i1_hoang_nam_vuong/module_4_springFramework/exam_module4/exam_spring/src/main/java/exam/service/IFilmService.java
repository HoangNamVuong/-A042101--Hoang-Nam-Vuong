package exam.service;

import exam.model.Film;

import java.util.Optional;

public interface IFilmService {
    Iterable<Film> findAll();

    Optional<Film> findById(String id);

    void save(Film t);

    void remove(String id);
}
