package hus.oop.lab4.account25;

public class Customer25 {
    private int id;
    private String name;
    private char gender;

    public Customer25(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s(%d)", name, id);
    }
}
