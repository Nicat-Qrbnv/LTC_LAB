package lesson25.task1;

import java.util.*;

class Main {
    public static void main(String[] args) {

        IMDB imdb = new IMDB();

        imdb.addMovie("The Shawshank Redemption (1994)", Genre.DRAMA);
        imdb.addMovie("Forrest Gump (1994)", Genre.DRAMA, Genre.COMEDY);
        imdb.addMovie("The Dark Knight (2008)", Genre.ACTION, Genre.THRILLER);
        imdb.addMovie("Inception (2010)", Genre.ACTION, Genre.SCI_FI, Genre.THRILLER);
        imdb.addMovie("Pulp Fiction (1994)", Genre.DRAMA, Genre.THRILLER);
        imdb.addMovie("The Godfather (1972)", Genre.DRAMA);
        imdb.addMovie("The Matrix (1999)", Genre.ACTION, Genre.SCI_FI);
        imdb.addMovie("The Social Network (2010)", Genre.DRAMA);
        imdb.addMovie("The Grand Budapest Hotel (2014)", Genre.COMEDY, Genre.DRAMA);
        imdb.addMovie("Gone Girl (2014)", Genre.DRAMA, Genre.THRILLER);

        imdb.printMoviesOfGenre(Genre.SCI_FI);
        System.out.println ();

        //task2
        List<String> names = Arrays.asList(
                "Nigar", "Nigar",
                "Elvin",
                "Aysel",
                "Farid", "Farid",
                "Sabina",
                "Rauf",
                "Aygun",
                "Orkhan"
        );

        LinkedHashSet<String> uniques = new LinkedHashSet<>(names);
        System.out.println (names.size() + " | " + uniques + " | " + uniques.size());

    }
}
