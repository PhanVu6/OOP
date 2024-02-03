import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageWithInputValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_STUDENTS = 3;

        int numberIn = 0;
        boolean isValid;
        int sum = 0;
        double average;

        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {

            System.out.print("Enter mark for student " + studentNo + ": ");

            isValid = false;
            
            do {
                
                try {
                    numberIn = sc.nextInt();

                    if (numberIn >= 0 && numberIn <= 100) {
                        isValid = true;
                    } else {
                        System.out.println("Invalid input. Please enter a number between 0 and 100.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.next();
                }
            } while (!isValid);

            sum += numberIn;
        }

        average = (double) sum / NUM_STUDENTS;
        System.out.println("The average mark is: " + average);

    }
}