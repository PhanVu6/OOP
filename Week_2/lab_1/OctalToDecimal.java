package lab_1;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        testHexadecimalToDecimal(input);
    }

    public static int octalToDecimal(String octalStr){
        int octalStrToDecimalNumber = 0;
        int lengthOctal = octalStr.length() - 1;
        for (int i = 0; i < octalStr.length(); i++) {
            if (octalStr.charAt(i) >= 48 && octalStr.charAt(i) <= 55) {
                octalStrToDecimalNumber += (int) ((octalStr.charAt(i) - 48)*Math.pow(8, lengthOctal));
            }
            lengthOctal--;
        }
        return octalStrToDecimalNumber;
    }

    public static boolean isOctalString(String octalStr){
        for (char inChar : octalStr.toCharArray()) {
            boolean conditionNumber = inChar >= '0' && inChar <= '7';
            if (!(conditionNumber)){
                return false;
            }
        }

        return true;
    }

    public static void testHexadecimalToDecimal(Scanner input) {
        System.out.print("Enter an Octal string: ");
        String octalStr = input.next();

        octalStr = octalStr.toLowerCase();
        if (isOctalString(octalStr)) {
            System.out.printf("The equivalent decimal number \"%s\" is: %d", octalStr, octalToDecimal(octalStr));
        }
        else {
            System.out.println("error: invalid Octal string \"" + octalStr + "\"");
        }
    }
}
