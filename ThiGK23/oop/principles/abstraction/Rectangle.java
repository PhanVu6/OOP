package oop.principles.abstraction;

// Lớp con 2 kế thừa từ lớp trừu tượng Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Override phương thức calculateArea() cho lớp Rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }

    // Override phương thức calculatePerimeter() cho lớp Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
