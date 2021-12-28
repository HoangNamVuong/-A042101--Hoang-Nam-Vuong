package cart.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phoneNumber;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public Customer() {
    }

    public Customer(Long id, String name, String phoneNumber, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
