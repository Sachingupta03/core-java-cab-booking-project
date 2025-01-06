package com.cab_booking.model;

import java.util.Date;

public class Booking {
    private String bookingId;
    private Customer customer;
    private Cab cab;
    private Date bookingTime;

    // Constructor
    public Booking( String bookingId,Customer customer, Cab cab, Date bookingTime){
        this.bookingId = bookingId;
        this.customer = customer;
        this.cab = cab;
        this.bookingTime = bookingTime;
    }

    public static Booking get (String bookingId) {
        return null;
    }

    // Getter and Setter
    public String getBookingId () {
        return bookingId;
    }

    public void setBookingId (String bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer () {
        return customer;
    }

    public void setCustomer (Customer customer) {
        this.customer = customer;
    }

    public Cab getCab () {
        return cab;
    }

    public void setCab (Cab cab) {
        this.cab = cab;
    }

    public Date getBookingTime () {
        return bookingTime;
    }

    public void setBookingTime (Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    @Override
    public String toString () {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", customer=" + customer +
                ", cab=" + cab +
                ", bookingTime=" + bookingTime +
                '}';
    }

    public void put (String bookingId, Booking booking) {
    }

    public void remove (String bookingId) {
    }
}
