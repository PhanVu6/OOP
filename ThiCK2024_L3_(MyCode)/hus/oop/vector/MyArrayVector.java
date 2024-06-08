package hus.oop.vector;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayVector extends AbstractMyVector {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] data;
    private int size;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyArrayVector() {
        this.data = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public double coordinate(int index) {
        return this.data[index];
    }

    @Override
    public double[] coordinates() {
        return this.data;
    }

    @Override
    public void set(double value, int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.data[index] = value;
    }

    /**
     * Cộng các phần tử của vector với value.
     * 
     * @param value
     * @return vector mới.
     */
    public MyArrayVector add(double value) {
        MyArrayVector newVector = new MyArrayVector();
        for (int i = 0; i < this.size(); i++) {
            newVector.insert(this.data[i] + value);
        }
        return newVector;
    }

    /**
     * Cộng các phần tử vector hiện tại với các phần tử vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @param another
     * @return vector mới.
     */
    public MyArrayVector add(IMyVector another) {
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException("Hai vector không cùng số chiều, không thể thực hiện");
        }

        MyArrayVector newVector = new MyArrayVector();
        for (int i = 0; i < this.size(); i++) {
            newVector.insert(this.coordinate(i) + another.coordinate(i));
        }
        return newVector;
    }

    /**
     * Cộng các phần tử của vector với value.
     * 
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector addTo(double value) {
        for (int i = 0; i < this.size(); i++) {
            this.data[i] += value;
        }
        return this;
    }

    /**
     * Cộng các phần tử vector hiện tại với các phần tử vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @param another
     * @return vector hiện tại.
     */
    public MyArrayVector addTo(IMyVector another) {
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException("Hai vector không cùng số chiều, không thể thực hiện");
        }

        for (int i = 0; i < size(); i++) {
            this.data[i] += another.coordinate(i);
        }
        return this;
    }

    /**
     * Trừ các phần tử của vector cho giá trị value.
     * 
     * @return vector mới.
     */
    public MyArrayVector minus(double value) {
        MyArrayVector newVector = new MyArrayVector();
        for (int i = 0; i < this.size(); i++) {
            newVector.insert(this.data[i] - value);
        }
        return newVector;
    }

    /**
     * Trừ các phần tử của vector hiện tại cho các phần tử của vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @return vector mới.
     */
    public MyArrayVector minus(IMyVector another) {
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException("Hai vector không cùng số chiều, không thể thực hiện");
        }

        MyArrayVector newVector = new MyArrayVector();
        for (int i = 0; i < this.size(); i++) {
            newVector.insert(this.coordinate(i) - another.coordinate(i));
        }
        return newVector;
    }

    /**
     * Trừ các phần tử của vector cho giá trị value.
     * 
     * @return vector hiện tại.
     */
    public MyArrayVector minusFrom(double value) {
        for (int i = 0; i < this.size(); i++) {
            this.data[i] -= value;
        }
        return this;
    }

    /**
     * Trừ các phần tử của vector hiện tại cho các phần tử của vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @return vector hiện tại.
     */
    public MyArrayVector minusFrom(IMyVector another) {
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException("Hai vector không cùng số chiều, không thể thực hiện");
        }

        for (int i = 0; i < size(); i++) {
            this.data[i] -= another.coordinate(i);
        }
        return this;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * 
     * @return vector hiện tại.
     */
    public double dot(IMyVector another) {
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException("Hai vector không cùng số chiều, không thể thực hiện");
        }

        double result = 0;
        for (int i = 0; i < this.size(); i++)
            result += this.data[i] * another.coordinate(i);
        return result;
    }

    /**
     * Các phần tử của vector được lấy mũ power.
     * 
     * @param power
     * @return vector hiện tại.
     */
    public MyArrayVector pow(double power) {
        for (int i = 0; i < this.size(); i++) {
            this.data[i] = Math.pow(this.data[i], power);
        }
        return this;
    }

    /**
     * Các phần tử của vector được nhân với value.
     * 
     * @return vector hiện tại.
     */
    public MyArrayVector scale(double value) {
        for (int i = 0; i < this.size(); i++) {
            this.data[i] = this.data[i] * value;
        }
        return this;
    }

    /**
     * Lấy chuẩn của vector.
     * 
     * @return chuẩn của vector.
     */
    @Override
    public double norm() {
        return Math.sqrt(this.dot(this));
    }

    /**
     * Thêm một giá trị value vào tọa độ vector ở vị trí cuối cùng.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * 
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value) {
        boolean hasSlot = this.size < this.data.length;
        if (hasSlot) {
            enlarge();
        }

        this.data[size] = value;
        this.size++;
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * 
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value, int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }

        boolean hasSlot = this.size < this.data.length;
        if (!hasSlot) {
            enlarge();
        }

        for (int i = this.size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        this.data[index] = value;
        this.size++;
        return this;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * 
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < this.size() - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[size - 1] = 0;
        size--;
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các giá trị tọa độ
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích
     * xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     * 
     * @param indices
     * @return vector mới có tọa độ được trích xuất từ vector hiện tại.
     */
    public MyArrayVector extract(int[] indices) {
        MyArrayVector newVector = new MyArrayVector();
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] >= this.size || indices[i] < 0) {
                throw new IndexOutOfBoundsException();
            }

            newVector.insert(this.coordinate(indices[i]));
        }
        return newVector;
    }

    /**
     * Mở rộng kích thước vector lên gấp đôi khi cần thiết.
     * 
     * @return vector hiện tại.
     */
    private MyArrayVector enlarge() {
        double[] newArr = new double[this.data.length + DEFAULT_CAPACITY];
        System.arraycopy(data, 0, newArr, 0, data.length);
        data = newArr;
        return this;
    }
}
