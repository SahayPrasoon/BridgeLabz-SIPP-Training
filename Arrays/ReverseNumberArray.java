import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a positive number:");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }
       
        int temp = number;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }
        System.out.println("Digits in reverse order:");
        for (int i = 0; i < count; i++) {
            System.out.println("Digit " + (i + 1) + ": " + reverseDigits[i]);
        }
    }
}
