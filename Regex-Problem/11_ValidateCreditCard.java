public class ValidateCreditCard {
    public static void main(String[] args) {
        String visa = "^4[0-9]{15}$";
        String mc = "^5[0-9]{15}$";
        String[] tests = {"4111111111111111", "5111111111111111", "6111111111111111"};
        for (String t : tests) {
            System.out.println(t + " Visa -> " + t.matches(visa));
            System.out.println(t + " MasterCard -> " + t.matches(mc));
        }
    }
}