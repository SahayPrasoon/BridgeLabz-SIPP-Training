
interface PaymentProcessor {
    void pay(double amount);
    default void refund(double amount) {
        System.out.println("Refunded " + amount);
    }
}

interface DataExporter {
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}

interface VehicleDashboard {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery info not available");
    }
}
