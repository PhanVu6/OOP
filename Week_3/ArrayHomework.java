package Week_3;

import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        // 4.1 PrintArrayInStars
        printArrayInStars(inpScanner);
        // 4.2 Matrices (2D Arrays)
        testMatrix(inpScanner);
    }

    // 4.1 PrintArrayInStars
    public static void printArrayInStars(Scanner in) {
        System.out.print("Enter the number of items: ");
        final int NUM_ITEM = in.nextInt();
        int[] items = new int[NUM_ITEM];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < items.length; i++) {
            items[i] = in.nextInt();
        }

        for (int idx = 0; idx < items.length; ++idx) { // row
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= items[idx]; ++starNo) { // column
                System.out.print("*");
            }
            System.out.println("(" + items[idx] + ")");
        }

    }

    // 4.2 Matrices (2D Arrays)
    public static void testMatrix(Scanner in) {
        System.out.print("Enter the size row 1: ");
        int sizeRowOne = in.nextInt();
        System.out.print("Enter the size col 1: ");
        int sizeColOne = in.nextInt();
        int[][] matrix1 = new int[sizeRowOne][sizeColOne];
        System.out.println("Enter the matrix 1: ");
        for (int i = 0; i < sizeRowOne; i++) {
            for (int j = 0; j < sizeColOne; j++) {
                matrix1[i][j] = in.nextInt();
            }
        }

        System.out.print("Enter the size row 2: ");
        int sizeRowTwo = in.nextInt();
        System.out.print("Enter the size col 2: ");
        int sizeColTwo = in.nextInt();
        int[][] matrix2 = new int[sizeRowTwo][sizeColTwo];
        System.out.println("Enter the matrix 2: ");
        for (int i = 0; i < sizeRowTwo; i++) {
            for (int j = 0; j < sizeColTwo; j++) {
                matrix2[i][j] = in.nextInt();
            }
        }
        System.out.print("Total matrix: ");
        add(matrix1, matrix2);
        System.out.print("Subtract matrix: ");
        subtract(matrix1, matrix2);
        System.out.print("Multiply matrix: ");
        multiply(matrix1, matrix2);

    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Used in add(), subtract()
    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        boolean compareCol = matrix1[0].length == matrix2[0].length;
        boolean compareRow = matrix1.length == matrix2.length;
        if (compareRow && compareCol) {
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        boolean compareCol = matrix1[0].length == matrix2[0].length;
        boolean compareRow = matrix1.length == matrix2.length;
        if (compareRow && compareCol) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix2.length][matrix2[0].length];

        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2.length; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
                System.out.println();
            }
        } else {
            System.out.println("No same dimension");
        }

        print(result);
        return result;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix2.length][matrix2[0].length];

        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2.length; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
                System.out.println();
            }
        } else {
            System.out.println("No same dimension");
        }

        print(result);
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix2.length][matrix2[0].length];

        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2.length; j++) {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
                System.out.println();
            }
        } else {
            System.out.println("No same dimension");
        }
        print(result);
        return result;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix2.length][matrix2[0].length];

        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2.length; j++) {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
                System.out.println();
            }
        } else {
            System.out.println("No same dimension");
        }

        print(result);
        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix2.length][matrix2[0].length];

        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2.length; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < matrix2.length; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("No same dimension");
        }

        print(result);
        return result;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix2.length][matrix2[0].length];

        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2.length; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < matrix2.length; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("No same dimension");
        }

        print(result);
        return result;
    }

    // Other methods can be added here

}
