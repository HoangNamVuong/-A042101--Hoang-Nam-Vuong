package blog_manager.repository;

import blog_manager.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, String> {

    @Query(value="select * from blog join category where blog.category_id = category.id and category.id=:id",nativeQuery=true)
    List<Blog> findAllBlogByCategoryId(@Param("id") String id);

    Page<Blog> findBlogByTitleContaining(String title, Pageable pageable);
}
