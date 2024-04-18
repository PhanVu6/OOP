package bai2;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(String.format("[%s] \n", get(i + 1).toString()));
        }
        return sb.toString();
    }

}
