package blog_manager_ajax.service;

import blog_manager_ajax.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBlogService {

    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(String id);

    void delete(Blog blog);

    List<Blog> findAllBlogByCategoryId(String id);

    Page<Blog> findAllBlogByTitle(String title, Pageable pageable);
}
