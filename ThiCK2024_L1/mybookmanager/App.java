package mybookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        init();
        testOriginalData();

        testFilterBooksOfAuthor();
        testFilterBooksOfGenre();
        testFilterBooksOfPublisher();

        testGetHighestNumberOfPagesBook();
        testGetHighestPriceBook();

        testGetLowestNumberOfPagesBook();
        testGetLowestPriceBook();

        /*
         * Yêu cầu:
         * - Hoàn thiện code chương trình theo mẫu đã cho.
         * - Viết code để test cho tất cả các hàm test bên dưới.
         * 
         * - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text
         * được đặt tên
         * là <TenSinhVien_MaSinhVien_MyBookManager>.txt (Ví dụ,
         * NguyenVanA_123456_MyBookManager.txt).
         * - Nén các file source code và file text kết quả chạy chương trình vào file
         * zip có tên
         * <TenSinhVien_MaSinhVien_BookMyManager>.zip (Ví dụ,
         * NguyenVanA_123456_BookMyManager.zip),
         * nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "data/books.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("title")) {
                    continue;
                }

                /*
                 * TODO
                 * Đọc được dữ liệu, tạo ra các đối tượng Book ở đây, và cho vào BookManager để
                 * quản lý.
                 * 
                 * Gợi ý:
                 * Các đội tượng Book không thể được tạo trực tiếp ở đây do hàm dựng là private,
                 * các đối tượng này được tạo ra bằng cách sử dụng Builder Pattern, ví dụ theo
                 * cách sau:
                 * Book newBook = new Book.BookBuilder(title).
                 * .withAuthor(author)
                 * .withGenre(genre)
                 * ...
                 * .build();
                 */
                String title = dataList.get(0);
                String author = dataList.get(1);
                String genre = dataList.get(2);
                int pages = Integer.parseInt(dataList.get(3));
                double price = Double.parseDouble(dataList.get(4));
                String publisher = dataList.get(5);
                Book newBook = new Book.BookBuilder(title)
                        .withAuthor(author)
                        .withGenre(genre)
                        .withPages(pages)
                        .withPrice(price)
                        .withPublisher(publisher).build();
                BookManager bookManager = BookManager.getInstance();
                bookManager.insertAtEnd(newBook);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        BookManager bookManager = BookManager.getInstance();
        MyList list = bookManager.getBookList();
        MyIterator myIterator = list.iterator();

        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }

    /**
     * Test lọc ra những book theo tác giả.
     */
    public static void testFilterBooksOfAuthor() {
        BookManager bookManager = BookManager.getInstance();
        MyList list = bookManager.filterBooksOfAuthor("Russell Bertrand");
        MyIterator myIterator = list.iterator();

        while (myIterator.hasNext()) {
            System.out.println("Book Of 'Russell Bertrand': \n" + myIterator.next());
        }
    }

    /**
     * Test lọc ra những book theo nhà xuất bản.
     */
    public static void testFilterBooksOfPublisher() {
        BookManager bookManager = BookManager.getInstance();
        MyList list = bookManager.filterBooksOfPublisher("Routledge");
        MyIterator myIterator = list.iterator();

        while (myIterator.hasNext()) {
            System.out.println("Book Of 'Routledge': \n" + myIterator.next());
        }
    }

    /**
     * Test lọc ra những book theo thể loại.
     */
    public static void testFilterBooksOfGenre() {
        BookManager bookManager = BookManager.getInstance();
        MyList list = bookManager.filterBooksOfGenre("philosophy");
        MyIterator myIterator = list.iterator();

        while (myIterator.hasNext()) {
            System.out.println("Book Of 'philosophy': \n" + myIterator.next());
        }
    }

    /**
     * Test lấy ra sách có giá cao nhất.
     */
    public static void testGetHighestPriceBook() {
        BookManager bookManager = BookManager.getInstance();
        Book maxPrice = bookManager.highestPriceBook();

        System.out.println("Highest Price Book: \n" + maxPrice);

    }

    /**
     * Test lấy ra sách có giá thấp nhất.
     */
    public static void testGetLowestPriceBook() {
        BookManager bookManager = BookManager.getInstance();
        Book minPrice = bookManager.lowestPriceBook();

        System.out.println("Lowest Price Book: \n" + minPrice);
    }

    /**
     * Test lấy ra sách có số trang cao nhất.
     */
    public static void testGetHighestNumberOfPagesBook() {
        BookManager bookManager = BookManager.getInstance();
        Book maxPages = bookManager.highestNumberOfPagesBook();

        System.out.println("Highest Number Of Pages Book: \n" + maxPages);
    }

    /**
     * Test lấy ra sách có số trang thấp nhất.
     */
    public static void testGetLowestNumberOfPagesBook() {
        BookManager bookManager = BookManager.getInstance();
        Book minPages = bookManager.lowestNumberOfPagesBook();

        System.out.println("Lowest Number Of Pages Book: \n" + minPages);
    }
}
