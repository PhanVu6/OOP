package lab_1;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        testPhoneKeyPad(inputScanner);
    }
    
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

    }
    
}