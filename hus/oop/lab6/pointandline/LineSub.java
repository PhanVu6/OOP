package hus.oop.lab6.pointandline;

public class LineSub extends Point {
    // Private variables
    private Point end; // Ending point

    // Constructors
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point(endX, endY); // construct the end Point
    }

    public LineSub(Point begin, Point end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point
    public String toString() {
        return String.format("LineSub[(%d, %d) -> (%d, %d)]",
                getBeginX(), getBeginY(), getEndX(), getEndY());
    }

    public Point getBegin() {
        return this;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }

    public void setEnd(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        super.setX(beginX);
    }

    public void setBeginY(int beginY) {
        super.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public int getLength() {
        return (int) Math.sqrt((getBeginX() - getEndX()) * (getBeginX() - end.getX())
                + (getBeginY() - getEndY()) * (getBeginY() - getEndY()));
    } // Length of the line

    public double getGradient() {
        return Math.atan2((getBeginY() - getEndY()), (getBeginX() - getEndX()));
    }
}
