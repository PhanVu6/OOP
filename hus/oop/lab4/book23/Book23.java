package hus.oop.lab4.book23;

public class Book23 {
    private String isbn;
    private String name;
    private Author23 author;
    private double price;
    private int qty;

    public Book23() {
        qty = 0;
    }

    public Book23(String isbn, String name, Author23 author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book23(String isbn, String name, Author23 author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author23 getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return this.author.getName();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Book[isbn = " + isbn + ", name = " + name + ", " + author
                + ", price = " + price + ", qty = " + qty + "]";
    }
}
