package exam.service.impl;

import exam.model.Film;
import exam.repository.IFilmRepository;
import exam.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FilmService implements IFilmService {

    @Autowired
    IFilmRepository filmRepository;

    @Override
    public Iterable<Film> findAll() {
        return filmRepository.findAll();
    }

    @Override
    public Optional<Film> findById(String id) {
        return filmRepository.findById(id);
    }

    @Override
    public void save(Film t) {
        filmRepository.save(t);
    }

    @Override
    public void remove(String id) {
        filmRepository.deleteById(id);
    }
}
