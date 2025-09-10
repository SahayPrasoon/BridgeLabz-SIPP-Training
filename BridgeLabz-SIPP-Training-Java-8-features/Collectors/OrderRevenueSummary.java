
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Order {
    String customer;
    double total;

    Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 250.5),
            new Order("Bob", 300.0),
            new Order("Alice", 150.0)
        );

        Map<String, Double> revenuePerCustomer = orders.stream()
            .collect(groupingBy(o -> o.customer, summingDouble(o -> o.total)));

        revenuePerCustomer.forEach((customer, total) -> System.out.println(customer + " -> " + total));
    }
}
