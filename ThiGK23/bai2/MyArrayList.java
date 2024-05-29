package bai2;

public class MyArrayList extends MyAbstractList {
    private final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    public MyArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    private void enlarge() {
        Object[] newArr = new Object[2 * data.length];
        System.arraycopy(data, 0, newArr, 0, data.length);
        data = newArr;
    }

    @Override
    public void append(Object payload) {
        enlarge();
        data[size] = payload;
        size++;
    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public void insert(Object payload, int index) {
        if (index >= size) {
            enlarge();
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = payload;
        size++;
    }

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

    @Override
    public void set(Object payload, int index) {
        data[index] = payload;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyIterator iterator() {
        MyArrayListIterator newArr = new MyArrayListIterator(data);
        return newArr;
    }

}
