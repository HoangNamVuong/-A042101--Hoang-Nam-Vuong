package furama.repository.service;

import furama.model.service.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IServiceRepository extends JpaRepository<Services, String> {
    @Override
    Page<Services> findAll(Pageable pageable);
    // Search by name
    @Query(value = "select * \n" +
            " from services \n" +
            " where name like concat('%',:name, '%')", nativeQuery = true)
    Page< Services > searchByName(@Param("name") String name, Pageable pageable);
}
