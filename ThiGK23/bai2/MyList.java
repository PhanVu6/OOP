package bai2;

public interface MyList extends MyIterable {
    public void append(Object obj);

    public Object get(int index);

    public void insert(Object obj, int index);

    public void remove(int index);

    public void set(Object obj, int index);

    public int size();

}
