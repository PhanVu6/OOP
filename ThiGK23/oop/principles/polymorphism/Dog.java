package oop.principles.polymorphism;

// Lớp con 1 kế thừa từ lớp Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
