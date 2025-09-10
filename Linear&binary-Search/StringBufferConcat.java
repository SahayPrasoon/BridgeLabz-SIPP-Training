public class StringBufferConcat {
    public static String concatenate(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Java", " ", "is", " ", "fun"};
        System.out.println("Concatenated: " + concatenate(words));
    }
}
