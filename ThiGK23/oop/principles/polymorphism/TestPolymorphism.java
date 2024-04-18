package oop.principles.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Tạo một đối tượng Dog và gán cho một tham chiếu kiểu Animal
        Animal myCat = new Cat(); // Tạo một đối tượng Cat và gán cho một tham chiếu kiểu Animal

        myDog.makeSound(); // Gọi phương thức makeSound() của đối tượng Dog
        myCat.makeSound(); // Gọi phương thức makeSound() của đối tượng Cat

        // - Ý nghĩa:
        // Đa hình: Là khả năng một đối tượng có thể thực hiện một hành vi theo nhiều
        // cách khác nhau

        // - Ví dụ thể hiện ý nghĩa nguyên lý:
        // Ta có thể thấy, tính đa hình được thể hiện qua phương thức makeSound() của
        // lớp cha Animal được dùng lại ở hai lớp con Dog và Cat với hành vi là khác
        // nhau.

        // - Nguyên lý:
        // Trong trường hợp của override. Khi một
        // phương thức được ghi đè trong lớp con, và khi gọi phương thức đó thông qua
        // một tham chiếu của lớp cha, JVM sẽ tự động quyết định phương thức nào sẽ được
        // gọi dựa trên kiểu thực của đối tượng đang tham chiếu đến. Điều này cho phép
        // các đối tượng của các lớp con được xử lý một cách đa hình, có nghĩa là hành
        // vi của chúng có thể thay đổi tùy thuộc vào lớp con mà chúng thuộc về.
    }

}
