package lesson25.task1;

import java.util.*;

class IMDB {
    private final LinkedHashMap<String, HashSet<Genre>> movies = new LinkedHashMap<>();

    public IMDB() {
    }

    public void addMovie (String movie, Genre... genre) {
        HashSet<Genre> genres = new HashSet<>(Set.of(genre));
        movies.put(movie, genres);
    }

    public void printMoviesOfGenre (Genre genre) {

        String gnr = "The found %s movies based on search: \n".formatted(genre.toString().toLowerCase());
        ArrayList<String> movieList = new ArrayList<>();
        movieList.add(gnr);

        movies.forEach((key, value) -> {
            boolean b = value.contains(genre) && movieList.add(key.indent(4));
        });

        for (String movie : movieList) {
            System.out.print (movie);
        }
    }
}
