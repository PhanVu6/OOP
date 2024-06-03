package sortstrategy;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int countSwap = 0;
        for (int i = 0; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
                countSwap++;
            }
            data[j + 1] = key;
        }
        return countSwap;
    }
}
