package lab11.decorator.icecream;

public class HoneyToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return "[" + iceCream.getDescription() + ", Topping: " + addTopping() + "]\n";
    }

    public String addTopping() {
        return "Honey";
    }

}
