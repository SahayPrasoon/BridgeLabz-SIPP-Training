public class ValidateUsername {
    public static void main(String[] args) {
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        String[] tests = {"user_123", "123user", "us"};
        for (String t : tests) {
            System.out.println(t + " -> " + t.matches(regex));
        }
    }
}