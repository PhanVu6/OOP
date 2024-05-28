package matrix;

import java.util.Random;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        /*
         * TODO
         * Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5,
         * 10].
         * Viết code thực hiện test các chức năng sau của các ma trận:
         * - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
         * - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
         * - In ra ma trận là ma trận tổng của 2 ma trận.
         * - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
         * - In ra ma trận là ma trận tích của 2 ma trận.
         * - In ra các số nguyên tố có trong 2 ma trận.
         * 
         * Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source
         * code chương trình.
         * File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt>
         * (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */
        Random random = new Random();
        int size = random.nextInt(5, 10);

        SquareMatrix squareMatrix1 = new SquareMatrix(size);
        SquareMatrix squareMatrix2 = new SquareMatrix(size);
        System.out.println("Matrix 1: \n" + squareMatrix1);
        System.out.println("Matrix 2: \n" + squareMatrix2);
        System.out.println();

        testSort(squareMatrix2);
        testTranspose(squareMatrix1, squareMatrix2);
        testDiagonal(squareMatrix1, squareMatrix2);
        testAdd(squareMatrix1, squareMatrix2);
        testMinus(squareMatrix1, squareMatrix2);
        testMultiply(squareMatrix1, squareMatrix2);
        testPrime(squareMatrix1, squareMatrix2);

    }

    // Chuyển vị
    public static void testTranspose(SquareMatrix squareMatrix1, SquareMatrix squareMatrix2) {
        System.out.println("Chuyen Vi matrix 1: ");
        System.out.println(squareMatrix1.transpose());
        System.out.println();

        System.out.println("Chuyen Vi matrix 2: ");
        System.out.println(squareMatrix2.transpose());
        System.out.println();
    }

    // In đường chéo
    public static void testDiagonal(SquareMatrix squareMatrix1, SquareMatrix squareMatrix2) {
        int[] mainDiagonal;
        int[] secondDiagonal;
        mainDiagonal = squareMatrix1.principalDiagonal();
        secondDiagonal = squareMatrix1.secondaryDiagonal();

        System.out.println("Duong cheo chinh cua matrix 1: ");
        for (int i = 0; i < mainDiagonal.length; i++) {
            System.out.print(mainDiagonal[i] + " ");
        }
        System.out.println();
        System.out.println("Duong cheo phu cua matrix 1: ");
        for (int i = 0; i < secondDiagonal.length; i++) {
            System.out.print(secondDiagonal[i] + " ");
        }
        System.out.println();

        mainDiagonal = squareMatrix2.principalDiagonal();
        secondDiagonal = squareMatrix2.secondaryDiagonal();

        System.out.println("Duong cheo chinh cua matrix 2: ");
        for (int i = 0; i < mainDiagonal.length; i++) {
            System.out.print(mainDiagonal[i] + " ");
        }
        System.out.println();
        System.out.println("Duong cheo phu cua matrix 2: ");
        for (int i = 0; i < secondDiagonal.length; i++) {
            System.out.print(secondDiagonal[i] + " ");
        }
        System.out.println();
    }

    // In ra tổng 2 matrix
    public static void testAdd(SquareMatrix squareMatrix1, SquareMatrix squareMatrix2) {
        System.out.println("Tong 2 matrix: \n" + squareMatrix1.add(squareMatrix2));
    }

    // In ra hiệu 2 matrix
    public static void testMinus(SquareMatrix squareMatrix1, SquareMatrix squareMatrix2) {
        System.out.println("Hieu 2 matrix: \n" + squareMatrix1.minus(squareMatrix2));
    }

    // In ra tích 2 matrix
    public static void testMultiply(SquareMatrix squareMatrix1, SquareMatrix squareMatrix2) {
        System.out.println("Tong 2 matrix: \n" + squareMatrix1.multiply(squareMatrix2));
    }

    // In đường chéo
    public static void testPrime(SquareMatrix squareMatrix1, SquareMatrix squareMatrix2) {
        int[] primeMatrixFirst;
        int[] primeMatrixSecond;

        primeMatrixFirst = squareMatrix1.primes();
        System.out.println("So nguyen to matrix 1: ");
        for (int i = 0; i < primeMatrixFirst.length; i++) {
            System.out.print(primeMatrixFirst[i] + " ");
        }
        System.out.println();

        primeMatrixSecond = squareMatrix2.primes();
        System.out.println("So nguyen to matrix 2: ");
        for (int i = 0; i < primeMatrixSecond.length; i++) {
            System.out.print(primeMatrixSecond[i] + " ");
        }
        System.out.println();
    }

    public static void testSort(SquareMatrix squareMatrix) {
        System.out.println("Sap xep matrix tang dan: ");
        System.out.println(squareMatrix.getSortedMatrix());
        System.out.println();
    }
}
