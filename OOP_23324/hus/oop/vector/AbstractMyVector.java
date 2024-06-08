package hus.oop.vector;

public abstract class AbstractMyVector implements IMyVector {
    /**
     * Mô tả vector theo định dạng [a1 a2 ... an]
     * 
     * @return
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (var i = 0; i < this.size(); i++) {
            stringBuilder.append(this.coordinate(i) + " ");
        }
        stringBuilder.toString().trim();
        stringBuilder.append(']');
        return stringBuilder.toString();
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
        boolean isHasSameSize = this.size() == another.size();
        if (!isHasSameSize) {
            return false;
        }

        for (int elementId = 0; elementId < this.size(); elementId++) {
            boolean isHasSameElement = this.coordinate(elementId) != another.coordinate(elementId);
            if (isHasSameElement) {
                return false;
            }
        }

        return true;
    }
}
