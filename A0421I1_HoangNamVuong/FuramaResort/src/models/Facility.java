package models;

public abstract class Facility {
    private int facilityId;
    private String serviceName;
    private int useArea;
    private int rentalPrice;
    private int maximumNumberPeople;
    private String rentalType;

    public Facility() {

    }

    public Facility(int facilityId, String serviceName, int useArea, int rentalPrice, int maximumNumberPeople, String rentalType) {
        this.facilityId = facilityId;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentalPrice = rentalPrice;
        this.maximumNumberPeople = maximumNumberPeople;
        this.rentalType = rentalType;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUseArea() {
        return useArea;
    }

    public void setUseArea(int useArea) {
        this.useArea = useArea;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getMaximumNumberPeople() {
        return maximumNumberPeople;
    }

    public void setMaximumNumberPeople(int maximumNumberPeople) {
        this.maximumNumberPeople = maximumNumberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "facilityId=" + facilityId +
                ", serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea +
                ", rentalPrice=" + rentalPrice +
                ", maximumNumberPeople=" + maximumNumberPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
