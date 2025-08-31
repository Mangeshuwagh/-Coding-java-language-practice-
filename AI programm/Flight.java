public class Flight {
    private String flightNumber;
    private String destination;
    private int totalSeats;
    private int reservedSeats;

    public Flight(String flightNumber, String destination, int totalSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.reservedSeats = 0;
    }

    // Getters and Setters
    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public int getTotalSeats() { return totalSeats; }
    public int getReservedSeats() { return reservedSeats; }
    public int getAvailableSeats() { return totalSeats - reservedSeats; }

    public void reserveSeat() {
        if (reservedSeats < totalSeats) {
            reservedSeats++;
        } else {
            System.out.println("No available seats to reserve.");
        }
    }

    public void cancelReservation() {
        if (reservedSeats > 0) {
            reservedSeats--;
        } else {
            System.out.println("No reservations to cancel.");
        }
    }

    @Override
    public String toString() {
        return "Flight [flightNumber=" + flightNumber + ", destination=" + destination
                + ", totalSeats=" + totalSeats + ", reservedSeats=" + reservedSeats + "]";
    }
}
