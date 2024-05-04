package strategy_pattern.strategy_example;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String credit;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String ccNum, String credit, String expiryDate) {
        this.name = name;
        this.cardNumber = ccNum;
        this.credit = credit;
        this.dateOfExpiry = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " pay with credit card");
    }

}
