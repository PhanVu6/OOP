package lab_1;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        testBinaryToDecimal(inputScanner);
    }

    public static int binaryToDecimal(String binStr) {
        int decimalNumber = 0;
        int lengthOfBinStr = binStr.length() - 1;
        for (int i = 0; i < binStr.length(); i++) {
            decimalNumber += (int) ((binStr.charAt(i) - 48) * Math.pow(2, lengthOfBinStr));
            lengthOfBinStr--;
        }

        return decimalNumber;
    }

    public static boolean isBinaryString(String binStr) {
        for (int i = 0; i < binStr.length(); i++) {
            if (binStr.charAt(i) < '0' && binStr.charAt(i) > '1') {
                return false;
            }
        }
        return true;
    }

    public static void testBinaryToDecimal(Scanner inputScanner) {
        System.out.print("Enter a Binary string: ");
        String binaryStr = inputScanner.nextLine();

        if (isBinaryString(binaryStr)) {
            System.out.println("The equivalent decimal number for binary \"" + binaryStr + "\" is: " + binaryToDecimal(binaryStr));
        } else {
            System.out.println("error: invalid binary string \"" + binaryStr + "\"");
        }
    }
}
