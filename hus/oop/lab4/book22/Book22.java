package hus.oop.lab4.book22;

public class Book22 {
    private String name;
    private Author22[] author;
    private double price;
    private int qty;

    public Book22() {
        qty = 0;
    }

    public Book22(String name, Author22[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book22(String name, Author22[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author22[] getAuthor() {
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

    // public String getAuthorName() {
    // return this.author.getName();
    // }

    // public String getAuthorEmail() {
    // return this.author.getEmail();
    // }

    // public char getAuthorGender() {
    // return this.author.getGender();
    // }

    @Override
    public String toString() {
        String strBook = "Book[name = " + name + ", ";
        // TODO Auto-generated method stub
        for (int i = 0; i < author.length; i++) {
            strBook += author[i] + ", ";
        }
        strBook += "price = " + price + ", qty = " + qty + "]";
        return strBook;
    }
}
