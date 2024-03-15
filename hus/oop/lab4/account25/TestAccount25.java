package hus.oop.lab4.account25;

public class TestAccount25 {
    public static void main(String[] args) {
        Customer25 customer1 = new Customer25(13, "Phan Thieu", 'm');
        System.out.println(customer1);
        System.out.println("Id is: " + customer1.getId());
        System.out.println("Name is: " + customer1.getName());
        System.out.println("Gender is: " + customer1.getGender());

        Account25 account1 = new Account25(32, customer1);
        System.out.println(account1);
        System.out.println("Id is: " + account1.getId());
        System.out.println("Customer is: " + account1.getCustomer());
        System.out.println("Balance is: " + account1.getBalance());
        System.out.println("Customer name is:" + account1.getCustomerName());
        System.out.println("Deposit is: " + account1.deposit(10));
        System.out.println("Can is withdraw: " + account1.withdraw(20));

        Account25 account2 = new Account25(32, customer1, 1000 * 1000 * 1000);
        System.out.println(account2);
        System.out.println("Id is: " + account2.getId());
        System.out.println("Customer is: " + account2.getCustomer());
        System.out.println("Balance is: " + account2.getBalance());
        System.out.println("Customer name is:" + account2.getCustomerName());
        System.out.println("Deposit is: " + account2.deposit(10));
        System.out.println("Residual amount is: " + account2.withdraw(20));

    }

}
