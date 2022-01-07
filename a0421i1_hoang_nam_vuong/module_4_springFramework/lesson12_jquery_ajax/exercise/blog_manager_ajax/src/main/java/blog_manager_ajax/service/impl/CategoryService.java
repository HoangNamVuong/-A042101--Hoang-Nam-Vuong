package blog_manager_ajax.service.impl;


import blog_manager_ajax.model.Category;
import blog_manager_ajax.repository.ICategoryRepository;
import blog_manager_ajax.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public Category findById(String id) {
        return iCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(String id) {
        iCategoryRepository.deleteById(id);
    }

}
