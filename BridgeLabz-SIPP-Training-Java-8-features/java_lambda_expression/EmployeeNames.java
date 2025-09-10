import java.util.*;

public class EmployeeNames {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Alice", "Bob", "Charlie");

        employees.stream()
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
    }
}
