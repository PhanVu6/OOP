package hus.oop.vector;

public abstract class AbstractMyVector implements IMyVector {
    /**
     * Mô tả vector theo định dạng [a1 a2 ... an]
     * 
     * @return
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            str.append(this.coordinate(i) + " ");
        }
        return "[" + str.toString().trim() + "]";
    }

    /**
     * So sánh hai vector có bằng nhau không.
     * Hai vector bằng nhau nếu có cùng số chiều và có các phần tử bằng nhau.
     * 
     * @param another
     * @return
     */
    @Override
    public boolean equals(IMyVector another) {
        if (this.size() != another.size()) {
            return false;
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.coordinate(i) != another.coordinate(i)) {
                return false;
            }
        }
        return true;
    }
}
