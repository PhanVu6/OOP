package hus.oop.lab4.circlepoint;

import hus.oop.lab4.point.MyPoint;

public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint center = new MyPoint();
        MyCircle circle1 = new MyCircle();
        System.out.println(circle1);
        MyCircle circle2 = new MyCircle(3, 2, 5);
        System.out.println(circle2);
        MyCircle circle3 = new MyCircle(center, 5);
        System.out.println(circle3);

        circle1.setRadius(3);
        circle1.setCenterX(4);
        circle1.setCenterY(5);
        System.out.println(circle1);

        circle1.setCenterXY(0, 2);
        System.out.println(circle1);

        System.out.println("centerx is: " + circle1.getCenterX());
        System.out.println("centery is: " + circle1.getCenterY());
        System.out.println(circle1.getCenterXY()[0]);
        System.out.println(circle1.getCenterXY()[1]);
        System.out.println("center is: " + circle1.getCenter());
        System.out.println("radius is: " + circle1.getRadius());

        System.out.printf("area is: %.2f\n", circle1.getArea());
        System.out.printf("circumference is: %.2f\n", circle1.getCircumference());
        System.out.println("distance of circle1 and circle2 is: "
                + circle1.distance(circle2));
    }
}