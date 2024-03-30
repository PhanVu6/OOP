package hus.oop.lab7.animal16;

public class TestMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Meo");
        cat1.greets();
        Dog dog1 = new Dog("Gau");
        dog1.greets();
        BigDog bigDog1 = new BigDog("GoGo");
        bigDog1.greets();

        Animal animal1 = new Cat("Meo2");
        animal1.greets();
        Animal animal2 = new Dog("Gau2");
        animal2.greets();
        Animal animal3 = new BigDog("GoGo2");
        animal3.greets();

        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        // Cat cat2 = (Cat) animal2;
        // Because class Cat unconnected Dog (or unconnected is-a), so it errors
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}
