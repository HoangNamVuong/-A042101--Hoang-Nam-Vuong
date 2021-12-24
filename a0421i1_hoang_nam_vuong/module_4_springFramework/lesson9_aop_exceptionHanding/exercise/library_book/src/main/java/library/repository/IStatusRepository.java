package library.repository;

import library.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStatusRepository extends JpaRepository<Status, Long> {
}
