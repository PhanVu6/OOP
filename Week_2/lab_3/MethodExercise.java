package lab_3;

import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        testExponent(input);
        testMagicSum(input);
        testPrintArray(input);
        testPrintArrayToString(input);
        testContains();
    }

    // 3.1
    public static int exponent(int base, int exp) {
        int taget = 0;
        int halfOfExp;
        int tagetOfHalfOfExpToBase;
        if (exp == 0) {
            taget = 1;
        } else if (exp == 1) {
            taget = base;
        } else if (exp % 2 == 0) {
            halfOfExp = exp / 2;
            tagetOfHalfOfExpToBase = exponent(base, halfOfExp);
            taget = tagetOfHalfOfExpToBase * tagetOfHalfOfExpToBase;
        } else {
            halfOfExp = exp / 2;
            tagetOfHalfOfExpToBase = exponent(base, halfOfExp);
            taget = base * tagetOfHalfOfExpToBase * tagetOfHalfOfExpToBase;
        }
        return taget;
    }

    public static void testExponent(Scanner input) {
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = input.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }

    // 3.2
    public static boolean hasEight(int number) {
        boolean hasEight = false;
        int copyOfNumber = number;
        int digit;
        while (copyOfNumber != 0) {
            digit = copyOfNumber % 10;
            if (digit == 8) {
                hasEight = true;
                break;
            }
            copyOfNumber = copyOfNumber / 10;
        }
        return hasEight;
    }

    public static void testMagicSum(Scanner input) {
        int sum = 0;
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer (or -1 to end): ");
        int number = input.nextInt();
        while (number != -1) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = input.nextInt();
        }
        System.out.println("The magic sum is: " + sum);
    }

    // 3.3
    public static int[] createArray(Scanner input) {
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = input.nextInt();
        System.out.print("Enter the value of all items (seperated by space): ");
        int[] items = new int[NUM_ITEMS];
        for (int i = 0; i < items.length; i++) {
            items[i] = input.nextInt();
        }
        return items;
    }

    public static void print(int[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.println("]");
        } else if (array.length == 1) {
            System.out.println(array[0] + "]");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    System.out.print(array[i] + ", ");
                } else {
                    System.out.print(array[i] + "]");
                }
            }
        }
    }

    public static void testPrintArray(Scanner input) {
        int[] emptyArr = new int[0];
        int[] oneElementArr = { 1 };
        int[] nElementsArr = createArray(input);
        System.out.print("Print empty array: ");
        print(emptyArr);
        System.out.print("Print one-element array: ");
        print(oneElementArr);
        System.out.print("Print n-element array: ");
        print(nElementsArr);
    }

    public static void print(double[] array) {
        System.out.print("[");
        if (array.length == 1) {
            System.out.println(array[0] + "]");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    System.out.print(array[i] + ", ");
                } else {
                    System.out.print(array[i] + "]");
                }
            }
        }
    }

    public static void print(float[] array) {
        System.out.print("[");
        if (array.length == 1) {
            System.out.println(array[0] + "]");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    System.out.print(array[i] + ", ");
                } else {
                    System.out.print(array[i] + "]");
                }
            }
        }
    }

    // 3.4
    public static String arrayToString(int[] array) {
        StringBuilder arrToStr = new StringBuilder();
        arrToStr.append("[");
        if (array.length == 0) {
            arrToStr.append("]");
        } else if (array.length == 1) {
            arrToStr.append(array[0]).append("]");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    arrToStr.append(array[i]).append(", ");
                } else {
                    arrToStr.append(array[i]).append("]");
                }
            }
        }
        return arrToStr.toString();
    }

    public static void testPrintArrayToString(Scanner input) {
        int[] emptyArr = new int[0];
        int[] oneElementArr = { 1 };
        int[] nElementsArr = createArray(input);
        System.out.printf("Print empty array: %s\n", arrayToString(emptyArr));
        System.out.printf("Print one-element array: %s\n", arrayToString(oneElementArr));
        System.out.printf("Print n-element array: %s\n", arrayToString(nElementsArr));
    }

    // 3.5
    public static boolean contains(int[] array, int key) {
        boolean hasKey = false;
        for (int item : array) {
            if (item == key) {
                hasKey = true;
                break;
            }
        }
        return hasKey;
    }

    public static void testContains() {
        int key = 2;
        System.out.printf("Key is: %d\n", key);
        int[] array = { 0, 4, 5, 7, 8, 10 };
        System.out.print("Array is: ");
        print(array);
        System.out.println();
        if (contains(array, key)) {
            System.out.println("Array contains key " + key);
        } else {
            System.out.println("Array not contains key " + key);
        }
    }

}