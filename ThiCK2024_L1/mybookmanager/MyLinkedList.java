package mybookmanager;

import java.util.NoSuchElementException;

public class MyLinkedList extends AbstractMyList {
    private Node head;
    private int size;

    private class MyLinkedListIterator implements MyIterator {
        private int currentPosition;

        public MyLinkedListIterator(int start) {
            this.currentPosition = start;
        }

        @Override
        public boolean hasNext() {
            return getNodeByIndex(currentPosition) != null;
        }

        @Override
        public Object next() {
            Node indexCurrent = getNodeByIndex(currentPosition);
            currentPosition++;
            return indexCurrent.data;
        }
    }

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * 
     * @param data
     * @param index
     */
    @Override
    public void set(Object data, int index) {
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
    public void insertAtStart(Object value) {
        insertAtPosition(value, 0);
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * 
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(Object value) {
        insertAtPosition(value, size);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * 
     * @param value
     * @param index
     */
    @Override
    public void insertAtPosition(Object value, int index) {
        if (!checkBoundaries(index, size)) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prevNode = getNodeByIndex(index - 1);
            Node currentNode = getNodeByIndex(index);
            prevNode.next = newNode;
            prevNode.next.next = currentNode;
        }
        size++;
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
        if (index == 0) {
            head = head.next;
        } else {
            Node prevNode = getNodeByIndex(index - 1);
            Node lastNode = getNodeByIndex(index + 1);
            prevNode.next = lastNode;
        }
        size--;
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
        Node nodeCurrent = head;
        for (int i = 0; i < index; i++) {
            nodeCurrent = nodeCurrent.next;
        }
        return nodeCurrent;
    }

    @Override
    public MyIterator iterator() {
        MyIterator myIterator = new MyLinkedListIterator(0);
        return myIterator;
    }
}
