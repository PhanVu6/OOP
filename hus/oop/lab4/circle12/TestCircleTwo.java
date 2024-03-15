package hus.oop.lab4.circle12;

public class TestCircleTwo {
    public static void main(String[] args) {
        CircleTwo circleTwo1 = new CircleTwo(1.1);
        System.out.println(circleTwo1);
        CircleTwo circleTwo2 = new CircleTwo();
        System.out.println(circleTwo2);
        circleTwo1.setRadius(2.2);
        System.out.println(circleTwo1);
        System.out.println("radius is: " + circleTwo1.getRadius());

        System.out.printf("area is: %.2f%n", circleTwo1.getArea());
        System.out.printf("Circumference is: %.2f%n", circleTwo1.getCircumference());
    }
}
