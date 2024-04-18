package bai2;

public class TitleComparator implements BookCompartor {

    @Override
    public int compare(Book left, Book right) {
        return left.getTitle().compareTo(right.getTitle());
    }

}
