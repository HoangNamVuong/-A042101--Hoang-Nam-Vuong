package furama.model.service;

import furama.model.contract.Contract;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "services")
public class Services {
    @Id
    @Pattern(regexp = "DV-[0-9]{4}", message = "Wrong format, Please enter id like: DV-0001")
    private String id;

    @NotBlank(message = "Name is not empty")
    private String name;

    @Min(value = 20, message = "Area is larger than 20")
    @NotNull(message = "Area is not empty")
    private Integer area;

    @Min(value = 1, message = "Area is larger than 0")
    @NotNull(message = "Cost is not empty")
    private Double cost;

    @Min(value = 1, message = "Max people is larger than 0")
    @NotNull(message = "Max people is not empty")
    private Integer maxPeople;

    @NotBlank(message = "Standard is not empty")
    private String standard;

    @NotBlank(message = "Description is not empty")
    private String description;

    @Min(value = 1, message = "Pool area is larger than 0")
    private Integer poolArea;

    @Min(value = 1, message = "Floor is larger than 0")
    private Integer floor;


    @ManyToOne(targetEntity = RentalType.class)
    private RentalType rentalType;

    @ManyToOne(targetEntity = ServiceType.class)
    private ServiceType serviceType;

    @OneToMany(mappedBy = "services")
    List<Contract> contractList;

    public Services() {
    }

    public Services(String id, String name, Integer area, Double cost, Integer maxPeople, String standard,
                    String description, Integer poolArea, Integer floor, RentalType rentalType,
                    ServiceType serviceType, List<Contract> contractList) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.standard = standard;
        this.description = description;
        this.poolArea = poolArea;
        this.floor = floor;
        this.rentalType = rentalType;
        this.serviceType = serviceType;
        this.contractList = contractList;
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

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Integer poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
