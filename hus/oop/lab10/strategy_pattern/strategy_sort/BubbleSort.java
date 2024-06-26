package strategy_pattern.strategy_sort;

public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int temp = 0;
        // Implement Bubble Sort algorithm
        System.out.println("Sorting using Bubble Sort");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
