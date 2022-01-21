package furama.model.customer;

import furama.model.contract.Contract;
import furama.util.CustomIdGenerator;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class Customer {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
//        @GenericGenerator(name = "customer_seq", strategy = "furama.util.CustomIdGenerator",
//                parameters = {
//                        @Parameter(name = CustomIdGenerator.INCREMENT_PARAM, value = "1"),
//                        @Parameter(name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "KH-"),
//                        @Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d")})
    private String id;

    @Column(name="name", columnDefinition ="VARCHAR(45)" )
    @NotBlank(message = "Wrong format, Please capitalize the first letter")
    private String name;

    @Column(name = "birthday", columnDefinition ="VARCHAR(45)")
    @NotEmpty(message = "Birthday is not empty")
    private String birthday;

    @Column(name = "gender",columnDefinition ="VARCHAR(10)")
    @NotNull(message = "Gender is not empty")
    private Boolean gender;

    @Column(name="idCard",columnDefinition ="VARCHAR(15)")
    @Pattern(regexp = "[0-9]{9}|[0-9]{12}", message = "Wrong format, id card have to 9 or 12 number")
    private String idCard;

    @Column(name = "phone",columnDefinition ="VARCHAR(15)")
    @Pattern(regexp = "^(09|\\(84\\)\\+9)[01]\\d{7}$",
            message = "Wrong format, Please enter phone again")
    private String phone;

    @Column(name="email",columnDefinition ="VARCHAR(100)")
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+.[a-z]{2,6}$",
            message = "Wrong format, Please enter email again")
    private String email;

    @Column(name = "address",columnDefinition ="VARCHAR(100)")
    @NotBlank(message = "Address is not empty")
    private String address;

    @ManyToOne(targetEntity = CustomerType.class)
    @NotNull(message = "Customer Type is not empty")
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer")
    List<Contract> contractList;

    public Customer() {
    }

    public Customer(String id, String name, String birthday, Boolean gender, String idCard, String phone, String email,
                    String address, CustomerType customerType, List<Contract> contractList) {

        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
