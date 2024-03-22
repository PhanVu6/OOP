package hus.oop.lab6.animal;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Mammal[%s]", super.toString());
    }
}
