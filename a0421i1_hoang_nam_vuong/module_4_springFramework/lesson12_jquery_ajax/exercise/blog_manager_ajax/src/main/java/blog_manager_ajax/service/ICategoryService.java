package blog_manager_ajax.service;

import blog_manager_ajax.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService {

    List<Category> findAll();

    void save(Category category);

    Category findById(String id);

    void deleteById(String id);
}
