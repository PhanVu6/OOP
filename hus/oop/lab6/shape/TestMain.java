package hus.oop.lab6.shape;

public class TestMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("blue", true);
        System.out.println(shape1);
        System.out.println("Color: " + shape1.getColor());
        System.out.println("Fill is: " + shape1.isFilled());
        System.out.println();

        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println();

        Circle circle2 = new Circle(1.5);
        System.out.println(circle2);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        System.out.println("Color: " + circle2.getColor());
        System.out.println("Filled: " + circle2.isFilled());
        System.out.println();

        Circle circle3 = new Circle(1.5, "yellow", true);
        System.out.println(circle3);
        System.out.println("Radius: " + circle3.getRadius());
        System.out.println("Area: " + circle3.getArea());
        System.out.println("Perimeter: " + circle3.getPerimeter());
        System.out.println("Color: " + circle3.getColor());
        System.out.println("Filled: " + circle3.isFilled());
        System.out.println();

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(1.4, 5.6);
        System.out.println(rectangle2);
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println("Color: " + rectangle2.getColor());
        System.out.println("Filled: " + rectangle2.isFilled());
        System.out.println();

        Rectangle rectangle3 = new Rectangle(1.4, 5.6, "black", true);
        System.out.println(rectangle3);
        System.out.println("Length: " + rectangle3.getLength());
        System.out.println("Width: " + rectangle3.getWidth());
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());
        System.out.println("Color: " + rectangle3.getColor());
        System.out.println("Filled: " + rectangle3.isFilled());
        System.out.println();

        Square square1 = new Square();
        System.out.println(square1);

        Square square2 = new Square(1.4);
        System.out.println(square2);
        System.out.println("Side: " + square2.getSide());
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());
        System.out.println("Color: " + square2.getColor());
        System.out.println("Filled: " + square2.isFilled());
        System.out.println();

        Square square3 = new Square(1.4, "black", true);
        System.out.println(square3);
        System.out.println("Side: " + square3.getSide());
        System.out.println("Area: " + square3.getArea());
        System.out.println("Perimeter: " + square3.getPerimeter());
        System.out.println("Color: " + square3.getColor());
        System.out.println("Filled: " + square3.isFilled());
        System.out.println();
    }
}
