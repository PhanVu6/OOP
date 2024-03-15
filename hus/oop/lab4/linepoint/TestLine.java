package hus.oop.lab4.linepoint;

import hus.oop.lab4.point.MyPoint;

public class TestLine {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(3, 4);
        MyPoint point3 = new MyPoint(6, 7);
        System.out.println(point1);
        System.out.println(point2);

        MyLine line1 = new MyLine(point1, point2);
        System.out.println(line1);
        System.out.println("Begin is: " + line1.getBegin());
        line1.setBegin(point2);
        System.out.println("Begin is change: " + line1.getBegin());
        System.out.println("End is:" + line1.getEnd());
        line1.setEnd(point3);
        System.out.println("End is change: " + line1.getEnd());
        System.out.println("Begin x is: " + line1.getBeginX());
        System.out.println("Begin y is: " + line1.getBeginY());
        System.out.println("End x is: " + line1.getEndX());
        System.out.println("End y is: " + line1.getEndY());
        System.out.println("Begin (x,y) is: " + line1.getBeginXY()[0]);
        System.out.println("Begin (x,y) is: " + line1.getBeginXY()[1]);
        System.out.println("End (x,y) is: " + line1.getEndXY()[0]);
        System.out.println("End (x,y) is: " + line1.getEndXY()[1]);
        System.out.println("Length is: " + line1.getLength());
        System.out.println("Gradiant is: " + line1.getGradient());
    }

}
