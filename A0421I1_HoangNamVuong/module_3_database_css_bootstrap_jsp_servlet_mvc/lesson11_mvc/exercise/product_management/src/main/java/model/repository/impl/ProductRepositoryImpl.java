package model.repository.impl;

import model.bean.Product;
import model.repository.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {

    private static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"phone","100","talk","america"));
        products.put(2,new Product(2,"car","900","move","japan"));
        products.put(3,new Product(3,"clothes","20","wear","viet nam"));
        products.put(4,new Product(4,"food","100","eat","viet nam"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public Product findByName(String name) {
        return products.get(name);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
