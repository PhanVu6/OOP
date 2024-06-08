package hus.oop.mynumbersystem;

public interface INumberSystemConverter {
    /**
     * Cập nhật số được chuyển đổi khi số ban đầu thay đổi
     * hoặc cơ số của số ban đầu thay đổi.
     */
    void update(ANumber number);

    /**
     * Hiển thị số theo định dạng a1a2...an(radix).
     */
    void display();
}
