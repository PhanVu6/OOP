package hus.oop.lab6.animal;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Cat[%s]", super.toString());
    }

}
