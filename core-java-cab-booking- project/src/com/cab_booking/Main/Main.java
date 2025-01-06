package com.cab_booking.Main;

import com.cab_booking.Service.CabBookingService;
import com.cab_booking.model.Cab;
import com.cab_booking.model.Customer;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Create a CabBookingService instance
        CabBookingService cabBookingService = new CabBookingService ();

        // Add some cabs to the system
        Cab cab1 = new Cab ("CABOO1", "Sedam", true);
        Cab cab2 = new Cab ("CABOO2", "SUV", true);
        Cab cab3 = new Cab ("CABOO3", "Hatchback", true);

        cabBookingService.addCab (cab1);
        cabBookingService.addCab (cab2);
        cabBookingService.addCab (cab3);

        // Create a Customer
        Customer customer1 = new Customer ("CUSTOO1", "Som", "1234567890");

        //Simulate the booking Process
        Scanner scanner = new Scanner (System.in);

        while (true){
            System.out.println ("\nCab Booking System Menu:");
            System.out.println ("1. View Available Cabs");
            System.out.println ("2. Book a Cab");
            System.out.println ("3.View Bookings");
            System.out.println ("4. Cancel a Booking");
            System.out.println ("5. Exit");

            System.out.print("Choose an option:");
            int option = scanner.nextInt (); // Consume the newline character

           switch (option){
               case 1:
                   cabBookingService.viewCabs ();
                   break;
               case 2:
                   System.out.print("Enter the cab Id to book:");
                   String cabId = scanner.nextLine ();
                   cabBookingService.bookCab(customer1,cabId);
                   break;
               case 3:
                   cabBookingService.viewBooking ();
                   break;
               case 4:
                   System.out.print("Enter the Booking Id to cancel");
                   String bookingId = scanner.nextLine ();
                   cabBookingService.cancelBooking (bookingId);
                   break;
               case 5:
                   System.out.println ("Exiting  the System.");
                   return;
               default:
                   System.out.println ("Invalid option. please try again");
           }
        }
    }

    }

