class Vehicle {
    
    static double registrationFee = 5000.0; 

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }
    final String registrationNumber;

    
    String ownerName;
    String vehicleType;

    
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

   
    void displayRegistrationDetails() {
        System.out.println("\n--- Vehicle Registration Details ---");
        System.out.println("Owner Name         : " + ownerName);
        System.out.println("Vehicle Type       : " + vehicleType);
        System.out.println("Registration No.   : " + registrationNumber);
        System.out.println("Registration Fee   : ₹" + registrationFee);
    }

    
    static void processVehicle(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            v.displayRegistrationDetails();
        } else {
            System.out.println("Invalid object. Not a Vehicle.");
        }
    }
}
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
     
        Vehicle v1 = new Vehicle("Aditya", "Car", "UP12AB1234");
        Vehicle v2 = new Vehicle("Anshu", "Scooter", "UP45XY5678");

        Vehicle.processVehicle(v1);
        Vehicle.processVehicle(v2);

        String notAVehicle = "I am just a string!";
        Vehicle.processVehicle(notAVehicle);

        Vehicle.updateRegistrationFee(6000.0);

        Vehicle.processVehicle(v1);
    }
}
