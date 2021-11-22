package model.repository;

import model.bean.Product;

import java.util.List;
import java.util.Map;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(int id);
    boolean save(Product product);
    boolean delete(int id);
    boolean update(int id, Product product);
    List<Product> search(String searchTen, String searchDanhMuc);
}
