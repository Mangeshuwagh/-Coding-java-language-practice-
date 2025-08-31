import java.util.Scanner;

class Vahical {
    public String Vahical_Model;
    public String Registration_Number;
    public double vahicalSpped;
    public double Fuel_capacity;
    public double Fuel_Consumption;

    public Vahical(String Vahical_Model, String Registration_Number, double vahicalSpped, double Fuel_capacity,
            double Fuel_Consumption) {
        this.Fuel_Consumption = Fuel_Consumption;
        this.Fuel_capacity = Fuel_capacity;
        this.Vahical_Model = Vahical_Model;
        this.Registration_Number = Registration_Number;
        this.vahicalSpped = vahicalSpped;
    }

    public void setVahicalModel(String Vahical_Model) {
        this.Vahical_Model = Vahical_Model;
    }

    public String getVahicalModel() {
        return Vahical_Model;
    }

    public void setRegistration_Number(String registration_Number) {
        Registration_Number = registration_Number;
    }

    public String getRegistration_Number() {
        return Registration_Number;
    }

    public void setFuel_Consumption(double fuel_Consumption) {
        Fuel_Consumption = fuel_Consumption;
    }

    public double getFuel_Consumption() {
        return Fuel_Consumption;
    }

    public void setFuel_capacity(double fuel_capacity) {
        Fuel_capacity = fuel_capacity;
    }

    public double getFuel_capacity() {
        return Fuel_capacity;
    }

    public void setVahicalSpped(double vahicalSpped) {
        this.vahicalSpped = vahicalSpped;
    }

    public double getVahicalSpped() {
        return vahicalSpped;
    }

    public double fuelNeeded(double Distance) {
        return Distance / Fuel_Consumption;
    }

    public double distanceCovered(double time) {
        return vahicalSpped * time;
    }

    public void display() {
        System.out.println("Vahical Model: " + Vahical_Model);
        System.out.println("Vahical Registration: " + Registration_Number);
        System.out.println("Vahical Speed: " + vahicalSpped);
        System.out.println("Vahical Fuel Capacity: " + Fuel_capacity);
        System.out.println("Vahical Fuel Consumption: " + Fuel_Consumption);
    }
}

class Truck extends Vahical {
    public double CargoWeigthlimit;

    public Truck(String Vahical_Model, String Registration_Number, double vahicalSpped, double Fuel_capacity,
            double Fuel_Consumption, double CargoWeigthlimit) {
        super(Vahical_Model, Registration_Number, vahicalSpped, Fuel_capacity, Fuel_Consumption);
        this.CargoWeigthlimit = CargoWeigthlimit;
    }

    public void setCargoWeigthlimit(double CargoWeigthlimit) {
        this.CargoWeigthlimit = CargoWeigthlimit;
    }

    public double getCargoWeigthlimit() {
        return CargoWeigthlimit;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Cargo Weight Limit: " + CargoWeigthlimit);
    }
}

class Bus extends Vahical {
    public int NoOfPassenger;

    public Bus(String Vahical_Model, String Registration_Number, double vahicalSpped, double Fuel_capacity,
            double Fuel_Consumption, int NoOfPassenger) {
        super(Vahical_Model, Registration_Number, vahicalSpped, Fuel_capacity, Fuel_Consumption);
        this.NoOfPassenger = NoOfPassenger;
    }

    public void setNoOfPassenger(int NoOfPassenger) {
        this.NoOfPassenger = NoOfPassenger;
    }

    public int getNoOfPassenger() {
        return NoOfPassenger;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("No of Passengers: " + NoOfPassenger);
    }
}

public class Que1Transport {
    public static void main(String[] args) {
        String Vahical_Model, Registration_Number;
        double Fuel_capacity, Fuel_Consumption, vahicalSpped;
        double CargoWeigthlimit;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the Truck Model Number");
        Vahical_Model = cin.nextLine();
        System.out.println("Enter the Truck Registration Number: ");
        Registration_Number = cin.nextLine();
        System.out.println("Enter the Fuel Capacity: ");
        Fuel_capacity = cin.nextDouble();
        System.out.println("Enter the Fuel Consumption: ");
        Fuel_Consumption = cin.nextDouble();
        System.out.println("Enter the Vahical Speed: ");
        vahicalSpped = cin.nextDouble();
        System.out.println("Enter Cargo Weight Limit: ");
        CargoWeigthlimit = cin.nextDouble();

        Truck tr = new Truck(Vahical_Model, Registration_Number, vahicalSpped, Fuel_capacity, Fuel_Consumption,
                CargoWeigthlimit);
        tr.setCargoWeigthlimit(CargoWeigthlimit);
        System.out.println("_____________________________________________________________");

        double Result = tr.fuelNeeded(100);
        double result1 = tr.distanceCovered(6);
        tr.display();
        System.out.println("Fuel Needed by Truck: " + Result);
        System.out.println("Distance Covered by Truck: " + result1);

        System.out.println("_________________________________________________________________________");

        Bus bu = new Bus("Manges!22", "Ujsdh888", 60.00, 73, 89, 90);
        double n = bu.distanceCovered(7);
        double j = bu.fuelNeeded(78);
        bu.display();
        System.out.println("Fuel Needed by Bus: " + j);
        System.out.println("Distance Covered by Bus: " + n);

        cin.close();
    }
}
