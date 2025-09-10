
import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
}

public class Top5TrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie1", 8.5, 2023),
            new Movie("Movie2", 9.0, 2024),
            new Movie("Movie3", 7.8, 2022),
            new Movie("Movie4", 8.7, 2024),
            new Movie("Movie5", 8.9, 2023),
            new Movie("Movie6", 9.2, 2024)
        );

        movies.stream()
              .sorted(Comparator.comparingDouble((Movie m) -> m.rating)
                                .thenComparingInt(m -> m.releaseYear)
                                .reversed())
              .limit(5)
              .forEach(m -> System.out.println(m.name + " " + m.rating + " " + m.releaseYear));
    }
}
