package hus.oop.lab6.pointandline;

public class Line {
    private Point begin; // beginning point
    private Point end; // ending point

    // Constructors
    public Line(Point begin, Point end) { // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY); // construct the Points here
        end = new Point(endX, endY); // construct the Points here
    }

    // Public methods
    public String toString() {
        return String.format("Line[(%d, %d) -> (%d, %d)]",
                getBeginX(), getBeginY(), getEndX(), getEndY());
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }

    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        this.begin.setXY(beginX, beginY);
    }

    public void setEndX(int endX) {
        this.end.setX(endX);
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        this.end.setXY(endX, endY);
    }

    public int getLength() {
        return (int) Math.sqrt((getBeginX() - getEndX()) * (getBeginX() - end.getX())
                + (getBeginY() - getEndY()) * (getBeginY() - getEndY()));
    } // Length of the line

    public double getGradient() {
        return Math.atan2((getBeginY() - getEndY()) * (getBeginY() - getEndY()),
                (getBeginX() - getEndX()) * (getBeginX() - getEndX()));
    } // Gradient in radians
}
