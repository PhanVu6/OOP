package hus.oop.lab7.movable14;

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

        MovableCircle mvCircle = new MovableCircle(3, 4, 5, 6, 3);
        System.out.println(mvCircle);
        mvCircle.moveUp();
        mvCircle.moveRight();
        System.out.println(mvCircle);
        mvCircle.moveDown();
        mvCircle.moveLeft();
        System.out.println(mvCircle);
    }
}
