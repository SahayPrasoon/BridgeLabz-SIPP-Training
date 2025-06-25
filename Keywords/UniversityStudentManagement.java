class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;

    final int rollNumber;

    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber; 
        this.grade = grade;
        totalStudents++; 
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("University : " + universityName);
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Grade      : " + grade);
    }

    
    static void updateGrade(Object obj, char newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated successfully for " + s.name);
        } else {
            System.out.println("Invalid object. Not a Student.");
        }
    }

    static void processStudent(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.displayDetails();
        } else {
            System.out.println("Invalid object. Not a Student.");
        }
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        
        Student s1 = new Student("Alice", 101, 'A');
        Student s2 = new Student("Bob", 102, 'B');

        Student.processStudent(s1);
        Student.processStudent(s2);

        Student.updateGrade(s2, 'A');

        Student.processStudent(s2);

        String notAStudent = "Test";
        Student.processStudent(notAStudent);

        Student.displayTotalStudents();
    }
}
