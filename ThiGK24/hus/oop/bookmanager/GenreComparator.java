package hus.oop.bookmanager;

public class GenreComparator implements MyBookComparator {

    @Override
    public int compare(Book left, Book right) {
        return left.getGenre().compareTo(right.getGenre());
    }

}
