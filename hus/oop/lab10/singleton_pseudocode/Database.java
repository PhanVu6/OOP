package singleton_pseudocode;

public class Database {
    private static Database instance;
    private String url;
    private int id;
    private String name;

    private Database() {
        url = "https://classroom.google.com/u/0/c/NjU4MjQwODA0NjI5/a/Njc3Njk1MjAxMjk3/details";
        id = 0;
        name = "Pham Minh H";
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public String query(String sql) {
        instance.name = sql;
        return instance.name;
    }
}
