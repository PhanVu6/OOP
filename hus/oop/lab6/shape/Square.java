package hus.oop.lab6.shape;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        // TODO Auto-generated method stub
        return super.getLength();
    }

    public void setSide(double side) {
        // TODO Auto-generated method stub
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        // TODO Auto-generated method stub
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        // TODO Auto-generated method stub
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return super.getPerimeter();
    }

    @Override
    public String toString() {

        return String.format("Square[%s, width = %f, length = %f]",
                super.toString(), getSide(), getSide());
    }

}
