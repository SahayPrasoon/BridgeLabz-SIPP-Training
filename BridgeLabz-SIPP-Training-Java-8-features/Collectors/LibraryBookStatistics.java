
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Book {
    String genre;
    int pages;

    Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }
}

public class LibraryBookStatistics {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Fiction", 300),
            new Book("Fiction", 250),
            new Book("Science", 400),
            new Book("Science", 350)
        );

        Map<String, IntSummaryStatistics> stats = books.stream()
            .collect(groupingBy(b -> b.genre, summarizingInt(b -> b.pages)));

        stats.forEach((genre, stat) -> {
            System.out.println(genre + " -> Total: " + stat.getSum() +
                               ", Avg: " + stat.getAverage() +
                               ", Max: " + stat.getMax());
        });
    }
}
