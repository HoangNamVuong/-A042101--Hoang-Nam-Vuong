package models;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {

    }

    public Customer(int id,
                    String name,
                    int age,
                    String sex,
                    String idCard,
                    int phoneNumber,
                    String email,
                    String customerType,
                    String address) {
        super(id, name, age, sex, idCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString() +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
