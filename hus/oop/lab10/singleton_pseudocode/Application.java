package singleton_pseudocode;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        System.out.println(foo.query("Phan Minh Vu"));

        Database bar = Database.getInstance();
        System.out.println(bar.query("bar Phan Minh Vu"));

    }
}
