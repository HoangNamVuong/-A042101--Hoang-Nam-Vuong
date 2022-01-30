package exam.service.impl;

import exam.model.Product;
import exam.repository.IProductRepository;
import exam.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductRepository productRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> searchByName(String name, Pageable pageable) {
        return productRepository.searchByName(name, pageable);
    }

    @Override
    public boolean existsById(String id) {
        return productRepository.existsById(id);
    }
}
