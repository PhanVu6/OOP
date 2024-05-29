package bai2;

public class BookManager {
    private MyList books;

    public BookManager(MyList books) {
        this.books = books;
    }

    public MyList sortByPageNumber(boolean ascending) {
        MyList newArr = books;
        Object temp = null;
        PagesComparator pagesComparator = new PagesComparator();

        if (ascending) {
            for (int i = 0; i < newArr.size() - 1; i++) {
                for (int j = i + 1; j < newArr.size(); j++) {
                    if (pagesComparator.compare((Book) newArr.get(i), (Book) newArr.get(j)) > 0) {
                        temp = (Book) newArr.get(i);
                        newArr.set((Book) newArr.get(j), i);
                        newArr.set(temp, j);
                    }
                }
            }
        } else {
            for (int i = 0; i < newArr.size() - 1; i++) {
                for (int j = i + 1; j < newArr.size(); j++) {
                    if (pagesComparator.compare((Book) newArr.get(i), (Book) newArr.get(j)) < 0) {
                        temp = (Book) newArr.get(i);
                        newArr.set((Book) newArr.get(j), i);
                        newArr.set(temp, j);
                    }
                }
            }
        }
        return newArr;
    }

    public MyList sortTitle(boolean ascending) {
        MyList newArr = books;
        Book temp = null;
        TitleComparator titleComparator = new TitleComparator();

        if (ascending) {
            for (int i = 0; i < newArr.size() - 1; i++) {
                for (int j = i + 1; j < newArr.size(); j++) {
                    if (titleComparator.compare((Book) newArr.get(i), (Book) newArr.get(j)) > 0) {
                        temp = (Book) newArr.get(i);
                        newArr.set((Book) newArr.get(j), i);
                        newArr.set(temp, j);
                    }
                }
            }
        } else {
            for (int i = 0; i < newArr.size() - 1; i++) {
                for (int j = i + 1; j < newArr.size(); j++) {
                    if (titleComparator.compare((Book) newArr.get(i), (Book) newArr.get(j)) < 0) {
                        temp = (Book) newArr.get(i);
                        newArr.set((Book) newArr.get(j), i);
                        newArr.set(temp, j);
                    }
                }
            }
        }
        return newArr;
    }
}
