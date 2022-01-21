package furama.model.contract;

import furama.model.customer.Customer;
import furama.model.employee.Employee;
import furama.model.service.Services;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String checkin;

    private String checkout;

    private Double deposit;

    private Double totalMoney;

    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;

    @OneToMany(mappedBy = "contract")
    List<ContractDetail> contractDetailList;

    @ManyToOne(targetEntity = Services.class)
    private Services services;

    @ManyToOne(targetEntity = Employee.class)
    private Employee employee;

    public Contract() {
    }

    public Contract(Integer id, String checkin, String checkout, Double deposit, Double totalMoney,
                    Customer customer, List<ContractDetail> contractDetailList, Services services, Employee employee) {
        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.customer = customer;
        this.contractDetailList = contractDetailList;
        this.services = services;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
