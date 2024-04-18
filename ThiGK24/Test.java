public class Test {

    // Java program for implementation
    // of Bubble Sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
    }

    // Prints the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[]) {

        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }

}
