import java.util.Scanner;

public class SumProductMinMax5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = getUserInput("Nhập số nguyên thứ " + (i + 1) + ": ", scanner);
        }
        displayResults(numbers);
        scanner.close();
    }

    private static int getUserInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static int calculateProduct(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    private static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    private static void displayResults(int[] numbers) {
        int sum = calculateSum(numbers);
        int product = calculateProduct(numbers);
        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Tổng là: " + sum);
        System.out.println("Tích là: " + product);
        System.out.println("Giá trị nhỏ nhất là: " + min);
        System.out.println("Giá trị lớn nhất là: " + max);
    }
}
