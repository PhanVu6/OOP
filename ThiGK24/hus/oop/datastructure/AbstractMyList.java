package hus.oop.datastructure;

public abstract class AbstractMyList implements MyList {
    /**
     * Phương thức kiểm tra xem index có nằm trong đoạn [0 - limit] không.
     * 
     * @param index
     * @param limit
     * @return
     */
    public boolean checkBoundaries(int index, int limit) {
        return index >= 0 && index <= limit;
    }

    /**
     * Mô tả tập dữ liệu.
     * 
     * @return mô tả tập dữ liệu theo định dạng [a1, a2, a3, ..., an].
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            if (i == size() - 1 && i == 0) {
                str.append(String.format("[%d]", get(i)));

            } else if (i == 0) {
                str.append(String.format("[%d, ", get(i)));

            } else if (i == size() - 1) {
                str.append(String.format("%d]", get(i)));
            } else {
                str.append(String.format("%d, ", get(i)));
            }
        }
        return str.toString();
    }
}
