package mylist;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * 
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        StringBuilder strArray = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            if (i == size() && i != 0) {
                strArray.append("[").append(get(i)).append("]");
                break;
            }
            strArray.append("[").append(get(i)).append("] ");
        }
        return strArray.toString();
    }
}
