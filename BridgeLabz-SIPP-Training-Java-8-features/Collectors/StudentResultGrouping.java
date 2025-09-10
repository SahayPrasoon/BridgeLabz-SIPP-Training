
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentResultGrouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "A"),
            new Student("Bob", "B"),
            new Student("Charlie", "A"),
            new Student("David", "C")
        );

        Map<String, List<String>> studentsByGrade = students.stream()
            .collect(groupingBy(s -> s.grade, mapping(s -> s.name, toList())));

        studentsByGrade.forEach((grade, names) -> System.out.println(grade + " -> " + names));
    }
}
