package hus.oop.lab7.shape;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(shape1); // which version?
        System.out.println(shape1.getArea()); // which version?
        System.out.println(shape1.getPerimeter()); // which version?
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        // System.out.println(shape1.getRadius());
        // Because method getRadius not be created in abstract class Shape, so you can't
        // call it. We fix:
        System.out.println(((Circle) shape1).getRadius());

        if (shape1 instanceof Circle) {
            Circle circle1 = (Circle) shape1; // Downcast back to Circle
            System.out.println(circle1);
            System.out.println(circle1.getArea());
            System.out.println(circle1.getPerimeter());
            System.out.println(circle1.getColor());
            System.out.println(circle1.isFilled());
            System.out.println(circle1.getRadius());
        }

        // Shape shape2 = new Shape();
        // We can't create new constructor of abstract class.
        Shape shape3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        // System.out.println(shape3.getLength());
        // Because method getLength not be created in abstract class Shape, so you can't
        // call it. We fix:
        System.out.println(((Rectangle) shape3).getLength());

        if (shape3 instanceof Rectangle) {
            Rectangle rectangle1 = (Rectangle) shape3; // downcast
            System.out.println(rectangle1);
            System.out.println(rectangle1.getArea());
            System.out.println(rectangle1.getColor());
            System.out.println(rectangle1.getLength());
        }

        Shape shape4 = new Square(6.6); // Upcast
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
        // System.out.println(shape4.getSide());
        // Because method getSide not be created in abstract class Shape, so you can't
        // call it. We fix:
        System.out.println(((Square) shape4).getSide());

        // Note that we downcast Shape shape4 to Rectangle,
        // which is a superclass of Square, instead of Square
        if (shape4 instanceof Square) {
            Rectangle rectangle2 = (Rectangle) shape4;
            System.out.println(rectangle2);
            System.out.println(rectangle2.getArea());
            System.out.println(rectangle2.getColor());
            // System.out.println(rectangle2.getSide());
            // Because method getSide not be created in superclass Rectangle, so you can't
            // call it.
            System.out.println(rectangle2.getLength());

            // Downcast Rectangle rectangle2 to Square
            if (rectangle2 instanceof Rectangle) {
                Square square1 = (Square) rectangle2;
                System.out.println(square1);
                System.out.println(square1.getArea());
                System.out.println(square1.getColor());
                System.out.println(square1.getSide());
                System.out.println(square1.getLength());
            }
        }

        /*
         * Question: What is the usage of the abstract method and abstract class?
         * 
         * Answer:
         * Abstract Class is:
         * - An abstract class is a class that cannot be instantiated on its own.
         * - It typically contains one or more abstract methods.
         * - Abstract classes are meant to serve as base classes for other classes to
         * inherit from.
         * - They can contain both abstract and non-abstract methods.
         * 
         * Abstract method:
         * - The purpose is to outline a specific functionality that must be implemented
         * by subclasses
         * that inherit from the abstract class.
         * - An abstract method is a method declared without an implementation (body).
         * It only has a signature specifying the return type and parameters.
         * - Abstract methods cannot be used directly and are essentially forcing
         * subclasses to
         * provide their own version of the functionality.
         */

    }

}
