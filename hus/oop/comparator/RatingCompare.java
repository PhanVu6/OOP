package hus.oop.comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        return left.getYear() - right.getYear();
    }
}
