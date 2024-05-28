package matrix;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class SquareMatrix {
    private int[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong
     * khoảng [1, 100]
     * 
     * @param size
     */
    public SquareMatrix(int size) {
        data = new int[size][size];
        initRandom(size);
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên
     * trong khoảng [1, 100]
     * 
     * @param size
     */
    private void initRandom(int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = random.nextInt(1, 100);
            }
        }
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     * 
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        int[] container = new int[data.length];
        for (int i = 0; i < container.length; i++) {
            container[i] = data[i][i];
        }
        return container;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     * 
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        int[] container = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i + j == data.length - 1) {
                    container[i] = data[i][j];
                }
            }
        }
        return container;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     * 
     * @return các số nguyên tố trong ma trận.
     */
    public int[] primes() {
        int count = 0;
        for (int[] row : data) {
            for (int element : row) {
                if (checkPrime(element)) {
                    count++;
                }
            }
        }

        int[] containerPrime = new int[count];
        int index = 0;
        for (int[] row : data) {
            for (int element : row) {
                if (checkPrime(element)) {
                    containerPrime[index] = element;
                    index++;
                }
            }
        }
        return containerPrime;
    }

    private boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     * 
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp
     *         theo thứ tự tăng dần.
     *         Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và
     *         từ trên xuống dưới.
     */
    public SquareMatrix getSortedMatrix() {
        int[] containerSortMatrix = new int[data.length * data.length];
        int k = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                containerSortMatrix[k++] = data[i][j];
            }
        }

        // Arrays.sort(containerSortMatrix);
        quickSort(containerSortMatrix, 0, containerSortMatrix.length - 1);

        k = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] = containerSortMatrix[k++];

            }
        }
        return this;
    }

    private int partitionHoare(int[] array, int low, int heigh) {
        // Choosing the pivot
        int pivot = array[low];
        // Index of smaller element(left)
        int index = low - 1;
        // Index of big element(right)
        int index_2 = heigh + 1;
        int temp = 0;

        while (true) {
            do {
                index_2--;
            } while (array[index_2] > pivot);

            do {
                index++;
            } while (array[index] < pivot);

            if (index < index_2) {
                // swap
                temp = array[index];
                array[index] = array[index_2];
                array[index_2] = temp;
            } else {
                return index_2;
            }
        }
    }

    private void quickSort(int[] array, int low, int heigh) {
        if (low >= heigh) {
            return;
        }
        int p = partitionHoare(array, low, heigh);
        quickSort(array, low, p);
        quickSort(array, p + 1, heigh);
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     * 
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     * 
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {
        data[row][col] = value;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     * 
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] += that.data[i][j];
            }
        }
        return this;
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     * 
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền
     *         vào.
     */
    public SquareMatrix minus(SquareMatrix that) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] -= that.data[i][j];
            }
        }
        return this;
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     * 
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền
     *         vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        int[][] res = new int[data.length][that.data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                res[i][j] = 0;
                for (int k = 0; k < data.length; k++) {
                    res[i][j] += data[i][k] * that.data[k][j];
                }
            }

        }
        data = res;
        return this;
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     * 
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] *= value;
            }
        }
        return this;
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     * 
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                temp = data[i][j];
                data[i][j] = data[j][i];
                data[j][i] = temp;
            }
        }
        return this;
    }

    /**
     * Mô tả ma trận theo định dạng biểu diễn ma trận, ví dụ
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * 
     * @return một chuỗi mô tả ma trận.
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                str.append(data[i][j] + " ");
            }
            if (i != data.length - 1) {
                str.append("\n");
            }
        }
        return str.toString();
    }
}
