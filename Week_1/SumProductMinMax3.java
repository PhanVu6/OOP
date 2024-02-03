import java.util.Scanner;

public class SumProductMinMax3 {

    // Hàm để tính tổng của ba số
    private static int calculateSum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    // Hàm để tính tích của ba số
    private static int calculateProduct(int number1, int number2, int number3) {
        return number1 * number2 * number3;
    }

    // Hàm để tìm giá trị nhỏ nhất trong ba số
    private static int findMin(int number1, int number2, int number3) {
        return Math.min(Math.min(number1, number2), number3);
    }

    // Hàm để tìm giá trị lớn nhất trong ba số
    private static int findMax(int number1, int number2, int number3) {
        return Math.max(Math.max(number1, number2), number3);
    }


    public static void main(String[] args) {        
        int number1;
        int number2;
        int number3;
        
        Scanner in = new Scanner(System.in); 

        System.out.print("Nhập số nguyên thứ nhất: ");
        number1 = in.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        number2 = in.nextInt();

        System.out.print("Nhập số nguyên thứ ba: ");
        number3 = in.nextInt();

        in.close();
        
        System.out.println("Tổng là: " + calculateSum(number1, number2, number3));
        System.out.println("Tích là: " + calculateProduct(number1, number2, number3));
        System.out.println("Giá trị nhỏ nhất là: " + findMin(number1, number2, number3));
        System.out.println("Giá trị lớn nhất là: " + findMax(number1, number2, number3));
    }
}
