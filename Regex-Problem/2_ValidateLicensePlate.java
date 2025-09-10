public class ValidateLicensePlate {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}\\d{4}$";
        String[] tests = {"AB1234", "A12345"};
        for (String t : tests) {
            System.out.println(t + " -> " + t.matches(regex));
        }
    }
}