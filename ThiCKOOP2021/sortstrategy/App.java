package sortstrategy;

public class App {
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // BubbleSort
        System.out.println("Using Bubble Sort Algorithm:");

        int[] data = new int[(int) ((Math.random() * 10))];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 10);
        }

        System.out.print("Before sorting:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        SortStrategy sortStrategy = SortStrategy.getInstance();
        BubbleSort bubbleSort = new BubbleSort();
        sortStrategy.setSortee(bubbleSort);
        int countSwap = sortStrategy.sort(data);

        System.out.print("After sorting:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("Number of swap:" + countSwap);

        // SelectionSort
        System.out.println("Using Selection Sort Algorithm:");
        int[] data1 = new int[(int) (Math.random() * 10)];
        for (int i = 0; i < data1.length; i++) {
            data1[i] = (int) (Math.random() * 10);
        }

        System.out.print("Before sorting:");
        for (int i = 0; i < data1.length; i++) {
            System.out.print(data1[i] + " ");
        }
        System.out.println();

        SortStrategy sortStrategy1 = SortStrategy.getInstance();
        SelectionSort selectionSort = new SelectionSort();
        sortStrategy1.setSortee(selectionSort);
        int countSwap1 = sortStrategy1.sort(data1);

        System.out.print("After sorting:");
        for (int i = 0; i < data1.length; i++) {
            System.out.print(data1[i] + " ");
        }
        System.out.println();
        System.out.println("Number of swap:" + countSwap1);

        // InsertionSort
        System.out.println("Using Insertion Sort Algorithm:");
        int[] data2 = new int[(int) (Math.random() * 10)];
        for (int i = 0; i < data2.length; i++) {
            data2[i] = (int) (Math.random() * 10);
        }

        System.out.print("Before sorting:");
        for (int i = 0; i < data2.length; i++) {
            System.out.print(data2[i] + " ");
        }
        System.out.println();

        SortStrategy sortStrategy2 = SortStrategy.getInstance();
        InsertionSort insertionSort = new InsertionSort();
        sortStrategy2.setSortee(insertionSort);
        int countSwap2 = sortStrategy2.sort(data2);

        System.out.print("After sorting:");
        for (int i = 0; i < data2.length; i++) {
            System.out.print(data2[i] + " ");
        }
        System.out.println();
        System.out.println("Number of swap:" + countSwap2);
    }
}
