package lab_2;

import java.util.Scanner;

public class PrintArray {
    static int[] array;

    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        createArray(inpScanner);
        printArray(array);
    }

    public static int[] createArray(Scanner in) {
        System.out.println("Enter the number of items: ");
        final int NUM_ITEMS = in.nextInt();
        in.nextLine();

        System.out.println("Enter the value of all items (separated by space): ");
        array = new int[NUM_ITEMS];
        for (int i = 0; i < NUM_ITEMS; i++) {
            array[i] = in.nextInt();
        }

        return array;
    }

    public static void printArray(int[] arr) {
        System.out.print("The value are: [");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "]");
            }
        }
    }
}
