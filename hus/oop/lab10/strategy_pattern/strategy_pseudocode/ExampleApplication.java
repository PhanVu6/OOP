package strategy_pattern.strategy_pseudocode;

import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner inp = new Scanner(System.in);
        System.out.println("Input first number");
        int a = inp.nextInt();
        System.out.println("Input last number");
        int b = inp.nextInt();
        System.out.println("Please, select a action:\n" +
                "1 - addition\n" +
                "2 - subtraction\n" +
                "3 - multiplication\n");
        int action = inp.nextInt();

        if (action == 1) {
            context.setStrategy(new ConcreteStrategyAdd());
        }
        if (action == 2) {
            context.setStrategy(new ConcreteStrategySubtract());
        }
        if (action == 3) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }
        System.err.println("Result: " + context.executeStrategy(a, b));

    }
}
