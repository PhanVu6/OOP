package strategy_pattern.paystrategy;

import strategy_pattern.paystrategy.PayStrategy;

/**
 * Order class. Doesn’t know the concrete payment method (strategy) user has
 * picked.
 * It uses a common strategy interface to delegate collecting payment data to a
 * strategy object.
 * It can be used to save the order to a database.
 */
public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    // public void processOrderUsingPaypal(PayByPaypal paypal) {
    // paypal.collectPaymentDetails();
    // }

    // public void processOrderUsingCreditCard(PayByCreditCard creditCard) {
    // creditCard.collectPaymentDetails();
    // }

    // Strategy nên tôi chỉ tạo 1 instance dùng chung, thay vì 2 instance như trên
    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
