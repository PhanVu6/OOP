package hus.oop.lab4.account25;

public class Account25 {
    private int id;
    private Customer25 customer;
    private double balance;

    public Account25(int id, Customer25 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account25(int id, Customer25 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer25 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s balance = $%.2f", customer, balance);
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public Account25 deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account25 withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
