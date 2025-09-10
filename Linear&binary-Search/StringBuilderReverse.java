public class StringBuilderReverse {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reversed: " + reverse(str));
    }
}
