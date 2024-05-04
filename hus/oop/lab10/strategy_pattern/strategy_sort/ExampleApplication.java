package strategy_pattern.strategy_sort;

import java.util.Scanner;

import strategy_pattern.strategy_pseudocode.ConcreteStrategyAdd;

public class ExampleApplication {
    public static void main(String[] args) {
        // Create SortingContext with BubbleSort
        Context sortingContext = new Context();
        sortingContext.setSort(new BubbleSort());
        int[] array1 = { 5, 2, 9, 1, 5 };
        sortingContext.executeSort(array1);

        // Change strategy to InsertionSort
        sortingContext.setSort(new InsertionSort());
        int[] array2 = { 8, 3, 7, 4, 2 };
        sortingContext.executeSort(array2);

        // Change strategy to SelectionSort
        sortingContext.setSort(new SelectionSort());
        int[] array3 = { 6, 1, 3, 9, 5 };
        sortingContext.executeSort(array3);
    }
}
