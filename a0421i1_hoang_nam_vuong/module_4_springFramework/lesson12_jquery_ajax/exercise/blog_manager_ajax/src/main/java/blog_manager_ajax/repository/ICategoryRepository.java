package blog_manager_ajax.repository;

import blog_manager_ajax.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category, String> {

    @Query(value="select * from category",nativeQuery=true)
    List<Category> findAll();
}
