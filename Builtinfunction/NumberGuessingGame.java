import java.util.Scanner;

public class NumberGuessingGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int low = 1, high = 100;
        String feedback;
        System.out.println("Think of a number between 1 and 100...");

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is it " + guess + "? (high/low/correct): ");
            feedback = scanner.next();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Yay! Guessed correctly.");
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    static int generateGuess(int low, int high) {
        return low + (high - low) / 2;
    }
}