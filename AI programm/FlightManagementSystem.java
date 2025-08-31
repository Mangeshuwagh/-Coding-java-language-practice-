import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightManagementSystem {
    private List<Flight> flights;

    public FlightManagementSystem() {
        flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(String flightNumber) {
        flights.removeIf(flight -> flight.getFlightNumber().equals(flightNumber));
    }

    public Flight searchFlightByNumber(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }

    public void displayAllFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public static void main(String[] args) {
        FlightManagementSystem fms = new FlightManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Flight");
            System.out.println("2. Remove Flight");
            System.out.println("3. Search Flight by Number");
            System.out.println("4. Display All Flights");
            System.out.println("5. Reserve a Seat");
            System.out.println("6. Cancel Reservation");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter flight number: ");
                    String flightNumber = scanner.next();
                    System.out.print("Enter destination: ");
                    String destination = scanner.next();
                    System.out.print("Enter total seats: ");
                    int totalSeats = scanner.nextInt();
                    fms.addFlight(new Flight(flightNumber, destination, totalSeats));
                    break;

                case 2:
                    System.out.print("Enter flight number to remove: ");
                    flightNumber = scanner.next();
                    fms.removeFlight(flightNumber);
                    break;

                case 3:
                    System.out.print("Enter flight number to search: ");
                    flightNumber = scanner.next();
                    Flight flight = fms.searchFlightByNumber(flightNumber);
                    if (flight != null) {
                        System.out.println(flight);
                    } else {
                        System.out.println("Flight not found.");
                    }
                    break;

                case 4:
                    fms.displayAllFlights();
                    break;

                case 5:
                    System.out.print("Enter flight number to reserve seat: ");
                    flightNumber = scanner.next();
                    flight = fms.searchFlightByNumber(flightNumber);
                    if (flight != null) {
                        flight.reserveSeat();
                    } else {
                        System.out.println("Flight not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter flight number to cancel reservation: ");
                    flightNumber = scanner.next();
                    flight = fms.searchFlightByNumber(flightNumber);
                    if (flight != null) {
                        flight.cancelReservation();
                    } else {
                        System.out.println("Flight not found.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
