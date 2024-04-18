// Lớp Main để kiểm tra đóng gói
public class TestEncapsulation {
    public static void main(String[] args) {
        // Khởi tạo một đối tượng sinh viên
        Student student = new Student();

        // Thiết lập tên và tuổi của sinh viên
        student.setName("John Doe");
        student.setAge(20);

        // Lấy thông tin sinh viên và hiển thị ra màn hình
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // - Ý nghĩa:
        // Đóng gói: Đóng gói dữ liệu, giúp che giấu chi tiết bên trong của một đối
        // tượng và chỉ cho phép truy cập thông qua các phương thức công khai. Điều này
        // bảo vệ dữ liệu và đảm bảo tính toàn vẹn của đối tượng.

        // - Ví dụ thể hiện ý nghĩa nguyên lý:
        // System.out.println("Student Name: " + student.name);
        // System.out.println("Student Age: " + student.age);
        // Trong hành vi trong comment trên, bạn không thể truy cập trực tiếp thuộc tính
        // data "name" và "age" của instances,
        // bởi vì nguyên lý đóng gói sẽ chặn hành vi này vì modifiers là private chỉ cho
        // phép truy cập trực tiếp trong nội bộ đối tượng

        // - Nguyên lý:
        // Như chúng ta thấy thì việc truy cập trực tiếp các biến (instance) và thay đổi
        // dữ liệu của nó là không thể, do việc bảo vệ dữ liệu và biến theo tính đóng
        // gói là không thể truy cập trực tiếp từ bên ngoài, mà bạn chỉ có thay đổi nói
        // từ bên ngoài bởi các phương thức công khai.
        // Điều này tạo ra một cách tiếp cận an toàn hơn và kiểm soát hơn đối với dữ
        // liệu của lớp.

    }

}
