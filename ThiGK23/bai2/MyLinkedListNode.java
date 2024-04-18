package bai2;

public class MyLinkedListNode {
    private Object payload;
    private MyLinkedListNode next;

    public MyLinkedListNode(MyLinkedListNode next) {
        this.next = next;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        this.payload = payload;
        this.next = next;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }

    public Object getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return payload.toString();
    }

}
