package oop.principles.polymorphism;

// Lớp con 2 kế thừa từ lớp Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
