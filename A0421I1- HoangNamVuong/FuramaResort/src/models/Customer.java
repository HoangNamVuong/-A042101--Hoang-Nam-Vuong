package models;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {

    }

    public Customer(int personalCode, String fullName, int dateOfBirth, String sex, int identityCardNumber, int phoneNumber, String email, String customerType, String address) {
        super(personalCode, fullName, dateOfBirth, sex, identityCardNumber, phoneNumber, email);
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
}
