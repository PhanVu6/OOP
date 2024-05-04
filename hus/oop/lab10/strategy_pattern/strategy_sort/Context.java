package strategy_pattern.strategy_sort;

public class Context {
    private Sort sort;

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public void executeSort(int[] array) {
        this.sort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
