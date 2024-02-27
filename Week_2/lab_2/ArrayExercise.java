package lab_2;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        // 2.1
        createArray(inpScanner);
        printArray(array);
        // 2.2
        generateStudentGrade(inpScanner);
        // 2.3
        testHexadecimalToBinary(inpScanner);
        // 2.4
        testDecimalToHexadecimal(inpScanner);
    }

    // 2.1
    static int[] array;

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

    // 2.2
    public static int[] generateStudentGrade(Scanner in) {
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();

        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Enter the grade for student %d: ", i + 1);
            grades[i] = in.nextInt();
            if (grades[i] > 100) {
                System.out.println("error: Grade over 100");
                break;
            }
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

    // 2.3
    public static String hexadecimalToBinary(String hexStr) {
        final String[] HEX_BITS = { "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111" };
        String str = "";
        int tempChar = 0;

        for (char inChar : hexStr.toCharArray()) {
            tempChar = Character.getNumericValue(inChar);
            str += " " + HEX_BITS[tempChar];
        }
        return str;
    }

    public static void testHexadecimalToBinary(Scanner in) {
        System.out.print("Enter a hexadecimal string: ");
        String str = in.next();

        System.out.printf("The equivalent binary for hexadecimal \"%s\" is: %s", str, hexadecimalToBinary(str));
    }

    // 2.4
    public static String decimalToHexadecimal(int positiveInteger) {
        String str = "";
        int surplus;
        while (positiveInteger > 1) {
            surplus = positiveInteger % 16;
            positiveInteger /= 16;
            if (surplus >= 0 && surplus <= 9) {
                str += surplus;
            } else {
                switch (surplus) {
                    case 10:
                        str += 'A';
                        break;
                    case 11:
                        str += 'B';
                        break;
                    case 12:
                        str += 'C';
                        break;
                    case 13:
                        str += 'D';
                        break;
                    case 14:
                        str += 'E';
                        break;
                    case 15:
                        str += 'F';
                        break;
                }
            }
        }

        // Reverse
        String hexString = "";
        for (int index = str.length() - 1; index >= 0; index--) {
            hexString += str.charAt(index);
        }
        return hexString;
    }

    public static void testDecimalToHexadecimal(Scanner in) {
        System.out.print("Enter a decimal number: ");
        int positiveInteger = in.nextInt();
        System.out.print("The equivalent hexadecimal number is: ");
        System.out.println(decimalToHexadecimal(positiveInteger));
    }
}
