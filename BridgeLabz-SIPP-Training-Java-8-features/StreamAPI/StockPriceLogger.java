
import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(120.5, 130.0, 125.5);
        stockPrices.forEach(price -> System.out.println("Stock Price: " + price));
    }
}
