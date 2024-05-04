package singleton_example;

public class TestMain {
    public static void main(String[] args) {
        Animal soundAnimal = Animal.getInstance();
        System.out.println(soundAnimal.getSound());
        soundAnimal.cat();

        Animal soAnimal2 = Animal.getInstance();
        System.out.println(soAnimal2.getSound());

    }
}
