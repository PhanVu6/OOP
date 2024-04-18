package oop.principles.abstraction;

// Lớp trừu tượng (abstract class)
abstract class Shape {
    protected String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Phương thức trừu tượng để tính diện tích
    public abstract double calculateArea();

    // Phương thức trừu tượng để tính chu vi
    public abstract double calculatePerimeter();
}
