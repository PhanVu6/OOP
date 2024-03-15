package hus.oop.lab4.invoice;

public class Invoice {
    private int id;
    private Customer24 customer;
    private double amount;

    public Invoice(int id, Customer24 customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer24 getCustomer() {
        return customer;
    }

    public void setCustomer(Customer24 customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return this.customer.getId();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        this.amount *= (1 - getCustomerDiscount() * 0.01);
        return this.amount;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Invoice[id = %d, customer = %s, amount = %.1f]", id, customer, amount);
    }
}
