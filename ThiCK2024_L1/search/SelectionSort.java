package search;

public class SelectionSort implements Sorter {
    /**
     * Phương thức sắp xếp dữ liệu sử dụng thuật toán Selection sort.
     * 
     * @param data
     * @param order: true sắp xếp theo thứ tự tăng dần, false sắp xếp theo thứ tự
     *               giảm dần.
     */
    @Override
    public void sort(double[] data, boolean order) {
        if (order) {
            sortAscending(data);
        } else {
            sortDescending(data);
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự tăng dần,
     * sử dụng thuật toán Selection sort.
     * 
     * @param data
     */
    private void sortAscending(double[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int minAtIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minAtIndex]) {
                    minAtIndex = j;
                }

                if (minAtIndex != i) {
                    double temp = data[minAtIndex];
                    data[minAtIndex] = data[i];
                    data[i] = temp;
                }

            }
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự giảm dần,
     * sử dụng thuật toán Selection sort.
     * 
     * @param data
     */
    private void sortDescending(double[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int maxAtIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] > data[maxAtIndex]) {
                    maxAtIndex = j;
                }

                if (maxAtIndex != i) {
                    double temp = data[maxAtIndex];
                    data[maxAtIndex] = data[i];
                    data[i] = temp;
                }

            }
        }
    }
}
