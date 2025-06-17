import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.println("Enter number of persons:");
        int number = scanner.nextInt();

        
        double[][] personData = new double[number][3];  
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter data for Person " + (i + 1));

            double weight, height;

            while (true) {
                System.out.println("Enter weight (kg):");
                weight = scanner.nextDouble();
                if (weight > 0) break;
                System.out.println("Invalid weight! Please enter a positive value.");
            }

            while (true) {
                System.out.println("Enter height (m):");
                height = scanner.nextDouble();
                if (height > 0) break;
                System.out.println("Invalid height! Please enter a positive value.");
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height = " + personData[i][1] + " meters");
            System.out.println("Weight = " + personData[i][0] + " kg");
            System.out.println("BMI = " + personData[i][2]);
            System.out.println("Status = " + weightStatus[i]);
            System.out.println("----------------------------");
        }

        scanner.close();
    }
}
