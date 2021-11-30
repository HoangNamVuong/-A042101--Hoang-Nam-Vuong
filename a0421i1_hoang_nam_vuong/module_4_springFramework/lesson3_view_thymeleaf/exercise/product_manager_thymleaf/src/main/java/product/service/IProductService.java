package product.service;

import org.springframework.stereotype.Service;
import product.model.Product;

import java.util.List;

@Service
public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void remove(int id);

    void update(int id, Product product);
}
