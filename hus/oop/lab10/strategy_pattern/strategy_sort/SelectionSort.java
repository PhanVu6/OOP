package strategy_pattern.strategy_sort;

public class SelectionSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }

                temp = array[i];
                array[i] = array[min_idx];
                array[min_idx] = temp;
            }
        }
        return array;
    }

}
