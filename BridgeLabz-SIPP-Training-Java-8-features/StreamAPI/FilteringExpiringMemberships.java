
import java.time.*;
import java.util.*;
import java.util.stream.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class FilteringExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("John", LocalDate.now().plusDays(10)),
            new Member("Alice", LocalDate.now().plusDays(40)),
            new Member("Bob", LocalDate.now().plusDays(20))
        );

        LocalDate today = LocalDate.now();
        members.stream()
               .filter(m -> !m.expiryDate.isAfter(today.plusDays(30)))
               .forEach(m -> System.out.println(m.name + " expires on " + m.expiryDate));
    }
}
