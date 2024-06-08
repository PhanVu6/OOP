package hus.oop.vector;

public interface IMyVector {
    /**
     * Lấy số chiều của vector.
     * 
     * @return
     */
    int size();

    /**
     * Lấy giá trị phần tử ở vị trí index.
     * 
     * @param index
     * @return
     */
    double coordinate(int index);

    /**
     * Lấy các phần tử của vector.
     * 
     * @return
     */
    double[] coordinates();

    /**
     * Thêm một phần tử vào vector ở vị trí cuối cùng.
     * 
     * @param value
     * @return vector hiện tại.
     */
    public IMyVector insert(double value);

    /**
     * Thêm một phần tử vào vector ở vị trí index.
     * 
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public IMyVector insert(double value, int index);

    /**
     * Xóa phần tử ở vị trí index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * 
     * @param index
     * @return vector hiện tại.
     */
    public IMyVector remove(int index);

    /**
     * Thay đổi giá trị tọa độ trên trục tọa độ index.
     * 
     * @param value
     * @param index
     */
    void set(double value, int index);

    /**
     * Cộng các giá trị tọa độ với value.
     * 
     * @param value
     * @return vector mới.
     */
    public IMyVector add(double value);

    /**
     * Cộng vector hiện tại với một vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @param another
     * @return vector mới.
     */
    public IMyVector add(IMyVector another);

    /**
     * Cộng các giá trị tọa độ với value.
     * 
     * @param value
     * @return vector hiện tại.
     */
    public IMyVector addTo(double value);

    /**
     * Cộng vector hiện tại với một vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @param another
     * @return vector hiện tại.
     */
    public IMyVector addTo(IMyVector another);

    /**
     * Trừ các phần tử của vector cho value.
     * 
     * @return vector mới.
     */
    public IMyVector minus(double value);

    /**
     * Trừ các phần tử của vector hiện tại cho các phần tử của vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @return vector mới.
     */
    public IMyVector minus(IMyVector another);

    /**
     * Trừ các phần tử của vector cho value.
     * 
     * @return vector hiện tại.
     */
    public IMyVector minusFrom(double value);

    /**
     * Trừ các phần tử của vector hiện tại cho các phần tử của vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * 
     * @return vector hiện tại.
     */
    public IMyVector minusFrom(IMyVector another);

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * 
     * @return tích vô hướng.
     */
    public double dot(IMyVector another);

    /**
     * Các phần tử của vector được lấy mũ power.
     * 
     * @param power
     * @return vector hiện tại.
     */
    public IMyVector pow(double power);

    /**
     * Các phần tử của vector được nhân với value.
     * 
     * @return vector hiện tại.
     */
    public IMyVector scale(double value);

    /**
     * Lấy chuẩn của vector.
     * 
     * @return chuẩn của vector.
     */
    double norm();

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
    public IMyVector extract(int[] indices);

    /**
     * So sánh hai vector có bằng nhau không.
     * 
     * @param another
     * @return
     */
    boolean equals(IMyVector another);
}
