
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 2000),
            new Claim("Vehicle", 5000),
            new Claim("Health", 3000),
            new Claim("Property", 7000)
        );

        Map<String, Double> avgClaims = claims.stream()
            .collect(groupingBy(c -> c.type, averagingDouble(c -> c.amount)));

        avgClaims.forEach((type, avg) -> System.out.println(type + " -> " + avg));
    }
}
