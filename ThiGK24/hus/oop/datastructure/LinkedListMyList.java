package hus.oop.datastructure;

public class LinkedListMyList extends AbstractMyList {
    private Node start;
    private Node end;
    private int size;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public LinkedListMyList() {
        this.end = null;
        this.start = null;

    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     * 
     * @param index
     * @return
     */
    @Override
    public int get(int index) {
        if (!checkBoundaries(index, size - 1)) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        return getNodeByIndex(index).data;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * 
     * @param data
     * @param index
     */
    @Override
    public void set(int data, int index) {
        if (!checkBoundaries(index, size)) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        Node currentNode = getNodeByIndex(index);
        currentNode.data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * 
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(int value) {

        insertAtPos(value, 0);
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * 
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(int value) {
        insertAtPos(value, size);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * 
     * @param value
     * @param index
     */
    @Override
    public void insertAtPos(int value, int index) {
        if (!checkBoundaries(index, size)) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        // Xử lý cả end và start
        Node newNode = new Node(value);
        if (size == 0) {
            start = newNode;
            end = newNode;
        } else if (index == 0) {
            newNode.next = start;
            start = newNode;
        } else if (index == size) {
            end.next = newNode;
            end = newNode;
        } else {
            Node prevNode = getNodeByIndex(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;

        // Xử lý với mình start
        // Node newNode = new Node(value);
        // if (index == 0) {
        // newNode.next = start;
        // start = newNode;
        // } else {
        // Node prevNode = getNodeByIndex(index - 1);
        // Node currentNode = getNodeByIndex(index);
        // prevNode.next = newNode;
        // prevNode.next.next = currentNode;
        // }
        // size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * 
     * @param index
     */
    @Override
    public void remove(int index) {
        if (!checkBoundaries(index, size)) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        // Xử lý với cả end và start
        if (size == 1) {
            start = null;
            end = null;
        } else if (index == 0) {
            start = start.next;
        } else if (index == size - 1) {
            Node prevNode = getNodeByIndex(index - 1);
            prevNode.next = null;
            end = prevNode;
        } else {
            Node prevNode = getNodeByIndex(index - 1);
            prevNode.next = prevNode.next.next;
        }
        size--;

        // Xử lý với mình start
        // if (index == 0) {
        // start = start.next;
        // } else {
        // Node prevNode = getNodeByIndex(index - 1);
        // Node lastNode = getNodeByIndex(index + 1);
        // prevNode.next = lastNode;
        // }
        // size--;
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * 
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        if (!checkBoundaries(index, size)) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        Node nodeCurrent = start;
        for (int i = 0; i < index; i++) {
            nodeCurrent = nodeCurrent.next;
        }
        return nodeCurrent;
    }

    /**
     * Lấy ra dữ liệu được lưu theo cấu trúc dữ liệu kiểu mảng.
     * 
     * @return
     */
    @Override
    public int[] toArray() {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = get(i);

        return array;
    }
}
