package sortstrategy;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int countSwap = 0;
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int min_indx = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[min_indx]) {
                    min_indx = j;
                }

                if (min_indx != i) {
                    int temp = data[min_indx];
                    data[min_indx] = data[i];
                    data[i] = temp;
                    countSwap++;
                }

            }
        }
        return countSwap;
    }
}
