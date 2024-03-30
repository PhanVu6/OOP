package hus.oop.lab7.movable13;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint mvPoint = new MovablePoint(3, 4, 5, 6);
        System.out.println(mvPoint);
        mvPoint.moveUp();
        mvPoint.moveRight();
        System.out.println(mvPoint);
        mvPoint.moveDown();
        mvPoint.moveLeft();
        System.out.println(mvPoint);

    }
}
