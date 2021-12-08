package upload.service;

import org.springframework.stereotype.Service;
import upload.model.Product;

import java.util.List;

@Service
public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
