package exam.service;

import exam.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);

    Iterable<Product> findAll();

    Optional<Product> findById(String id);

    void save(Product product);

    void remove(String id);
    Page<Product> searchByName(String name, Pageable pageable);

    boolean existsById(String id);
}
