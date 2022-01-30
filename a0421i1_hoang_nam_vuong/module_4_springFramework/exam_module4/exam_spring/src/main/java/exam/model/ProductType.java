package exam.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProductType {
    @Id
    private String id;

    private String name;

    @OneToMany(mappedBy = "productType")
    List<Product> productList;

    public ProductType() {
    }

    public ProductType(String id, String name, List<Product> productList) {
        this.id = id;
        this.name = name;
        this.productList = productList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
