package lab_1;

import java.util.Scanner;

public class CheckHexString {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        testHexString(inputScanner);
    }

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
    }

}
