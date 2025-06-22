import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneExample {
    public static void main(String[] args) {
        printTimeInZone("GMT");
        printTimeInZone("Asia/Kolkata");  // IST
        printTimeInZone("America/Los_Angeles"); // PST
    }

    static void printTimeInZone(String zone) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
        System.out.println("Current time in " + zone + ": " + time);
    }
}