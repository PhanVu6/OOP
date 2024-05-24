package mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     * 
     * @return
     */
    @Override
    public int size() {
        // Giả sử không cho instance size.
        // int count = 0;
        // MyLinkedListNode currentNode = this.head;
        // while (currentNode != null) {
        // count++;
        // currentNode = currentNode.getNext();
        // }
        // return count;

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
        return getNodeByIndex(index).getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * 
     * @param index
     */
    @Override
    public void remove(int index) {
        if (index == 0) {
            if (head == null) {
                return;
            }
            head = head.getNext();
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            MyLinkedListNode nextNode = current.getNext().getNext();
            current.setNext(nextNode);
        }
        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * 
     * @param payload
     */
    @Override
    public void append(Object payload) {
        insert(payload, size);
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * 
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (index == 0) {
            head = new MyLinkedListNode(payload, head);
        } else {
            MyLinkedListNode currentNode = getNodeByIndex(index);
            MyLinkedListNode newNode = new MyLinkedListNode(payload, currentNode.getNext());
            currentNode.setNext(newNode);
        }
        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * 
     * @return
     */
    @Override
    public MyIterator iterator() {
        MyLinkedListIterator newList = new MyLinkedListIterator(head);
        return newList;
    }

    /**
     * Lấy node ở vị trí index.
     * 
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            if (current.getNext() != null) {
                current = current.getNext();
            }
        }
        return current;
    }
}
