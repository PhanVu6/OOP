package hus.oop.vector;

import java.util.Vector;

import javax.management.RuntimeErrorException;

public class MyArrayVector extends AbstractMyVector {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] data;
    private int size;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyArrayVector() {
        this.data = new double[this.DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public double coordinate(int index) {
        if (index >= this.size || 0 > index) {
            throw new IndexOutOfBoundsException();
        }
        return this.data[index];
    }

    @Override
    public double[] coordinates() {
        return this.data;
    }

    public void set(double value, int index) {
        if (index >= this.size || 0 > index) {
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
        for (int elementId = 0; elementId < this.size; elementId++) {
            newVector.insert(this.data[elementId] + value, elementId);
            // this.data[elementId] += value;
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
        boolean isHasSameSize = this.size() == another.size();
        if (!isHasSameSize) {
            throw new RuntimeException();
        }
        MyArrayVector sumVector = new MyArrayVector();
        for (int elementId = 0; elementId < this.size; elementId++) {
            // this.data[elementId] += another.coordinate(elementId);
            sumVector.insert(
                    this.data[elementId] + another.coordinate(elementId),
                    elementId);
        }

        return sumVector;
    }

    /**
     * Cộng các phần tử của vector với value.
     * 
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector addTo(double value) {
        for (int elementId = 0; elementId < this.size; elementId++) {
            this.data[elementId] += value;
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
        boolean isHasSameSize = this.size() == another.size();
        if (!isHasSameSize) {
            throw new RuntimeException();
        }

        for (int elementId = 0; elementId < this.size; elementId++) {
            this.data[elementId] += another.coordinate(elementId);
        }

        return this;
    }

    /**
     * Trừ các phần tử của vector cho giá trị value.
     * 
     * @return vector mới.
     */
    public MyArrayVector minus(double value) {
        MyArrayVector sumVector = new MyArrayVector();
        for (int elementId = 0; elementId < this.size; elementId++) {
            sumVector.insert(
                    this.data[elementId] - value,
                    elementId);
        }

        return sumVector;
    }

    /**
     * Trừ các phần tử của vector hiện tại cho các phần tử của vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @return vector mới.
     */
    public MyArrayVector minus(IMyVector another) {
        boolean isHasSameSize = this.size() == another.size();
        if (!isHasSameSize) {
            throw new RuntimeException();
        }

        MyArrayVector newVector = new MyArrayVector();
        for (int elementId = 0; elementId < this.size; elementId++) {
            newVector.insert(
                    this.data[elementId] - another.coordinate(elementId),
                    elementId);
        }

        return newVector;
    }

    /**
     * Trừ các phần tử của vector cho giá trị value.
     * 
     * @return vector hiện tại.
     */
    public MyArrayVector minusFrom(double value) {
        for (int elementId = 0; elementId < this.size; elementId++) {
            this.data[elementId] -= value;
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
        boolean isHasSameSize = this.size() == another.size();
        if (!isHasSameSize) {
            throw new RuntimeException();
        }

        for (int elementId = 0; elementId < this.size; elementId++) {
            this.data[elementId] -= another.coordinate(elementId);
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
        boolean isHasSameSize = this.size() == another.size();
        if (!isHasSameSize) {
            throw new RuntimeException();
        }

        double result = 0;
        for (int elementId = 0; elementId < this.size; elementId++) {
            result += this.data[elementId] * another.coordinate(elementId);
        }

        return result;
    }

    /**
     * Các phần tử của vector được lấy mũ power.
     * 
     * @param power
     * @return vector hiện tại.
     */
    public MyArrayVector pow(double power) {
        for (int elementId = 0; elementId < this.size; elementId++) {
            this.data[elementId] = Math.pow(this.data[elementId], power);
        }

        return this;
    }

    /**
     * Các phần tử của vector được nhân với value.
     * 
     * @return vector hiện tại.
     */
    public MyArrayVector scale(double value) {
        for (int elementId = 0; elementId < this.size; elementId++) {
            this.data[elementId] *= value;
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
        if (!hasSlot) {
            this.enlarge();
        }

        this.data[this.size++] = value;

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
        if (0 > index || this.size < index) {
            throw new IndexOutOfBoundsException();
        }

        boolean hasSlot = this.size < this.data.length;
        if (!hasSlot) {
            this.enlarge();
        }

        this.size++;

        for (int elementId = this.size - 1; elementId > index; elementId--) {
            this.data[elementId] = this.data[elementId - 1];
        }

        this.data[index] = value;

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
        if (0 > index || this.size <= index) {
            throw new RuntimeException();
        }

        this.size--;

        for (int elementId = index; elementId < this.size; elementId++) {
            this.data[elementId] = this.data[elementId + 1];
        }

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
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] <= 0 || indices[i] >= this.size) {
                throw new RuntimeException();
            }
        }

        MyArrayVector newVector = new MyArrayVector();
        for (var id : indices) {
            newVector.insert(this.coordinate(id - 1), newVector.size());
        }

        return newVector;
    }

    /**
     * Mở rộng kích thước vector lên gấp đôi khi cần thiết.
     * 
     * @return vector hiện tại.
     */
    private MyArrayVector enlarge() {
        double[] newData = new double[this.size + this.DEFAULT_CAPACITY];

        System.arraycopy(this.data, 0, newData, 0, this.size);
        this.data = newData;

        return this;
    }
}
