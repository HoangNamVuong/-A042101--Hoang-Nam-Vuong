package blog_manager.repository;

import blog_manager.model.Blog;
import blog_manager.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category, String> {

    @Query(value="select * from category",nativeQuery=true)
    List<Category> findAll();
}
