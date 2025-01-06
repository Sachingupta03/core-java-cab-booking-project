package com.cab_booking.model;

public class Cab {
    private String cabId;
    private String cabType; //"Sedan", "SUV". "Hatchback"
    private boolean isAvailable;

    // Constructor
    public Cab( String cabId, String cabType, boolean isAvailable){
        this.cabId = cabId;
        this.cabType = cabType;
        this.isAvailable = isAvailable;
    }
    // Getter and Setter


    public String getCabId () {
        return cabId;
    }

    public void setCabId (String cabId) {
        this.cabId = cabId;
    }

    public String getCabType () {
        return cabType;
    }

    public void setCabType (String cabType) {
        this.cabType = cabType;
    }

    public boolean isAvailable () {
        return isAvailable;
    }

    public void setAvailable (boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString () {
        return "Cab{" +
                "cabId='" + cabId + '\'' +
                ", cabType='" + cabType + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
