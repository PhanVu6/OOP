package Week_3;

import java.util.Scanner;

public class StringAndCharacterHomework {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        // 3.1 Exchange Cipher
        testExchangeCipher(inpScanner);
        // 3.2 TestPalindromicWord and TestPalindromicPhrase
        testPalindromicWord(inpScanner);
    }

    // 3.1 Exchange Cipher
    public static void testExchangeCipher(Scanner in) {
        System.out.print("Enter a plaintext string: ");
        String inStr = in.next().toUpperCase();
        System.out.println("The cipher text stringis: " + exchangeCipher(inStr));
    }

    public static String exchangeCipher(String inStr) {
        String cipherStr = "";
        for (char inChar : inStr.toCharArray()) {
            cipherStr += (char) (155 - inChar);
        }
        return cipherStr;
    }

    // 3.2 TestPalindromicWord and TestPalindromicPhrase
    public static void testPalindromicWord(Scanner in) {
        System.out.print("Enter a word to check palindrome: ");
        String wordSymmetry = in.nextLine().toUpperCase();
        if (isPalindromicWord(wordSymmetry)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.print("Enter the string to check palindrome: ");
        wordSymmetry = in.nextLine().toUpperCase();
        if (isPalindromicPhrase(wordSymmetry)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static String reverseString(String inStr) {
        String temp = "";
        for (int i = inStr.length() - 1; i >= 0; i--) {
            temp += inStr.charAt(i);
        }
        return temp;
    }

    public static boolean isPalindromicWord(String inStr) {

        if (!reverseString(inStr).equals(inStr)) {
            return false;
        }
        return true;
    }

    public static boolean isPalindromicPhrase(String inStr) {
        inStr = inStr.replaceAll("[^\\w\\\\s]", "");
        if (!reverseString(inStr).equals(inStr)) {
            return false;
        }
        return true;
    }
}
