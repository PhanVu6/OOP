package hus.oop.lab9.mylist;

public class MyLinkedList extends MyAbstractList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size);
        return getNodeByIndex(index);
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        MyLinkedListNode previousNode = getNodeByIndex(index - 1);
        MyLinkedListNode current = getNodeByIndex(index);
        MyLinkedListNode nextNode = (current.getNext() != null) ? current.getNext() : null;
        previousNode.setNext(nextNode);
    }

    @Override
    public int size() {
        return size;
    }
}
