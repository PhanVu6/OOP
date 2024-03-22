package hus.oop.lab6.personclass;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Person[name = %s, address = %s]", name, address);
    }
}
