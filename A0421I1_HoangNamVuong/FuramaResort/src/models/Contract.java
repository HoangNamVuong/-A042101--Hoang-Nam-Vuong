package models;

public class Contract {
    private int contractNumber;
    private int bookingCode;
    private int advanceDeposit;
    private int totalPayment;
    private int customerCode;

    public Contract() {

    }

    public Contract(int contractNumber, int bookingCode, int advanceDeposit, int totalPayment, int customerCode) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.advanceDeposit = advanceDeposit;
        this.totalPayment = totalPayment;
        this.customerCode = customerCode;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getAdvanceDeposit() {
        return advanceDeposit;
    }

    public void setAdvanceDeposit(int advanceDeposit) {
        this.advanceDeposit = advanceDeposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }
}
