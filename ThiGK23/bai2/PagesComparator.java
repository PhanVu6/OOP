package bai2;

public class PagesComparator implements BookCompartor {

    @Override
    public int compare(Book left, Book right) {
        if (left.getPages() == right.getPages()) {
            return 0;
        }
        return left.getPages() - right.getPages() > 0 ? 1 : -1;
    }

}
