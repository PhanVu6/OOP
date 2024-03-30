package hus.oop.lab7.geometricobject;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject shape1 = new Circle(3.0);
        if (shape1 instanceof Circle) {
            shape1 = ((Circle) shape1);
            System.out.println(shape1);
            System.out.println("Area: " + shape1.getArea());
            System.out.println("Perimeter: " + shape1.getPerimeter());
        }

        GeometricObject shape2 = new Rectangle(3.0, 4.0);
        if (shape2 instanceof Rectangle) {
            shape2 = (Rectangle) shape2;
            System.out.println(shape2);
            System.out.println("Area: " + shape2.getArea());
            System.out.println("Perimeter: " + shape2.getPerimeter());
        }
    }
}
