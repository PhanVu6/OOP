package oop.principles.inheritance;

// Lớp con (subclass) kế thừa từ lớp Animal
class Dog extends Animal {
    public Dog(String name) {
        // Gọi constructor của lớp cha
        super(name);
    }

    // Phương thức riêng của lớp con
    public void bark() {
        System.out.println(name + " is barking.");
    }
}