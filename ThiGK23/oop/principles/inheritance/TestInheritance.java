package oop.principles.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        // Tạo một đối tượng Dog
        Dog myDog = new Dog("Buddy");

        // Gọi các phương thức của lớp cha
        myDog.eat();
        myDog.sleep();

        // Gọi phương thức riêng của lớp con
        myDog.bark();

        // - Ý nghĩa:
        // Kế thừa: Nó cho phép đối tượng được tái sử dụng các phương thức và các thuộc
        // tính từ đối tượng khác

        // - Ví dụ thể hiện ý nghĩa nguyên lý:
        // Ta chỉ khởi tạo phương thức eat() và sleep() trong lớp cha, mà không có trong
        // lớp con ta vẫn có thể sử dụng, bởi vì mọi phương thức và thuộc tính của lớp
        // cha lớp con đều có thể sử dụng
        // Ngoại ra, phương thức bank() được khởi tạo và sử dụng cho lớp con, điều này
        // thể hiện cho khả năng có thể mở rộng của lớp con

        // - Nguyên lý:
        // Như ta thấy, các phương thức và thuộc tính của lớp cha Animal thì lớp con Dog
        // đều có thể kế thừa, hơn nữa lớp con còn có thể mở rộng thêm. Do tính chất kế
        // thừa thì mọi phương thức và thuộc tính của lớp cha thì lớp đều có thể sử dụng
    }

}
