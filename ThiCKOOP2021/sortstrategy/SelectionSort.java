package sortstrategy;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int countSwap = 0;
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int max_indx = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] > data[max_indx]) {
                    max_indx = j;
                }

                if (max_indx != i) {
                    int temp = data[max_indx];
                    data[max_indx] = data[i];
                    data[i] = temp;
                    countSwap++;
                }

            }
        }
        return countSwap;
    }
}
