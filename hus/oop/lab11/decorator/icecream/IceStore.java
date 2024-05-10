package lab11.decorator.icecream;

public class IceStore {
	public static void main(String[] args) {
		ToppingDecorator iceVaniToppingHoney = new HoneyToppingDecorator(new VanillaIceCream());
		System.out.println(iceVaniToppingHoney.getDescription());

		ToppingDecorator iceStrawberryToppingNuts = new NutsToppingDecorator(new StrawberryIceCream());
		System.out.println(iceStrawberryToppingNuts.getDescription());
	}

}
