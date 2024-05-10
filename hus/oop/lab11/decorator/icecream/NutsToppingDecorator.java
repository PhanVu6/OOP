package lab11.decorator.icecream;

public class NutsToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return "[" + iceCream.getDescription() + ", Topping: " + addTopping() + "]\n";
    }

    public String addTopping() {
        return "Nuts";
    }
}
