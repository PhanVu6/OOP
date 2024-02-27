package lab_1;
import java.util.Scanner;

public class StringAndCharacterExercise {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        testReverse(inputScanner);
        testCountVowelsDigits(inputScanner);
        testPhoneKeyPad(inputScanner);
        testCipherCaesarCode(inputScanner);
        testDecipherCaesarCode(inputScanner);
        testHexString(inputScanner);
        testBinaryToDecimal(inputScanner);
        testHexadecimalToDecimal(inputScanner);
        testOctaldecimalToDecimal(inputScanner);
        testRadixNToDecimal(inputScanner);
    }

    // 1.1
    public static String reverseString(String str){
        String temp = "";
        for(int index = str.length() - 1; index >= 0; index--){
            temp += str.charAt(index);
        }
        return temp;
    }

    public static void testReverse(Scanner inputScanner) {
        System.out.print("Enter a String: ");
        String str = inputScanner.next();
        
        System.out.printf("The reverse of  the String \"%s\" is \"%s\".", str, reverseString(str));
        System.out.println();
    }

    // 1.2
    public static int countVowels(String inStr){
        int count = 0;

        for (char ch:inStr.toCharArray()){
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        
        return count;
    }

    public static int countDigits(String inStr){
        int converstDec;
        int count = 0;

        for (int index = 0; index < inStr.length(); index++){
            converstDec = (int) inStr.charAt(index);
            if(converstDec <= 57 && converstDec >= 48){
                count++;
            }
        }
        
        return count;
    }

    public static void testCountVowelsDigits(Scanner inputScanner) {
        System.out.print("Enter a String: ");
        String inStr = inputScanner.next();
        double rateVowels = (double) countVowels(inStr)*100/inStr.length();
        double rateDigits = (double) countDigits(inStr)*100/inStr.length();
            
        System.out.printf("Number of vowels: %d (%.2f%%)%n", countVowels(inStr), rateVowels);
        System.out.printf("Number of digits: %d (%.2f%%)%n", countDigits(inStr), rateDigits);
        System.out.println();
    }

    // 1.3
    public static String phoneKeyPadMethodIfElse(String inStr) {
        String str = "";

        for (char ch : inStr.toCharArray()) {
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                str += 2;
            } else if (ch == 'd' || ch == 'e' || ch == 'f') {
                str += 3;
            } else if (ch == 'g' || ch == 'h' || ch == 'i') {
                str += 4;
            } else if (ch == 'j' || ch == 'k' || ch == 'l') {
                str += 5;
            } else if (ch == 'm' || ch == 'n' || ch == 'o') {
                str += 6;
            } else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
                str += 7;
            } else if (ch == 't' || ch == 'u' || ch == 'v') {
                str += 8;
            } else if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
                str += 9;
            }
        }
        return str;
    }

    public static String phoneKeyPadMethodSwitchCase(String inStr) {
        String str = "";

        for (char inChar : inStr.toCharArray()) {
            switch (inChar) {
                case 'a':
                case 'b':
                case 'c': // No break for 'a' and 'b', fall through 'c'
                    str += 2;
                    break;
                case 'd':
                case 'e':
                case 'f':
                    str += 3;
                    break;
                case 'g':
                case 'h':
                case 'i':
                str += 4;
                    break;
                case 'j':
                case 'k':
                case 'l':
                    str += 5;
                    break;
                case 'm':
                case 'n':
                case 'o':
                    str += 6;
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    str += 7;
                    break;
                case 't':
                case 'u':
                case 'v':
                    str += 8;
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    str += 9;
                    break;
                default:
                    break;
            }
        }
        return str;
    }

    public static void testPhoneKeyPad(Scanner inputScanner) {
        System.out.print("Enter a String: ");
        String inStr = inputScanner.next();

        inStr = inStr.toLowerCase();
        System.out.printf("(If Else) Convert String \"%s\" return number is: %s", inStr, phoneKeyPadMethodIfElse(inStr));
        System.out.println();
        System.out.printf("(Swwitch Case) Convert String \"%s\" return number is: %s", inStr, phoneKeyPadMethodSwitchCase(inStr));
        System.out.println();
    }

    // 1.4
    public static String cipherCaesarCode(String inStr){
        String str = "";
        int tempValueByteChar = 0;

        for(char inChar:inStr.toCharArray()){
            tempValueByteChar = (int) inChar + 3;
            if (tempValueByteChar > 90 && tempValueByteChar <= 93) {
                str += (char) (tempValueByteChar - 90 + 64);
            }
            else if (tempValueByteChar < 65 || tempValueByteChar > 93) {
                str += (char) (tempValueByteChar - 3);
            }else{
                str += (char) (tempValueByteChar);
            }
        }
        return str;
    }

    public static void testCipherCaesarCode(Scanner inputScanner){
        System.out.print("Enter a plaintext string: ");
        String inStr = inputScanner.next();

        inStr = inStr.toUpperCase();
        System.out.print("The cipertext string is: " + cipherCaesarCode(inStr));
        System.out.println();
    }

    // 1.5
    public static String decipherCaesarCode(String inStr) {
        String str = "";
        int tempValueByteChar = 0;

        for(char inChar:inStr.toCharArray()){
            tempValueByteChar = (int) inChar - 3;
            if (tempValueByteChar < 65 && tempValueByteChar >= 62 ) {
                str += (char) (tempValueByteChar + 90 - 64);
            }
            else if (tempValueByteChar > 90 || tempValueByteChar < 62) {
                str += (char) (tempValueByteChar + 3);
            }else{
                str += (char) (tempValueByteChar);
            }
        }
        return str;
    }

    public static void testDecipherCaesarCode(Scanner inputScanner){
        System.out.print("Enter a plaintext string: ");
        String inStr = inputScanner.next();

        inStr = inStr.toUpperCase();
        System.out.print("The cipertext string is: " + decipherCaesarCode(inStr));
        System.out.println();
    }

    // 1.6
    public static boolean isHexString(String hexStr){
        for (char inChar : hexStr.toCharArray()) {
            boolean conditionNumber = inChar >= '0' && inChar <= '9';
            boolean conditionVowels = (inChar >= 'A' && inChar <= 'F') || (inChar >= 'a' && inChar <= 'f');
            if (!(conditionNumber || conditionVowels)){
                return false;
            }
        }

        return true;
    }

    public static void testHexString(Scanner inputScanner){
        System.out.print("Enter a hex string: ");
        String inStr = inputScanner.next();

        if (isHexString(inStr)){
            System.out.printf("\"%s\" is a hex string", inStr);
        }else{
            System.out.printf("\"%s\" is NOT a hex string", inStr);
        }  
        System.out.println();
    }

    // 1.7
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
        System.out.println();
    }

    // 1.8
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

    public static boolean isHexStringCheck(String hexStr){
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
        if (isHexStringCheck(hexStr)) {
            System.out.printf("The equivalent decimal number for the hexadecimal \"%s\" is: %d", hexStr, hexadecimalToDecimal(hexStr));
        }
        else {
            System.out.println("error: invalid hexadecimal string \"" + hexStr + "\"");
        }
    }

    // 1.9
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

    public static void testOctaldecimalToDecimal(Scanner input) {
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

    // 1.10
    public static int radixNToDecimal(String radixNStr, int radix){
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
                radixNStrToDecimalNumber += (convertCharToDecimal*Math.pow(radix, lengthRadix));
            }
            else if (radix != 16 && convertCharToDecimal >= 0 && convertCharToDecimal <= radix) {
                radixNStrToDecimalNumber += (int) ((radixNStr.charAt(i) - 48)*Math.pow(radix, lengthRadix));
            }
            else if (radixNStr.charAt(i) >= 97 && radixNStr.charAt(i) <= 102){
                radixNStrToDecimalNumber += (int) ((radixNStr.charAt(i) - 97 + 10)*Math.pow(radix, lengthRadix));
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
