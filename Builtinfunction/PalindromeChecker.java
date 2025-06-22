import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = getInput();
        boolean isPalin = isPalindrome(input);
        showResult(input, isPalin);
    }

    static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    static void showResult(String str, boolean result) {
        System.out.println(str + " is " + (result ? "" : "not ") + "a palindrome.");
    }
}