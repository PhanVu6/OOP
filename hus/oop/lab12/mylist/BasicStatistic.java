package mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * 
     * @return giá trị lớn nhất.
     */
    public double max() {
        double max = (double) data.get(1);
        for (int i = 2; i < data.size(); i++) {
            if ((double) data.get(i) > max) {
                max = (double) data.get(i);
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * 
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        double min = (double) data.get(1);
        for (int i = 2; i < data.size(); i++) {
            if ((double) data.get(i) < min) {
                min = (double) data.get(i);
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * 
     * @return kỳ vọng.
     */
    public double mean() {
        double result = 0.0;
        for (int i = 1; i < data.size(); i++) {
            result += (double) data.get(i);
        }
        return result / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * 
     * @return phương sai.
     */
    public double variance() {
        double sum = 0;
        double convertDataToDouble;
        double mean = this.mean();
        for (int i = 0; i < this.data.size(); i++) {
            convertDataToDouble = (double) data.get(i);
            sum += Math.pow(mean - convertDataToDouble, 2);
        }
        return sum / this.data.size();
    }
}
