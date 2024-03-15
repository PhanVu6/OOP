package hus.oop.lab4.book22;

public class Author22 {
    private String name;
    private String email;
    private char gender;

    public Author22(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Author[name = " + name + ", email = " + email + ", gender = " + gender + "]";
    }
}
