package lab11.decorator.icecream;

public abstract class ToppingDecorator {
    private IceCream iceCream;

    public abstract String getDescription();

    public abstract String addTopping();
}
