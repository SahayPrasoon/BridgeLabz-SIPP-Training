import java.util.Scanner;
public class FrequecyCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long number = sc.nextLong();
		
		if(number <0) {
			number = -number;
		}
		int[] frequency = new int[10];
		
		while(number >0) {
			int digit = (int)(number%10);
			frequency[digit]++;
			number = number/10;
		}
		for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
	}
	}
}
