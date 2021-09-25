package models;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {

    }

    public Room(int facilityId,
                String serviceName,
                int useArea,
                int rentalPrice,
                int maximumNumberPeople,
                String rentalType,
                String freeServiceIncluded) {
        super(facilityId, serviceName, useArea, rentalPrice, maximumNumberPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
}
