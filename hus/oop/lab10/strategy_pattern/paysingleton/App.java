package strategy_pattern.paysingleton;

import java.io.IOException;

/**
 * World's first console e-commerce application.
 */
public class App {
    public static void main(String[] args) {
        SingletonPay singletonPay = SingletonPay.getInstance();
        try {
            singletonPay.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
