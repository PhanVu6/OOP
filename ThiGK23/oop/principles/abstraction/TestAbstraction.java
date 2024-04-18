package oop.principles.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        // Tạo một đối tượng Circle
        Circle circle = new Circle("Red", 5.0);
        // Tính diện tích và chu vi của Circle
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());

        // Tạo một đối tượng Rectangle
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        // Tính diện tích và chu vi của Rectangle
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());

        // - Ý nghĩa:
        // Trừu tượng: Chỉ hiển thị các thuộc tính (attribuites) cần thiết và ẩn đi
        // thông tin không cần thiết.

        // - Ví dụ thể hiện ý nghĩa nguyên lý:
        // Như trên chúng ta thấy, lớp Shape là lớp trừu tượng nó cho phép hai lớp con
        // Rectangle và lớp Circle có thể sử dụng các phương thức CalulateCircle() và
        // calculatePerimeter() mà không cần biết cụ thể về cách triển khai của chúng.
        // Điều này là do tính trừu tượng của lớp cha Shape.

        // - Nguyên lý:
        // Bởi vì tính trừu tượng của lớp Shape, các lớp con Rectangle và Circle có thể
        // thừa kế các phương thức calculateArea() và calculatePerimeter() mà không cần
        // biết cụ thể về cách triển khai của chúng và nó ẩn đi những thông tin không
        // cần thiết trong lớp con. Điều này giúp tăng tính linh hoạt
        // và tái sử dụng mã nguồn trong hệ thống.

    }

}
