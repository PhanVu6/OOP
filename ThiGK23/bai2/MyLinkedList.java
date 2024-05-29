package bai2;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            if (current.getNext() != null) {
                current = current.getNext();
            }
        }
        return current;
    }

    @Override
    public void append(Object payload) {
        insert(payload, size);
    }

    @Override
    public void insert(Object payload, int index) {
        if (index == 0) {
            head = new MyLinkedListNode(payload, head);
        } else {
            MyLinkedListNode currentNode = getNodeByIndex(index - 1);
            MyLinkedListNode newNode = new MyLinkedListNode(payload, currentNode.getNext());
            currentNode.setNext(newNode);
        }
        size++;
    }

    @Override
    public Object get(int index) {
        return getNodeByIndex(index).getPayload();
    }

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

    @Override
    public void set(Object payload, int index) {
        if (index == 0) {
            head = new MyLinkedListNode(payload, head.getNext());
        } else {
            MyLinkedListNode previous = getNodeByIndex(index - 1);
            MyLinkedListNode current = previous.getNext();
            MyLinkedListNode newNode = new MyLinkedListNode(payload, current.getNext());
            previous.setNext(newNode);
        }

        // Bất đắc dĩ hẵng làm như sau:
        // remove(index);
        // insert(payload, index);
    }

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

    @Override
    public MyIterator iterator() {
        MyLinkedListIterator newList = new MyLinkedListIterator(head);
        return newList;
    }

}
