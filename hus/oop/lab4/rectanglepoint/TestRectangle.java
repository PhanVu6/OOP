package hus.oop.lab4.rectanglepoint;

import hus.oop.lab4.point.MyPoint;

public class TestRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 3);
        MyPoint p2 = new MyPoint(4, 0);
        MyRectangle rectangle = new MyRectangle(p1, p2);

        System.out.println("Rectangle:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Is Square: " + rectangle.isSquare());
        System.out.println(rectangle);
    }
}
