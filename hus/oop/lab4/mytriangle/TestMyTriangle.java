package hus.oop.lab4.mytriangle;

import hus.oop.lab4.point.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(3, 3);
        MyPoint v2 = new MyPoint(6, 6);
        MyPoint v3 = new MyPoint(8, 8);

        MyTriangle triangle1 = new MyTriangle(v1, v2, v3);
        System.out.println(triangle1);
        System.out.println("Perimeter is: " + triangle1.getPerimeter());
        System.out.println("Type is: " + triangle1.getType());

        MyTriangle triangle2 = new MyTriangle(1, 1, 2, 2, 3, 3);
        System.out.println(triangle2);
        System.out.println("Perimeter is: " + triangle2.getPerimeter());
        System.out.println("Type is: " + triangle2.getType());

    }
}
