package models;

public class House extends Facility{
    private String standardRoom;
    private int numberOfFloors;

    public House() {

    }

    public House(int facilityId,
                 String serviceName,
                 int useArea,
                 int rentalPrice,
                 int maximumNumberPeople,
                 String rentalType,
                 String standardRoom,
                 int numberOfFloors) {
        super(facilityId, serviceName, useArea, rentalPrice, maximumNumberPeople, rentalType);
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "standardRoom=" + standardRoom +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
