package hus.oop.comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ComparableTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();

        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);
        // sortMovieByVearUsingBubbleSort(list);

        System.out.println("Movies after sorting: ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }
    }

    public static void sortMovieByVearUsingBubbleSort(List<Movie> movies) {
        for (int i = 0; i < movies.size() - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < movies.size() - i - 1; j++) {
                if (movies.get(j).getYear() > movies.get(j + 1).getYear()) {
                    Movie temp = movies.get(j);
                    movies.set(j, movies.get(j + 1));
                    movies.set(j + 1, temp);
                    swapped = true;
                }
            }
        }
    }

}
