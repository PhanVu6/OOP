package lab_1;

import java.util.Scanner;

public class CountVowelsDigits{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        testCountVowelsDigits(inputScanner);
    }

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
        String inStr = inputScanner.nextLine();
        double rateVowels = (double) countVowels(inStr)*100/inStr.length();
        double rateDigits = (double) countDigits(inStr)*100/inStr.length();
            
        System.out.printf("Number of vowels: %d (%.2f%%)%n", countVowels(inStr), rateVowels);
        System.out.printf("Number of digits: %d (%.2f%%)%n", countDigits(inStr), rateDigits);
    }

}