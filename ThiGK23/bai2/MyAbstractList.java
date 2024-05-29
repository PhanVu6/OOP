package bai2;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append("[").append(get(i)).append("] \n");
        }
        return sb.toString().trim();
    }

}
