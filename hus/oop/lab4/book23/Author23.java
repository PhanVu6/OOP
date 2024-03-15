package hus.oop.lab4.book23;

public class Author23 {
    private String name;
    private String email;

    public Author23(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Author[name = " + name + ", email = " + email + "]";
    }
}
