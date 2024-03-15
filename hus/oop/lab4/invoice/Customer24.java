package hus.oop.lab4.invoice;

public class Customer24 {
    private int id;
    private String name;
    private int discount;

    public Customer24(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s(%d)(%d%%)", name, id, discount);
    }
}
