
import java.util.*;

public class IoTSensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(50, 75, 30, 90);
        int threshold = 60;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("Reading above threshold: " + r));
    }
}
