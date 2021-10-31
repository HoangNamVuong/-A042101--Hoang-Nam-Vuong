package model.repository;

import model.bean.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    void save(Product customer);

    Product findById(int id);

    Product findByName(String name);

    void update(int id, Product customer);

    void remove(int id);
}
