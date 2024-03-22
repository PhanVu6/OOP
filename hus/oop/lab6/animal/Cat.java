package hus.oop.lab6.animal;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Cat[%s]", super.toString());
    }
}
