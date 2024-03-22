package hus.oop.lab6.compositioncircleandcylinder;

public class TestCylinder {
        public static void main(String[] args) {
                // Declare and allocate a new instance of cylinder
                // with default color, radius, and height
                Circle circle = new Circle();
                System.out.println(circle);

                Cylinder cylinder1 = new Cylinder();
                System.out.println("Cylinder:"
                                + " radius=" + cylinder1.getRadius()
                                + " height=" + cylinder1.getHeight()
                                + " base area=" + cylinder1.getArea()
                                + " volume=" + cylinder1.getVolume());
                System.out.println(cylinder1);

                // Declare and allocate a new instance of cylinder
                // specifying height, with default color and radius
                Cylinder cylinder2 = new Cylinder(10.0);
                System.out.println("Cylinder:"
                                + " radius=" + cylinder2.getRadius()
                                + " height=" + cylinder2.getHeight()
                                + " base area=" + cylinder2.getArea()
                                + " volume=" + cylinder2.getVolume());
                System.out.println(cylinder2);

                // Declare and allocate a new instance of cylinder
                // specifying radius and height, with default color
                Cylinder cylinder3 = new Cylinder(2.0, 10.0);
                System.out.println("Cylinder:"
                                + " radius=" + cylinder3.getRadius()
                                + " height=" + cylinder3.getHeight()
                                + " base area=" + cylinder3.getArea()
                                + " volume=" + cylinder3.getVolume());

                System.out.println(cylinder3);

                Cylinder cylinder4 = new Cylinder(1.0, 3.0, "blue");
                System.out.println("Cylinder:"
                                + " radius=" + cylinder3.getRadius()
                                + " height=" + cylinder3.getHeight()
                                + " base area=" + cylinder3.getArea()
                                + " volume=" + cylinder3.getVolume());
                System.out.println(cylinder4);

                // Sử dụng kế thừa sẽ tốt hơn
                // Ta có thể thấy: nếu sử dụng kế thừa thì ta có thể lược bớt việc viết lại code
                // và code có thể xem và kiểm tra dễ dàng hơn nên ta thấy kế thừa là tốt hơn
        }
}
