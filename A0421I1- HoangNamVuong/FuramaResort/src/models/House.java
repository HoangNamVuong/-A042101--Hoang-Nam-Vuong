package models;

public class House extends Facility{
    private int roomStandard;
    private int numberOfFloors;

    public House() {

    }

    public House(String serviceName, int usableArea, int rentalCosts, int maximumNumberPeople, String rentalType, int roomStandard, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maximumNumberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public int getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(int roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
