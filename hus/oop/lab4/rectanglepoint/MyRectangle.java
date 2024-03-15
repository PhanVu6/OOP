package hus.oop.lab4.rectanglepoint;

import hus.oop.lab4.point.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getWidth() {
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }

    public double getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public boolean isSquare() {
        return getWidth() == getHeight();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
