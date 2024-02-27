package lab_1;
import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        testReverse(inputScanner);
    }
    
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
    }
}