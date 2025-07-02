
import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 5000; }
    public String getInsuranceDetails() { return "Car Insurance: Fixed 5000"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 1000; }
    public String getInsuranceDetails() { return "Bike Insurance: Fixed 1000"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 10000; }
    public String getInsuranceDetails() { return "Truck Insurance: Fixed 10000"; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1000));
        vehicles.add(new Bike("BIKE456", 500));
        vehicles.add(new Truck("TRUCK789", 3000));

        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " Rental Cost for 5 days: " + v.calculateRentalCost(5));
            Insurable insurable = (Insurable) v;
            System.out.println(insurable.getInsuranceDetails() + ", Cost: " + insurable.calculateInsurance());
        }
    }
}
