package model.service.imp;

import model.bean.Product;
import model.repository.DanhMucRepository;
import model.repository.ProductRepository;
import model.repository.impl.DanhMucRepositoryImpl;
import model.repository.impl.ProductRepositoryImpl;

import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements model.service.ProductService {
    private ProductRepository productRepository = new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public boolean save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Map<String, String> save1(Product product) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return productRepository.delete(id);
    }

    @Override
    public boolean update(int id, Product product) {
        return productRepository.update(id,product);
    }

    @Override
    public List<Product> search(String searchTen, String searchDanhMuc) {
        return productRepository.search(searchTen,searchDanhMuc);
    }
}
