package bai2;

public class MyArrayList extends MyAbstractList {
    private final int DEFAULT_CAPACITY = 1;
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
    public void append(Object obj) {
        enlarge();
        data[size] = obj;
        size++;
    }

    @Override
    public Object get(int index) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        return data[index - 1];
    }

    @Override
    public void insert(Object obj, int index) {
        if (index >= size) {
            enlarge();
        }
        for (int i = size - 1; i >= index - 1; i--) {
            data[i + 1] = data[i];
        }
        data[index - 1] = obj;
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
    public void set(Object obj, int index) {
        data[index - 1] = obj;
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
