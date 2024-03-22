package hus.oop.lab6.compositioncircleandcylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Color: " + circle.getColor());
        System.out.println();
        Circle circle1 = new Circle(3.0);
        System.out.println(circle1);
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println("Color: " + circle1.getColor());
        System.out.println();
        Circle circle2 = new Circle(3.0, "blue");
        System.out.println(circle2);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        System.out.println("Color: " + circle2.getColor());
    }
}
