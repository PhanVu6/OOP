package hus.oop.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyListVector extends AbstractMyVector {
    private List<Double> data;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyListVector() {
        this.data = new ArrayList<>();
    }

    @Override
    public int size() {
        return this.data.size();
    }

    @Override
    public double coordinate(int index) {
        if (index >= this.size() || 0 > index) {
            throw new IndexOutOfBoundsException();
        }
        return this.data.get(index);
    }

    @Override
    public double[] coordinates() {
        return this.data.stream().mapToDouble(Double::doubleValue).toArray();
    }

    @Override
    public void set(double value, int index) {
        if (index >= this.size() || 0 > index) {
            throw new IndexOutOfBoundsException();
        }
        this.data.set(index, value);
    }

    /**
     * Cộng các phần tử của vector với value.
     * 
     * @param value
     * @return vector mới.
     */
    public MyListVector add(double value) {
        MyListVector newVector = new MyListVector();
        for (int elementId = 0; elementId < this.size(); elementId++) {
            newVector.insert(this.coordinate(elementId) + value);
        }
        return newVector;
    }

    /**
     * Cộng vector hiện tại với một vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @param another
     * @return vector mới.
     */
    public MyListVector add(IMyVector another) {
        MyListVector newVector = new MyListVector();
        for (int elementId = 0; elementId < this.size(); elementId++) {
            newVector.insert(this.coordinate(elementId) + another.coordinate(elementId));
        }
        return newVector;
    }

    /**
     * Cộng các phần tử của vector với value.
     * 
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector addTo(double value) {
        for (int elementId = 0; elementId < this.size(); elementId++) {
            this.set(value + this.coordinate(elementId), elementId);
        }
        return this;
    }

    /**
     * Cộng vector hiện tại với một vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @param another
     * @return vector hiện tại.
     */
    public MyListVector addTo(IMyVector another) {
        boolean isHasSameSize = this.size() == another.size();
        if (!isHasSameSize) {
            throw new RuntimeException();
        }

        for (int elementId = 0; elementId < this.size(); elementId++) {
            this.set(another.coordinate(elementId) + this.coordinate(elementId), elementId);
        }

        return this;
    }

    /**
     * Trừ các phần tử của vector cho value.
     * 
     * @return vector mới.
     */
    public MyListVector minus(double value) {
        MyListVector newVector = new MyListVector();
        for (int elementId = 0; elementId < this.size(); elementId++) {
            newVector.insert(this.coordinate(elementId) - value);
        }
        return newVector;
    }

    /**
     * Trừ vector hiện tại cho vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @return vector mới.
     */
    public MyListVector minus(IMyVector another) {
        MyListVector newVector = new MyListVector();
        for (int elementId = 0; elementId < this.size(); elementId++) {
            newVector.insert(this.coordinate(elementId) - another.coordinate(elementId));
        }
        return newVector;
    }

    /**
     * Trừ các phần tử của vector cho value.
     * 
     * @return vector hiện tại.
     */
    public MyListVector minusFrom(double value) {
        for (int elementId = 0; elementId < this.size(); elementId++) {
            this.set(this.coordinate(elementId) - value, elementId);
        }
        return this;
    }

    /**
     * Trừ vector hiện tại cho vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @return vector hiện tại.
     */
    public MyListVector minusFrom(IMyVector another) {
        boolean isHasSameSize = this.size() == another.size();
        if (!isHasSameSize) {
            throw new RuntimeException();
        }

        for (int elementId = 0; elementId < this.size(); elementId++) {
            this.set(this.coordinate(elementId) - another.coordinate(elementId), elementId);
        }

        return this;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * 
     * @return tích vô hướng.
     */
    public double dot(IMyVector another) {
        boolean isHasSameSize = this.size() == another.size();
        if (!isHasSameSize) {
            throw new RuntimeException();
        }

        double result = 0;
        for (int elementId = 0; elementId < this.size(); elementId++) {
            result += this.coordinate(elementId) * another.coordinate(elementId);
        }

        return result;
    }

    /**
     * Các phần tử vector được lấy mũ power.
     * 
     * @param power
     * @return vector hiện tại.
     */
    public MyListVector pow(double power) {
        for (int elementId = 0; elementId < this.size(); elementId++) {
            this.set(Math.pow(this.coordinate(elementId), power), elementId);
        }

        return this;
    }

    /**
     * Các phần tử vector được nhân với value.
     * 
     * @return vector hiện tại.
     */
    public MyListVector scale(double value) {
        for (int elementId = 0; elementId < this.size(); elementId++) {
            this.set(this.coordinate(elementId) * value, elementId);
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
     * Thêm một giá trị value vào vector ở vị trí cuối cùng.
     * 
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector insert(double value) {
        this.data.add(value);
        return this;
    }

    /**
     * Thêm một giá trị vào vector ở vị trí index.
     * 
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector insert(double value, int index) {
        if (0 > index || this.size() < index) {
            throw new IndexOutOfBoundsException();
        }

        this.data.add(index, value);
        return this;
    }

    /**
     * Xóa phần tử ở vị trí index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * 
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector remove(int index) {
        if (0 > index || this.size() <= index) {
            throw new IndexOutOfBoundsException();
        }

        this.data.remove(index);
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các phần tử
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích
     * xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     * 
     * @param indices
     * @return vector mới có kiểu MyListVector có các phần tử được trích xuất từ
     *         vector hiện tại.
     */
    public MyListVector extract(int[] indices) {
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] <= 0 || indices[i] >= this.size()) {
                throw new RuntimeException();
            }
        }

        MyListVector newVector = new MyListVector();
        for (var id : indices) {
            newVector.insert(this.coordinate(id - 1), newVector.size());
        }

        return newVector;
    }
}
