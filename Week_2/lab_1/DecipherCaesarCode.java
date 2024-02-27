package lab_1;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        testCipherCaesarCode(inputScanner);
    }

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

    public static void testCipherCaesarCode(Scanner inputScanner){
        System.out.print("Enter a plaintext string: ");
        String inStr = inputScanner.next();

        inStr = inStr.toUpperCase();
        System.out.print("The cipertext string is: " + decipherCaesarCode(inStr));
    }
}
