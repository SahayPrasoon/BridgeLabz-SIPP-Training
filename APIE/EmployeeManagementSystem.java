
import java.util.*;

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String dept) { this.department = dept; }
    public String getDepartmentDetails() { return department; }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    public void assignDepartment(String dept) { this.department = dept; }
    public String getDepartmentDetails() { return department; }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 50000);
        fte.assignDepartment("HR");
        PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 200, 20);
        pte.assignDepartment("IT");

        employees.add(fte);
        employees.add(pte);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Calculated Salary: " + e.calculateSalary());
        }
    }
}
