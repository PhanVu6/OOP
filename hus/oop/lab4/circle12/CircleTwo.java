package hus.oop.lab4.circle12;

public class CircleTwo {
    private double radius;

    public CircleTwo() {
        radius = 1.0;
    }

    public CircleTwo(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Circle[radius = " + this.radius + "]";
    }

}
