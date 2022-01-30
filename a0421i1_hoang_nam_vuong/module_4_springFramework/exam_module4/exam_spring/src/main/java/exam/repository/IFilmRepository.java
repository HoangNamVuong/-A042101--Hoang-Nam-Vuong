package exam.repository;

import exam.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFilmRepository extends JpaRepository<Film, String> {
}
