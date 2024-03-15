package hus.oop.lab4.book21;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book() {
        qty = 0;
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
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

    public String getAuthorEmail() {
        return this.author.getEmail();
    }

    public char getAuthorGender() {
        return this.author.getGender();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Book[name = " + name + ", " + author
                + ", price = " + price + ", qty = " + qty + "]";
    }
}
