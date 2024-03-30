package hus.oop.lab7.movale18;

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

        MovableRectangle mvRectangle = new MovableRectangle(3, 4, 5, 6, 6, 3);
        System.out.println(mvRectangle);
        mvRectangle.moveUp();
        mvRectangle.moveRight();
        System.out.println(mvRectangle);
        mvRectangle.moveDown();
        mvRectangle.moveLeft();
        System.out.println(mvRectangle);

        /*
         * Question: What is the difference between an interface and an abstract class?
         * Answer:
         * Abstract class:
         * - Abstract class can have abstract and non-abstract methods.
         * - Abstract class doesn't support multiple inheritance.
         * - Abstract class can have final, non-final, static and non-static variables.
         * - Abstract class can provide the implementation of interface.
         * - The abstract keyword is used to declare abstract class.
         * - An abstract class can extend another Java class and implement multiple Java
         * interfaces.
         * 
         * Interface class:
         * - Interface can have only abstract methods. Since Java 8, it can have default
         * and static methods also.
         * - Interface supports multiple inheritance.
         * - Interface has only static and final variables.
         * - Interface can't provide the implementation of abstract class.
         * - The interface keyword is used to declare interface.
         * - An interface can extend another Java interface only.
         */

    }
}
