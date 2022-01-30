package exam.repository;

import exam.model.Product;
import exam.model.ShowTime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IProductRepository extends JpaRepository<Product, String> {
    @Override
    Page<Product> findAll(Pageable pageable);
    // Search by name
    @Query(value = "select * from exam_spring.product_type \n" +
            "join exam_spring.product\n" +
            "on product_type.id = product.product_type_id\n" +
            "where product_type.`name` like concat('%',:name, '%')", nativeQuery = true)
    Page< Product > searchByName(@Param("name") String name, Pageable pageable);
    boolean existsById(String id);
}
