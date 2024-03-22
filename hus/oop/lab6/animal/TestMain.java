package hus.oop.lab6.animal;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Pet");
        System.out.println(animal);

        Mammal mammal = new Mammal("Orange");
        System.out.println(mammal);

        System.out.println();
        Cat cat = new Cat("Dog");
        System.out.println(cat);
        System.out.println("greet: ");
        cat.greets();

        System.out.println();
        Dog dog = new Dog("Cat");
        Dog subdog = new Dog("Pig");
        System.out.println(dog);
        System.out.println("greet: ");
        dog.greets();
        dog.greets(subdog);
    }

}
