package strategy_pattern.paysingleton;

/**
 * PayStrategy
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}