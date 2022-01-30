package exam.repository;

import exam.model.ShowTime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IShowTimeRepository extends JpaRepository<ShowTime, String> {
    @Override
    Page< ShowTime > findAll(Pageable pageable);
    // Search by name
    @Query(value = "select * from exam_spring.film \n" +
            "join exam_spring.show_time\n" +
            "on film.id = show_time.film_id\n" +
            "where film.`name` like concat('%',:name, '%')", nativeQuery = true)
    Page< ShowTime > searchByName(@Param("name") String name, Pageable pageable);
    boolean existsById(String id);
}
