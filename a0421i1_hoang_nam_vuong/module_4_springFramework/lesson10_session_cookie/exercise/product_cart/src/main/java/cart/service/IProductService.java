package cart.service;

import cart.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IProductService {
    List<Product> findAll();

    Optional<Product> findById(Long id);
}
