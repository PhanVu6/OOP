package sortstrategy;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        int countSwap = 0;
        int temp = 0;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                    countSwap++;
                }
            }
        }
        return countSwap;
    }
}
