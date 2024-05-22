package mylist;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     * 
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * 
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        return data[index];
    }

    /**
     * Xóa phần tử ở vị trí index trong list.
     * 
     * @param index
     */
    @Override
    public void remove(int index) {
        if (index > size) {
            System.out.println("Index out of range");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào cuối list.
     * Nếu danh sách hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     * 
     * @param payload
     */
    @Override
    public void append(Object payload) {
        enlarge();
        data[size] = payload;
        size++;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào list ở vị trí index.
     * Nếu list hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     * 
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (index >= size) {
            enlarge();
        }
        for (int i = size - 1; i >= index; i++) {
            data[i] = data[i - 1];
        }
        data[index - 1] = payload;
        size++;
    }

    /**
     * Tạo iterator để có thể duyệt qua các phần tử của list.
     * 
     * @return
     */
    @Override
    public MyIterator iterator() {
        MyIterator myIterator = new MyArrayListIterator(data);
        return myIterator;
    }

    /**
     * Cấp phát gấp đôi chỗ cho list khi cần thiết.
     */
    private void enlarge() {
        Object[] newArr = new Object[2 * data.length];
        System.arraycopy(data, 0, newArr, 0, data.length);
        data = newArr;
    }
}
