package bai2;

import java.util.NoSuchElementException;

public class MyLinkedListIterator implements MyIterator {
    private MyLinkedListNode currentPosition;

    public MyLinkedListIterator(MyLinkedListNode currentPosition) {
        this.currentPosition = currentPosition;
    }

    @Override
    public boolean hasNext() {
        return currentPosition.getNext() != null;
    }

    @Override
    public Object next() {
        MyLinkedListNode indexCurrent = currentPosition;
        currentPosition = currentPosition.getNext();
        return indexCurrent.getPayload();
    }

}
