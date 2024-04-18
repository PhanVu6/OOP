// Lớp Student
public class Student {
    // Thuộc tính private
    private String name;
    private int age;

    // Phương thức public để thiết lập tên
    public void setName(String name) {
        // Kiểm tra tính hợp lệ của tên trước khi thiết lập
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    // Phương thức public để lấy tên
    public String getName() {
        return name;
    }

    // Phương thức public để thiết lập tuổi
    public void setAge(int age) {
        // Kiểm tra tính hợp lệ của tuổi trước khi thiết lập
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Phương thức public để lấy tuổi
    public int getAge() {
        return age;
    }
}
