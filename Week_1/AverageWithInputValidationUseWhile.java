import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageWithInputValidationUseWhile {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner in = new Scanner(System.in);

        final int NUM_STUDENTS = 3;
        int mark;
        int sum = 0;
        double average;
        for (int i = 1; i <= NUM_STUDENTS; i++) {
            System.out.print("Enter the mark (0-100) for student " + i + ":");
            mark = in.nextInt();

            while (mark < 0 || mark > 100) {
                System.out.println("Invalid input, try again...");
                System.out.print("Enter the mark (0-100) for student " + i + ":");
                mark = in.nextInt();
            }
            sum += mark;
        }
        average = (double) sum / NUM_STUDENTS;
        System.out.println("The average is: " + df.format(average));
    }
}