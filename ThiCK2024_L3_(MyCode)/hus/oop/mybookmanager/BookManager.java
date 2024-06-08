package hus.oop.mybookmanager;

public class BookManager {
    private static BookManager instance;
    private MyList bookList;

    private BookManager() {
        bookList = new MyLinkedList();
    }

    public static BookManager getInstance() {
        if (instance == null) {
            return instance = new BookManager();
        }
        return instance;
    }

    public MyList getBookList() {
        return bookList;
    }

    /**
     * Thêm book vào đầu danh sách.
     * 
     * @param book
     */
    public void insertAtStart(Book book) {
        bookList.insertAtStart(book);
    }

    /**
     * Thêm book vào cuối danh sách.
     * 
     * @param book
     */
    public void insertAtEnd(Book book) {
        bookList.insertAtEnd(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * 
     * @param book
     * @param index
     */
    public void insertAPosition(Book book, int index) {
        bookList.insertAtPosition(book, index);
    }

    /**
     * Xóa book ở vị trí index.
     * 
     * @param index
     */
    public void remove(int index) {
        bookList.remove(index);
    }

    /**
     * Lấy ra book ở vị trí index
     * 
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        Book currentNode = null;
        MyIterator iterator =  bookList.iterator(0);
        for (int i = 0; i <= index; i++) {
            currentNode = (Book) iterator.next();
        }
        return currentNode;
    }

    /**
     * Lấy ra sách có giá cao nhất.
     * 
     * @return
     */
    public Book highestPriceBook() {
        Book bookMaxPrice = bookAt(0);

        for (int i = 1; i < bookList.size(); i++) {
            if (bookAt(i).getPrice() > bookMaxPrice.getPrice()) {
                bookMaxPrice = bookAt(i);
            }
        }

        return bookMaxPrice;
    }

    /**
     * Lấy ra sách có giá thấp nhất.
     * 
     * @return
     */
    public Book lowestPriceBook() {
        Book bookMinPrice = bookAt(0);

        for (int i = 1; i < bookList.size(); i++) {
            if (bookAt(i).getPrice() < bookMinPrice.getPrice()) {
                bookMinPrice = bookAt(i);
            }
        }

        return bookMinPrice;
    }

    /**
     * Lấy ra sách có số trang cao nhất.
     * 
     * @return
     */
    public Book highestNumberOfPagesBook() {
        Book bookMaxPages = bookAt(0);

        for (int i = 1; i < bookList.size(); i++) {
            if (bookAt(i).getPages() > bookMaxPages.getPages()) {
                bookMaxPages = bookAt(i);
            }
        }

        return bookMaxPages;
    }

    /**
     * Lấy ra sách có số trang thấp nhất.
     * 
     * @return
     */
    public Book lowestNumberOfPagesBook() {
        Book bookMinPages = bookAt(0);

        for (int i = 1; i < bookList.size(); i++) {
            if (bookAt(i).getPages() < bookMinPages.getPages()) {
                bookMinPages = bookAt(i);
            }
        }

        return bookMinPages;
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * 
     * @param publisher
     * @return
     */
    public MyList filterBooksOfPublisher(String publisher) {
        MyList bookOfPublisher = new MyLinkedList();

        for (int i = 1; i < bookList.size(); i++) {
            if (bookAt(i).getPublisher().equals(publisher)) {
                bookOfPublisher.insertAtEnd(bookAt(i));
            }
        }

        return bookOfPublisher;
    }

    /**
     * Lọc ra những book theo thể loại.
     * 
     * @param genre
     * @return
     */
    public MyList filterBooksOfGenre(String genre) {
        MyList bookOfGenre = new MyLinkedList();

        for (int i = 1; i < bookList.size(); i++) {
            if (bookAt(i).getGenre().equals(genre)) {
                bookOfGenre.insertAtEnd(bookAt(i));
            }
        }

        return bookOfGenre;
    }

    /**
     * Lọc ra những book theo tác giả.
     * 
     * @param author
     * @return
     */
    public MyList filterBooksOfAuthor(String author) {
        MyList bookOfAuthor = new MyLinkedList();

        for (int i = 1; i < bookList.size(); i++) {
            if (bookAt(i).getAuthor().equals(author)) {
                bookOfAuthor.insertAtEnd(bookAt(i));
            }
        }

        return bookOfAuthor;
    }
}