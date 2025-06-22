import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (C/F)? ");
        char choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            System.out.println("Result: " + toCelsius(temp) + "°C");
        } else {
            System.out.println("Result: " + toFahrenheit(temp) + "°F");
        }
    }

    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}