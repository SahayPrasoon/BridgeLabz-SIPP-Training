import java.util.Scanner;

public class TableMultiplication
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

       
        int[] multiplicationResult = new int[10];

       
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }

        
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
        }

        scanner.close();
    }
}
