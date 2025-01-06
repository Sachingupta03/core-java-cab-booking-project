package com.cab_booking.Service;

import com.cab_booking.model.Booking;
import com.cab_booking.model.Cab;
import com.cab_booking.model.Customer;

import java.util.*;

public class CabBookingService {
    private Map<String,Cab>cabs = new HashMap<> ();
    private Map<String, Booking> booking = new HashMap<> ();
    private Scanner scanner = new Scanner (System.in);

    // Add a new cab  to the system
    public void addCab(Cab cab){
        cabs.put (cab.getCabId (),cab);
    }

    // View all Cabs
    public void viewCabs(){
        System.out.println ("Available Cabs:");
        for (Cab cab : cabs.values ()){
            System.out.println (cab);
        }
    }

    // Book a cab for customer
    public Booking bookCab(Customer customer, String cabId){
        Cab selectedCab = cabs.get (cabId);

        if (selectedCab!=null&& selectedCab.isAvailable ()){
            selectedCab.setAvailable (false); // Mark the cab as unavailable
            String bookingId = UUID.randomUUID ().toString (); // Generate a unique booking Id
            Booking booking = new Booking (bookingId,customer,selectedCab,new Date ());
            booking.put(bookingId, booking);
            System.out.println ("Booking confirmed! Booking Id;" +bookingId);
            return booking;
        } else {
            System.out.println ("Cab is either unavailable or dose not exist.");
            return null;
        }
    }
    // Cancel a booking
    public void cancelBooking(String bookingId){
        Booking booking = Booking.get(bookingId);
        if (booking!= null){
            booking.getCab ().setAvailable (true); // Mark the cab as available
            booking.remove(bookingId);
            System.out.println ("Booking cancelled successfully!");
        }else{
            System.out.println ("Booking not found!");
        }
    }
    // View all booking
    public void viewBooking(){
        System.out.println ("Booking:");
        for (Booking booking : booking.values ()){
            System.out.println (booking);
        }
    }
}
