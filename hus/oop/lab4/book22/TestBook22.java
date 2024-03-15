package hus.oop.lab4.book22;

public class TestBook22 {
    public static void main(String[] args) {
        // Khai báo và cấp phát một mảng các tác giả
        Author22[] authors = new Author22[2];
        authors[0] = new Author22("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author22("Paul Tan", "Paul@nowhere.com", 'm');

        // Khai báo và cấp phát một thể hiện Book
        Book22 javaDummy = new Book22("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()

    }
}
