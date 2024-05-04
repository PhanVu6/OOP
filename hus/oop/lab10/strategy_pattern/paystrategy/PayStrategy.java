package strategy_pattern.paystrategy;

/**
 * PayStrategy
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}