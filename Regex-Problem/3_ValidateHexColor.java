public class ValidateHexColor {
    public static void main(String[] args) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        String[] tests = {"#FFA500", "#ff4500", "#123"};
        for (String t : tests) {
            System.out.println(t + " -> " + t.matches(regex));
        }
    }
}