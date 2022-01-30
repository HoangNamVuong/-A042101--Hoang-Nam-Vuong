package exam.service;

import exam.model.Film;
import exam.model.ProductType;
import exam.service.impl.ProductTypeService;

import java.util.Optional;

public interface IProductTypeService {
    Iterable<ProductType> findAll();

    Optional<ProductType> findById(String id);

    void save(ProductType productType);

    void remove(String id);
}
