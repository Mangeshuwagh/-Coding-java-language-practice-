
// Q. Write a Java Program to create pojo class name as Flight

//             Operations:
//                 Add a flight.
//                 Remove a flight.
//                 Search for a flight by flight number or destination.
// Display all available flights.
//                 Update flight information.
//                 Reserve a seat on a flight.
//                 Cancel a flight reservation.
//                 Check-in for a flight.
//                 Calculate total revenue from flight bookings.
// Generate a report of all flights.
//                 Sort flights by flight number, departure time, or destination.
//                 Calculate total number of flights.
//                 Calculate passenger occupancy rate.
//                 Display flight duration.
//                 Display available seats.
public class Flight {
    // private String Flightname;

    private int flightid[] = new int[5];

    public void AddFlight(int ft[]) {
        for (int i = 0; i < flightid.length; i++) {
            flightid[i] = ft[i];
        }
    }

    public int getflightid() {
        for (int i = 0; i < flightid.length; i++) {
            return flightid[i];
        }
    }

    // private

}
