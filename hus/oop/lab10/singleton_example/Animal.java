package singleton_example;

public class Animal {
    private static Animal types;
    private String sound;

    private Animal() {
        sound = "Woop";
    }

    public static Animal getInstance() {
        if (types == null) {
            System.out.println("Creating initally by dog");
            return types = new Animal();
        }
        return types;
    }

    public void cat() {
        sound = "Meoo";
    }

    public void dog() {
        sound = "Woop";
    }

    public String getSound() {
        return sound;
    }
}
