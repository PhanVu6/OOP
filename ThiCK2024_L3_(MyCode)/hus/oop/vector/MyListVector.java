package hus.oop.vector;

import java.util.ArrayList;
import java.util.List;

public class MyListVector extends AbstractMyVector {
    private List<Double> data;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyListVector() {
        this.data = new ArrayList<Double>();
    }

    @Override
    public int size() {
        return this.data.size();
    }

    @Override
    public double coordinate(int index) {
        return this.data.get(index);
    }

    @Override
    public double[] coordinates() {
        double[] getArr = new double[data.size()];
        for (int i = 0; i < this.size(); i++) {
            getArr[i] = coordinate(i);
        }
        return getArr;
    }

    @Override
    public void set(double value, int index) {
        if (index < 0 || index >= this.size()) {
            throw new ArrayIndexOutOfBoundsException("Index nằm ngoài kích thước chiều");
        }

        this.data.set(index, (Double) value);
    }

    /**
     * Cộng các phần tử của vector với value.
     * 
     * @param value
     * @return vector mới.
     */
    public MyListVector add(double value) {
        MyListVector newVector = new MyListVector();
        for (int i = 0; i < this.data.size(); i++) {
            newVector.data.add(this.data.get(i) + (Double) value);
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
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException("Hai vector không cùng số chiều, không thể thực hiện");
        }

        for (int i = 0; i < this.size(); i++) {
            newVector.insert((Double) (this.data.get(i) + another.coordinate(i)));
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
        for (int i = 0; i < this.size(); i++) {
            this.data.set(i, this.data.get(i) + (Double) value);
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
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException("Hai vector không cùng số chiều, không thể thực hiện");
        }

        for (int i = 0; i < size(); i++) {
            this.set(data.get(i) + (Double) another.coordinate(i), i);
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
        for (int i = 0; i < this.size(); i++) {
            newVector.data.add(this.data.get(i) - (Double) value);
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
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException("Hai vector không cùng số chiều, không thể thực hiện");
        }

        for (int i = 0; i < this.size(); i++) {
            newVector.insert((Double) (this.data.get(i) - another.coordinate(i)));
        }
        return newVector;
    }

    /**
     * Trừ các phần tử của vector cho value.
     * 
     * @return vector hiện tại.
     */
    public MyListVector minusFrom(double value) {
        for (int i = 0; i < this.size(); i++) {
            this.data.set(i, this.data.get(i) - (Double) value);
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
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException("Hai vector không cùng số chiều, không thể thực hiện");
        }

        for (int i = 0; i < size(); i++) {
            this.set(this.data.get(i) - (Double) another.coordinate(i), i);
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
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException("Hai vector không cùng số chiều, không thể thực hiện");
        }

        double result = 0;
        for (int i = 0; i < this.size(); i++)
            result += this.data.get(i) * another.coordinate(i);
        return result;
    }

    /**
     * Các phần tử vector được lấy mũ power.
     * 
     * @param power
     * @return vector hiện tại.
     */
    public MyListVector pow(double power) {
        for (int i = 0; i < this.size(); i++) {
            this.set(Math.pow(this.data.get(i), power), i);
        }
        return this;
    }

    /**
     * Các phần tử vector được nhân với value.
     * 
     * @return vector hiện tại.
     */
    public MyListVector scale(double value) {
        for (int i = 0; i < this.size(); i++) {
            this.set(this.data.get(i) * (Double) value, i);
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
        this.data.add((Double) value);
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
        if (index < 0 || index > this.size()) {
            throw new ArrayIndexOutOfBoundsException("Index nằm ngoài kích thước chiều");
        }

        this.data.add(index, (Double) value);
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
        if (index < 0 || index > this.size()) {
            throw new ArrayIndexOutOfBoundsException("Index nằm ngoài kích thước chiều");
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
        MyListVector newListVector = new MyListVector();
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] >= this.size() || indices[i] < 0) {
                throw new ArrayIndexOutOfBoundsException("Chỉ số không thuộc số chiều của vector");
            }
            newListVector.insert(data.get(indices[i]));
        }

        return newListVector;

    }
}
