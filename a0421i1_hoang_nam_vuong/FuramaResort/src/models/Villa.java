package models;

public class Villa extends Facility{
    private String standardVilla;
    private int poolArea;
    private int numberOfFloors;

    public Villa() {

    }

    public Villa(int facilityId,
                 String serviceName,
                 int useArea,
                 int rentalPrice,
                 int maximumNumberPeople,
                 String rentalType,
                 String standardVilla,
                 int poolArea,
                 int numberOfFloors) {
        super(facilityId, serviceName, useArea, rentalPrice, maximumNumberPeople, rentalType);
        this.standardVilla = standardVilla;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "standardVilla='" + standardVilla + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
