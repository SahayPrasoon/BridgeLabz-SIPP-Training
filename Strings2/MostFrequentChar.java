import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c))
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Most Frequent Character: '" + maxChar + "'");
    }
}