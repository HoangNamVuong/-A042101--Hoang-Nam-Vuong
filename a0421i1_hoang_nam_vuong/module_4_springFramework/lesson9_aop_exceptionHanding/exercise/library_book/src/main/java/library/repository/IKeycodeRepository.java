package library.repository;

import library.model.Keycode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IKeycodeRepository extends JpaRepository<Keycode, Long> {

    List<Keycode> findKeycodeByBook_Id(Long id);

    List<Keycode> findKeycodeByBook_IdAndStatus_Id(Long bookId, Long statusId);
}
