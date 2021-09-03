package lesson12_java_collection_framework.exercise.use_arrayList_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    static {
        Product product1 = new Product(1,"Car","50000$");
        Product product2 = new Product(2,"House","500000$");
        Product product3 = new Product(3,"Book","50$");
        Product product4 = new Product(4,"Dog","500$");
        List<Product> productList = new ArrayList<>();
    }
    public static void main(String[] args) {
        Product product1 = new Product(1,"Car","50000$");
        Product product2 = new Product(2,"House","500000$");
        Product product3 = new Product(3,"Book","50$");
        Product product4 = new Product(4,"Dog","500$");
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        for (Product i : productList) {
            System.out.println(i );
        }
        System.out.println("Product after sort for price.");
        Collections.sort(productList);
        for (Product i : productList) {
            System.out.println(i );
        }

    }
}
