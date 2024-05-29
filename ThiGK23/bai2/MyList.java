package bai2;

public interface MyList extends MyIterable {
    public void append(Object payload);

    public Object get(int index);

    public void insert(Object payload, int index);

    public void remove(int index);

    public void set(Object payload, int index);

    public int size();

}
