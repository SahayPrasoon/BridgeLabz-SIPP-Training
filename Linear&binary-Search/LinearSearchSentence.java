public class LinearSearchSentence {
    public static String searchSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {"Java is great", "I love programming", "Hello World"};
        System.out.println(searchSentence(sentences, "love"));
    }
}
