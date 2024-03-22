package hus.oop.lab6.animal;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Animal[name = %s]", name);
    }
}
