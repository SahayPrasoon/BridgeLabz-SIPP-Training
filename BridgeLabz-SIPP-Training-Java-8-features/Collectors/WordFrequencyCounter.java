
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "hello world hello java world java streams";

        Map<String, Long> wordCount = Arrays.stream(paragraph.split(" "))
            .collect(groupingBy(w -> w, counting()));

        wordCount.forEach((word, count) -> System.out.println(word + " -> " + count));
    }
}
