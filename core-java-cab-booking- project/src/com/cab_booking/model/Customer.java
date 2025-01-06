package com.cab_booking.model;

public class Customer {
    private String customerId;
    private String name;
    private String contactNumber;
    private String address;
    
    // Constructor
    public Customer(String customerId, String name, String contactNumber){
        this.customerId = customerId;
        this.name = name;
        this.contactNumber = contactNumber;
    }
     // Getter and Setter
    public String getCustomerId () {
        return customerId;
    }

    public void setCustomerId (String customerId) {
        this.customerId = customerId;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getContactNumber () {
        return contactNumber;
    }

    public void setContactNumber (String contactNumber) {
        this.contactNumber = contactNumber;
    }
    @Override
    public String toString () {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
