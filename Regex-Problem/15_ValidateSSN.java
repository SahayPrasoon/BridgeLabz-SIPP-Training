public class ValidateSSN {
    public static void main(String[] args) {
        String regex = "^(\\d{3}-\\d{2}-\\d{4})$";
        String[] tests = {"123-45-6789", "123456789"};
        for (String t : tests) {
            System.out.println(t + " -> " + t.matches(regex));
        }
    }
}