
import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean availableWeekend;

    Doctor(String name, String specialty, boolean availableWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableWeekend = availableWeekend;
    }
}

public class HospitalDoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. A", "Cardiology", true),
            new Doctor("Dr. B", "Neurology", false),
            new Doctor("Dr. C", "Orthopedics", true)
        );

        doctors.stream()
               .filter(d -> d.availableWeekend)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(d -> System.out.println(d.name + " - " + d.specialty));
    }
}
