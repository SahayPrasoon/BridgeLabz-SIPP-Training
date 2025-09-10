
import java.util.function.Predicate;
import java.util.function.Function;

class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        Predicate<Double> temperatureAlert = temp -> temp > 30.0;
        System.out.println("Temperature alert: " + temperatureAlert.test(32.5));

        Function<String, Integer> lengthChecker = str -> str.length();
        System.out.println("Message length: " + lengthChecker.apply("Hello World"));

        Runnable backgroundJob = () -> System.out.println("Background job is running...");
        new Thread(backgroundJob).start();
    }
}
