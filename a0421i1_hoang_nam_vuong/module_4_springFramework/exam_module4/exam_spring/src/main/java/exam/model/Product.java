package exam.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
public class Product {
    @Id
    private String id;

    private String name;

    private String price;

    private String status;

    @ManyToOne(targetEntity = ProductType.class)
    @JoinColumn(name = "product_type_id")
    private ProductType productType;

    public Product() {
    }

    public Product(String id, String name, String price, String status, ProductType productType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.productType = productType;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
