package lab_3;

import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        // 3.1
        testExponent(inpScanner);
        // 3.2
        testMagicSum(inpScanner);
        // 3.3
        testPrintArray(inpScanner);
        // 3.4
        testPrintArrayToString(inpScanner);
        // 3.5
        testContains(inpScanner);
        // 3.6
        testSearch(inpScanner);
        // 3.7
        testEquals(inpScanner);
        // 3.8
        testCopyOf(inpScanner);
        // 3.9
        testSwaped(inpScanner);
        // 3.10
        testReverse(inpScanner);
    }

    // 3.1
    public static int exponent(int base, int exp) {
        if (exp == 0 && base != 0) {
            return 1;
        } else if (exp == 0 && base == 0) {
            System.out.println("Value unkown");
            return -1;
        }

        int result = base;
        for (int i = 1; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void testExponent(Scanner in) {
        System.out.print("Enter the base: ");
        int base = in.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = in.nextInt();

        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }

    // 3.2
    public static boolean hasEight(int number) {
        while (number > 1) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static int testMagicSum(Scanner in) {
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer (or -1 to end): ");
        int number = in.nextInt();
        int sum = 0;

        while (number != SENTINEL) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }

        System.out.println("The magic sum is: " + sum);
        return sum;
    }

    // 3.3
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

    public static void print(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

    public static void print(float[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

    public static void testPrintArray(Scanner in) {
        System.out.print("Enter the length array: ");
        int lengthArr = in.nextInt();
        int[] array = new int[lengthArr];
        System.out.print("Enter the elements array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        print(array);
    }

    // 3.4
    public static String arrayToString(int[] arr) {
        String str = "";
        str += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                str += arr[i] + ", ";
            } else {
                str += arr[i];
            }
        }
        str += "]";
        return str;
    }

    public static void testPrintArrayToString(Scanner in) {
        System.out.print("Enter the length array: ");
        int lengthArr = in.nextInt();
        int[] array = new int[lengthArr];
        System.out.print("Enter the elements array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(arrayToString(array));
    }

    // 3.5
    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void testContains(Scanner in) {
        System.out.print("Enter the length array: ");
        int lengthArr = in.nextInt();
        int[] array = new int[lengthArr];
        System.out.print("Enter the elements array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = in.nextInt();

        if (contains(array, key)) {
            System.out.println(contains(array, key));
        } else {
            System.out.println(contains(array, key));
        }
    }

    // 3.6
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void testSearch(Scanner in) {
        System.out.print("Enter the length array: ");
        int lengthArr = in.nextInt();
        int[] array = new int[lengthArr];
        System.out.print("Enter the elements array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = in.nextInt();

        if (search(array, key) != -1) {
            System.out.println(search(array, key));
        } else {
            System.out.println(search(array, key));
        }
    }

    // 3.7
    public static boolean equals(int[] array1, int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void testEquals(Scanner in) {
        System.out.print("Enter the length array: ");
        int lengthArr = in.nextInt();
        int[] array1 = new int[lengthArr];
        int[] array2 = new int[lengthArr];

        System.out.print("Enter the elements array 1: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = in.nextInt();
        }

        System.out.print("Enter the elements array 2: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = in.nextInt();
        }

        if (equals(array1, array2)) {
            System.out.println(equals(array1, array2));
        } else {
            System.out.println(equals(array1, array2));
        }
    }

    // 3.8
    static int[] newArray;
    static int[] subArray;

    public static int[] copyOf(int[] array) {
        newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] copyOf(int[] array, int newSize) {
        subArray = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            subArray[i] = array[i];
        }
        return subArray;
    }

    public static void testCopyOf(Scanner in) {
        System.out.print("Enter the length array: ");
        int lengthArr = in.nextInt();
        int[] array = new int[lengthArr];

        System.out.print("Enter the elements array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        copyOf(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        System.out.print("Enter size of subArray: ");
        int size = in.nextInt();

        if (size <= lengthArr) {
            copyOf(array, size);
            for (int i = 0; i < size; i++) {
                System.out.print(subArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Size input is overload");
        }

    }

    // 3.9
    public static boolean swap(int[] array1, int[] array2) {

        if (array1.length == array2.length) {
            int[] temp = new int[array1.length];
            for (int i = 0; i < array2.length; i++) {
                temp[i] = array1[i];
                array1[i] = array2[i];
                array2[i] = temp[i];
            }
            return true;
        }
        return false;
    }

    public static void testSwaped(Scanner in) {
        System.out.print("Enter the size array 1: ");
        int size1 = in.nextInt();
        int[] array1 = new int[size1];
        System.out.print("Enter the elements array 1: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = in.nextInt();
        }

        System.out.print("Enter the size array 2: ");
        int size2 = in.nextInt();
        int[] array2 = new int[size2];
        System.out.print("Enter the elements array 2: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = in.nextInt();
        }

        System.out.println("Swap is: " + swap(array1, array2));
        System.out.println("Array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Array 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

    // 3.10
    public static void reverse(int[] array) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            // Hoán đổi array[fIdx] và array[bIdx]
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;

            // Chỉ cần duyệt nửa số phần tử của mảng
        }
    }

    public static void testReverse(Scanner in) {
        System.out.println("Enter the size array: ");
        int size = in.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
