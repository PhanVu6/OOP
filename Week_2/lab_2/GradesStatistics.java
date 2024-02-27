package lab_2;

import java.util.Scanner;

public class GradesStatistics {

    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        generateStudentGrade(inpScanner);
    }

    public static int[] generateStudentGrade(Scanner in) {
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();

        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Enter the grade for student %d: ", i + 1);
            grades[i] = in.nextInt();
        }
        simpleGradesStatistics(grades);
        return grades;
    }

    public static void simpleGradesStatistics(int[] grades) {
        double sum = 0;
        double average = 0;
        int minimum = grades[0];
        int maximum = grades[0];

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            if (minimum >= grades[i]) {
                minimum = grades[i];
            }
            if (maximum <= grades[i]) {
                maximum = grades[i];
            }
        }

        average = sum / grades.length;
        System.out.printf("The average is: %.2f", average);
        System.out.println();
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);
    }

}
