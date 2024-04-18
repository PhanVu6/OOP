package bai2;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 1;
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
    public void append(Object obj) {
        insert(obj, size);
    }

    @Override
    public void insert(Object obj, int index) {
        if (index == 1) {
            head = new MyLinkedListNode(obj, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 2);
            current.setNext(new MyLinkedListNode(obj, current.getNext()));
        }
        size++;
    }

    @Override
    public Object get(int index) {
        return getNodeByIndex(index - 1);
    }

    @Override
    public void remove(int index) {
        if (index == 1) {
            head = head.getNext();
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 2);
            MyLinkedListNode nextNode = getNodeByIndex(index);
            current.setNext(nextNode);
        }
        size--;
    }

    @Override
    public void set(Object obj, int index) {
        if (index == 1) {
            head = new MyLinkedListNode(obj, head.getNext());
        } else {
            MyLinkedListNode prevNode = getNodeByIndex(index - 2);
            MyLinkedListNode lastNode = getNodeByIndex(index);
            prevNode.setNext(new MyLinkedListNode(obj, prevNode.getNext()));
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(lastNode);

        }
    }

    @Override
    public int size() {
        return size - 1;
    }

    @Override
    public MyIterator iterator() {
        MyLinkedListIterator newList = new MyLinkedListIterator(head);
        return newList;
    }

}
