package lab_1;

import java.util.Scanner;

public class RadixNToDecimal {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        testRadixNToDecimal(inpScanner);
    }

    public static int radixNToDecimal(String radixNStr, int radix) {
        int radixNStrToDecimalNumber = 0;
        int lengthRadix = radixNStr.length() - 1;
        int convertCharToDecimal = 0;
        radixNStr = radixNStr.toLowerCase();
        if (radix > 16) {
            System.out.println("error: value than invalid hexadecimal string \"" + radix + "\" then return 0");
            return 0;
        }

        for (int i = 0; i < radixNStr.length(); i++) {
            convertCharToDecimal = Character.getNumericValue(radixNStr.charAt(i));
            if (radix == 16 && convertCharToDecimal >= 0 && convertCharToDecimal <= 9) {
                radixNStrToDecimalNumber += (convertCharToDecimal * Math.pow(radix, lengthRadix));
            } else if (radix != 16 && convertCharToDecimal >= 0 && convertCharToDecimal <= radix) {
                radixNStrToDecimalNumber += (int) ((radixNStr.charAt(i) - 48) * Math.pow(radix, lengthRadix));
            } else if (radixNStr.charAt(i) >= 97 && radixNStr.charAt(i) <= 102) {
                radixNStrToDecimalNumber += (int) ((radixNStr.charAt(i) - 97 + 10) * Math.pow(radix, lengthRadix));
            }
            lengthRadix--;
        }
        return radixNStrToDecimalNumber;
    }

    public static void testRadixNToDecimal(Scanner inpScanner) {
        System.out.print("Enter the radix: ");
        int radix = inpScanner.nextInt();
        inpScanner.nextLine();
        System.out.print("Enter the String: ");
        String inStr = inpScanner.nextLine();
        System.out.println("The equivalent decimal number \"" + inStr + "\" is: " + radixNToDecimal(inStr, radix));
    }
}
