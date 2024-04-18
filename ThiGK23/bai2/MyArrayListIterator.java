package bai2;

public class MyArrayListIterator implements MyIterator {
    private Object[] data;
    private int currentPosition;

    public MyArrayListIterator(Object[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        currentPosition++;
        return currentPosition <= data.length - 1 && data[currentPosition - 1] != null;
    }

    @Override
    public Object next() {
        return data[currentPosition - 1];
    }

}
