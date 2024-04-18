package hus.oop.bookmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new LinkedList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    /**
     * Phương thức kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay
     * không.
     * 
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        return index >= 0 && index < limit;
    }

    /**
     * Thêm book vào cuối danh sách.
     * 
     * @param book
     */
    public void append(Book book) {
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * 
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
        checkBoundaries(index, bookList.size());
        bookList.add(index, book);
    }

    /**
     * Xóa book ở vị trí index.
     * 
     * @param index
     */
    public void remove(int index) {
        checkBoundaries(index, bookList.size());
        bookList.remove(index);
    }

    /**
     * Bỏ book như tham số truyền vào.
     * 
     * @param book
     */
    public void remove(Book book) {
        if (bookList.contains(book)) {
            bookList.remove(book);
        }
    }

    /**
     * Lấy ra book ở vị trí index
     * 
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        checkBoundaries(index, bookList.size());
        return bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự tăng dần theo genre và sau đó đến title.
     * 
     * @return
     */
    public List<Book> sortIncreasingByGenreAndTitle() {
        List<Book> newBookList = new ArrayList<Book>(bookList);
        Book temp = null;

        for (int i = 0; i < newBookList.size() - 1; i++) {
            for (int j = i + 1; j < newBookList.size(); j++) {
                if (bookAt(i).compareTo(bookAt(j)) == 1) {
                    temp = newBookList.get(i);
                    newBookList.set(i, newBookList.get(j));
                    newBookList.set(j, temp);
                }
            }
        }
        return newBookList;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre tăng dần, nếu genre như nhau
     * thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * 
     * @return
     */
    public List<Book> sortIncreasingGenreAndPrice() {
        List<Book> newBookList = new ArrayList<Book>(bookList);
        MyBookComparator genreComparator = new GenreComparator();
        MyBookComparator priceComparator = new PriceComparator();
        Collections.sort(newBookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (genreComparator.compare(o1, o2) != 0) {
                    return genreComparator.compare(o1, o2);
                }
                return -priceComparator.compare(o1, o2);
            }
        });

        return newBookList;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre giảm dần, nếu genre như nhau
     * thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * 
     * @return
     */
    public List<Book> sortDecreasingGenreAndPrice() {
        List<Book> newBookList = new ArrayList<Book>(bookList);
        MyBookComparator genreComparator = new GenreComparator();
        MyBookComparator priceComparator = new PriceComparator();
        Collections.sort(newBookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (genreComparator.compare(o1, o2) != 0) {
                    return -genreComparator.compare(o1, o2);
                }
                return -priceComparator.compare(o1, o2);
            }
        });

        return newBookList;
    }

    /**
     * Sắp xếp sách theo giá tăng dần.
     * 
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        List<Book> newBookList = new ArrayList<Book>(bookList);
        MyBookComparator priceComparator = new PriceComparator();
        Collections.sort(newBookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return priceComparator.compare(o1, o2);
            }
        });
        return newBookList;
    }

    /**
     * Sắp xếp sách theo giá giảm dần.
     * 
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        List<Book> newBookList = new ArrayList<Book>(bookList);
        MyBookComparator priceComparator = new PriceComparator();
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return priceComparator.compare(o1, o2);
            }
        };
        Collections.sort(newBookList, comparator.reversed());
        return newBookList;
    }

    /**
     * Sắp xếp sách theo số trang tăng dần.
     * 
     * @return
     */
    public List<Book> sortIncreasingPages() {
        List<Book> newBookList = new ArrayList<Book>(bookList);
        MyBookComparator pageComparator = new PageComparator();
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return pageComparator.compare(o1, o2);
            }
        };
        Collections.sort(newBookList, comparator);
        return newBookList;
    }

    /**
     * Sắp xếp sách theo số trang giảm dần.
     * 
     * @return
     */
    public List<Book> sortDecreasingPages() {
        List<Book> newBookList = new ArrayList<Book>(bookList);
        MyBookComparator pageComparator = new PageComparator();
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return pageComparator.compare(o1, o2);
            }
        };
        Collections.sort(newBookList, comparator.reversed());
        return newBookList;
    }

    public List<Book> filterBooksHighestPrice(int howMany) {
        List<Book> newBookList = new LinkedList<Book>(bookList);
        List<Book> filterBook = new LinkedList<Book>();
        MyBookComparator priceComparator = new PriceComparator();
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return priceComparator.compare(o1, o2);
            }
        };
        Collections.sort(newBookList, comparator.reversed());

        for (int i = 0; i < howMany; i++) {
            filterBook.add(newBookList.get(i));
        }
        return filterBook;
    }

    public List<Book> filterBooksLowestPrice(int howMany) {
        List<Book> newBookList = new LinkedList<Book>(bookList);
        List<Book> filterBook = new LinkedList<Book>();
        MyBookComparator priceComparator = new PriceComparator();
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return priceComparator.compare(o1, o2);
            }
        };
        Collections.sort(newBookList, comparator);

        for (int i = 0; i < howMany; i++) {
            filterBook.add(newBookList.get(i));
        }
        return filterBook;
    }

    /**
     * Lọc ra howMany sách có số trang lớn nhất.
     * 
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPages(int howMany) {
        List<Book> newBookList = new ArrayList<Book>(bookList);
        List<Book> filterBook = new ArrayList<Book>();
        MyBookComparator pageComparator = new PageComparator();
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return pageComparator.compare(o1, o2);
            }
        };
        Collections.sort(newBookList, comparator.reversed());

        for (int i = 0; i < howMany; i++) {
            filterBook.add(bookAt(i));
        }
        return filterBook;
    }

    /**
     * Lọc ra những sách có số trang cao hơn lowerBound.
     * 
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPagesHigherThan(double lowerBound) {
        List<Book> newBookList = new ArrayList<Book>(bookList);
        List<Book> filterBook = new ArrayList<Book>();
        for (int i = 0; i < newBookList.size(); i++) {
            if (bookAt(i).getPages() > lowerBound) {
                filterBook.add(bookAt(i));
            }
        }
        return filterBook;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ nhất.
     * 
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        List<Book> newBookList = new LinkedList<Book>(bookList);
        List<Book> filterBook = new LinkedList<Book>();
        MyBookComparator pageComparator = new PageComparator();
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return pageComparator.compare(o1, o2);
            }
        };
        Collections.sort(newBookList, comparator);

        for (int i = 0; i < howMany; i++) {
            filterBook.add(bookAt(i));
        }
        return filterBook;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ hơn upperBound.
     * 
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        List<Book> newBookList = new ArrayList<Book>(bookList);
        List<Book> filterBook = new ArrayList<Book>();
        for (int i = 0; i < newBookList.size(); i++) {
            if (bookAt(i).getPages() < upperBound) {
                filterBook.add(bookAt(i));
            }
        }
        return filterBook;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     * 
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        List<Book> newBookList = new ArrayList<Book>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookAt(i).getPublisher().equals(publisher)) {
                newBookList.add(bookAt(i));
            }

        }
        return newBookList;

    }

    /**
     * Lọc ra những sách theo thể loại.
     * 
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        List<Book> newBookList = new ArrayList<Book>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookAt(i).getGenre().equals(genre)) {
                newBookList.add(bookAt(i));
            }

        }
        return newBookList;
    }

    /**
     * Lọc ra những sách theo tác giả.
     * 
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        List<Book> newBookList = new ArrayList<Book>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookAt(i).getAuthor().equals(author)) {
                newBookList.add(bookAt(i));
            }

        }
        return newBookList;
    }

    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        for (Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
    }
}
