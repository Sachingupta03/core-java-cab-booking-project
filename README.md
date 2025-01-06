# core-java-cab-booking-project
 cab- booking- project 
 The Cab Booking System is a simple, object-oriented Java application that allows customers to book cabs. The system uses Java POJOs (Plain Old Java Objects) and various Java Collections Framework data structures, including List, Set, and Map, to store and manage information related to Cabs, Customers, and Bookings.

Key Features:
- Add Cabs to the system with different types (e.g., Sedan, SUV, Hatchback).
- Book Cabs for customers.
- Cancel Bookings if needed.
- Display Available Cabs and All Bookings.
- Uses List to store all bookings, Set to store unique cabs, and Map for quick access to bookings by their booking IDs.

System Design

The system is designed around three main entities:

1. Cab: Represents a vehicle available for booking. Each cab has an ID, type (e.g., Sedan, SUV), and availability status.
2. Customer: Represents a customer who can book a cab. Each customer has an ID, name, and contact number.
3. Booking: Represents a booking made by a customer for a specific cab, with a unique booking ID, the customer who made the booking, the booked cab, and the booking time.

The CabBookingService class manages the booking process using collections like List, Set, and Map.

---
 Classes and Their Responsibilities

1. Cab Class (POJO)

The Cab class represents the details of a cab, such as:
- cabId: Unique identifier for the cab.
- cabType: Type of cab (e.g., Sedan, SUV).
- isAvailable: Availability status of the cab (whether it is available for booking).

2. Customer Class (POJO)

The Customer class represents a customer with:
- customerId: Unique identifier for the customer.
- name: Name of the customer.
- contactNumber: Customer's phone number.

3. Booking Class (POJO)

The Booking class represents a booking made by a customer:
- bookingId: Unique identifier for the booking.
- customer: The customer who made the booking.
- cab: The cab that has been booked.
- bookingTime: The time when the booking was made.

4. CabBookingService Class

The CabBookingService class is responsible for managing the cab booking process, including:
- Adding new cabs to the system.
- Booking a cab for a customer.
- Canceling bookings.
- Displaying available cabs and all bookings.

It uses the following collections:
- List: To store all bookings (preserving the order of bookings).
- Set: To store unique cabs (no duplicates).
- Map: To store bookings by their booking ID for quick lookup.

5. Main Class
 The Main class interacts with the user (or simulates user input) and demonstrates the system's functionality. It allows customers to book cabs, view bookings, and display available cab
