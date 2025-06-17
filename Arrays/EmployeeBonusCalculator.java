import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;

        double[] salary = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double yos = sc.nextDouble();

            if (sal <= 0 || yos < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; 
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yos;
        }

      
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        
        System.out.println("\n--- Bonus Report ---");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Employee " + (i + 1) +
                ": Old Salary = " + salary[i] +
                ", Years of Service = " + yearsOfService[i] +
                ", Bonus = " + bonus[i] +
                ", New Salary = " + newSalary[i]);
        }

        System.out.println("\n--- Totals ---");
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        
    }
}
