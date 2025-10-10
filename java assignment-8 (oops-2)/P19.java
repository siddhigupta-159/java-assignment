// 19. Write a Java program to create a class with methods to search for flights and hotels, 
// and to book and cancel reservations.

import java.util.ArrayList;

class TravelBooking {
    private ArrayList<String> flights = new ArrayList<String>();
    private ArrayList<String> hotels = new ArrayList<String>();
    private ArrayList<String> reservations = new ArrayList<String>();

    public TravelBooking() {
        flights.add("Indigo - Delhi to Mumbai");
        flights.add("Air India - Bhopal to Indore");
        flights.add("SpiceJet - Pune to Goa");

        hotels.add("Taj Palace");
        hotels.add("Radisson Blu");
        hotels.add("Hotel Sunshine");
    }

    public void searchFlights(String from, String to) {
        System.out.println("\nSearching flights from " + from + " to " + to + "...");
        for (String f : flights) {
            if (f.toLowerCase().contains(from.toLowerCase()) && f.toLowerCase().contains(to.toLowerCase())) {
                System.out.println("Found: " + f);
            }
        }
    }

    public void searchHotels(String city) {
        System.out.println("\nSearching hotels in " + city + "...");
        for (String h : hotels) {
            System.out.println("Available: " + h + " (" + city + ")");
        }
    }

    public void bookReservation(String name) {
        reservations.add(name);
        System.out.println("Reservation booked: " + name);
    }

    public void cancelReservation(String name) {
        if (reservations.remove(name)) {
            System.out.println("Reservation cancelled: " + name);
        } else {
            System.out.println("No such reservation found!");
        }
    }

    public void displayReservations() {
        System.out.println("\n--- Current Reservations ---");
        for (String r : reservations) {
            System.out.println(r);
        }
    }
}

class P19 {
    public static void main(String[] args) {
        TravelBooking t = new TravelBooking();

        t.searchFlights("Delhi", "Mumbai");
        t.searchHotels("Mumbai");

        t.bookReservation("Flight: Indigo - Delhi to Mumbai");
        t.bookReservation("Hotel: Taj Palace - Mumbai");

        t.displayReservations();

        t.cancelReservation("Flight: Indigo - Delhi to Mumbai");
        t.displayReservations();
    }
}
