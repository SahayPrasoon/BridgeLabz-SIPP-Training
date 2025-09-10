public class ValidateIPAddress {
    public static void main(String[] args) {
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\.|$)){4}$";
        String[] tests = {"192.168.1.1", "256.100.50.0"};
        for (String t : tests) {
            System.out.println(t + " -> " + t.matches(regex));
        }
    }
}