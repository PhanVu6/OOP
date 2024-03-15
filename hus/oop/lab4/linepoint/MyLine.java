package hus.oop.lab4.linepoint;

import hus.oop.lab4.point.MyPoint;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin.setX(x1);
        this.begin.setY(y1);
        this.end.setX(x2);
        this.end.setY(y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(MyPoint begin) {
        this.begin = begin;
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(MyPoint begin) {
        this.begin = begin;
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(MyPoint end) {
        this.end = end;
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(MyPoint end) {
        this.end = end;
    }

    public int[] getBeginXY() {
        int[] XY = new int[2];
        XY[0] = begin.getX();
        XY[1] = begin.getY();
        return XY;
    }

    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public int[] getEndXY() {
        int[] XY = new int[2];
        XY[0] = end.getX();
        XY[1] = end.getY();
        return XY;
    }

    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        return Math.atan2(getEndY() - getBeginY(), getEndX() - getBeginX());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("MyLine[begin = %s, end = %s]", begin, end);
    }
}
