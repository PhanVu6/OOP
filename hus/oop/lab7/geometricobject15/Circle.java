package hus.oop.lab7.geometricobject15;

public class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Circle[radius = %f]", radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
