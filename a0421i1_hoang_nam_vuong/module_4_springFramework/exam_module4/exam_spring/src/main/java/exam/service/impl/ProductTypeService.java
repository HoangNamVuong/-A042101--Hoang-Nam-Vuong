package exam.service.impl;

import exam.model.Film;
import exam.model.ProductType;
import exam.repository.IProductTypeRepository;
import exam.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductTypeService implements IProductTypeService {

    @Autowired
    IProductTypeRepository productTypeRepository;

    @Override
    public Iterable<ProductType> findAll() {
        return productTypeRepository.findAll();
    }

    @Override
    public Optional<ProductType> findById(String id) {
        return productTypeRepository.findById(id);
    }

    @Override
    public void save(ProductType productType) {
        productTypeRepository.save(productType);
    }

    @Override
    public void remove(String id) {
        productTypeRepository.deleteById(id);
    }
}
