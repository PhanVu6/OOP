package oop.principles.abstraction;

// Lớp con 1 kế thừa từ lớp trừu tượng Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Override phương thức calculateArea() cho lớp Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Override phương thức calculatePerimeter() cho lớp Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
