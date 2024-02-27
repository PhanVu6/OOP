package lab_1;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        testHexadecimalToDecimal(inputScanner);
    }

    public static int hexadecimalToDecimal(String hexStr){
        int hexStrToDecimalNumber = 0;
        int lengthHex = hexStr.length() - 1;
        for (int i = 0; i < hexStr.length(); i++) {
            if (hexStr.charAt(i) >= 48 && hexStr.charAt(i) <= 57) {
                hexStrToDecimalNumber += (int) ((hexStr.charAt(i) - 48)*Math.pow(16, lengthHex));
            }
            else if (hexStr.charAt(i) >= 97 && hexStr.charAt(i) <= 102){
                hexStrToDecimalNumber += (int) ((hexStr.charAt(i) - 97 + 10)*Math.pow(16, lengthHex));
            }
            lengthHex--;
        }
        return hexStrToDecimalNumber;
    }

    public static boolean isHexString(String hexStr){
        for (char inChar : hexStr.toCharArray()) {
            boolean conditionNumber = inChar >= '0' && inChar <= '9';
            boolean conditionVowels = (inChar >= 'a' && inChar <= 'f');
            if (!(conditionNumber || conditionVowels)){
                return false;
            }
        }

        return true;
    }
    
    public static void testHexadecimalToDecimal(Scanner inputScanner) {
        System.out.print("Enter a hex string: ");
        String hexStr = inputScanner.next();

        hexStr = hexStr.toLowerCase();
        if (isHexString(hexStr)) {
            System.out.printf("The equivalent decimal number for the hexadecimal \"%s\" is: %d", hexStr, hexadecimalToDecimal(hexStr));
        }
        else {
            System.out.println("error: invalid hexadecimal string \"" + hexStr + "\"");
        }
    }
}
