package Week_3;

import java.util.Scanner;

public class MathLibraryHomework {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);

        // 5.1 Trigonometric Series
        testTrigonometricSeries(inpScanner);
        // 5.2 Exponential Series
        testSpecialSeries(inpScanner);
        // 5.3 FactorialInt (Handling Overflow)
        printFactorialInt();
        printFactorialLong();
        // 5.4 FibonacciInt (Handling Overflow)
        fibonacciInt();
        // 5.5 Number System Conversion
        testToRadix(inpScanner);
    }

    // 5.1 Trigonometric Series
    public static void testTrigonometricSeries(Scanner in) {
        System.out.print("Enter the value x: ");
        double x = in.nextDouble();
        System.out.print("Enter the mum term: ");
        int numTerms = in.nextInt();
        System.out.println("Value of sin by method: " + sin(x, numTerms));
        System.out.println("Value of sin by libary Math: " + Math.sin(x));
        System.out.println("Value of cos by method: " + cos(x, numTerms));
        System.out.println("Value of cos by libary Math: " + Math.cos(x));

    }

    public static double sin(double x, int numTerms) {
        double result = 0;
        double term = x;
        int bottom = 0;
        for (int i = 2; i <= numTerms + 1; i++) {
            result += term;
            bottom = (i * 2 - 1) * (i * 2 - 2);
            term *= -1 * x * x / bottom;
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 0;
        double term = 1;
        int bottom = 0;
        for (int i = 1; i <= numTerms; i++) {
            result += term;
            bottom = (i * 2) * (i * 2 - 1);
            term *= -1 * x * x / bottom;
        }
        return result;
    }

    // 5.2 Exponential Series
    public static void testSpecialSeries(Scanner in) {
        System.out.print("Enter the value x (-1 <= x <= 1): ");
        double x = in.nextDouble();
        System.out.print("Enter the mum term: ");
        int numTerms = in.nextInt();

        System.out.print("Value special series: " + specialSeries(x, numTerms));
    }

    public static double specialSeries(double x, int numTerms) {
        double result = 0;
        double term = x;
        double num = 0;
        if (x >= -1 && x <= 1) {
            for (int i = 1; i < numTerms; i++) {
                result += term;
                num = (double) (2 * i - 1) / (2 * i);
                term += num * x * x / (2 * i + 1);
            }
        } else {
            System.out.println("Error about value x");
        }
        return result;
    }

    // 5.3 FactorialInt (Handling Overflow)
    public static void printFactorialInt() {
        int n = 0;
        while (Integer.MAX_VALUE / factorialInt(n) > n + 1) {
            n++;
            System.out.println("The factorial of " + n + " is " + factorialInt(n));
        }
        System.out.println("The factorial of " + (n + 1) + " is out of range");
    }

    public static int factorialInt(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void printFactorialLong() {
        long n = 0;
        while (Long.MAX_VALUE / factorialLong(n) > n + 1) {
            n++;
            System.out.println("The factorial of " + n + " is " + factorialLong(n));
        }
        System.out.println("The factorial of " + (n + 1) + " is out of range");
    }

    public static long factorialLong(long n) {
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 5.4 FibonacciInt (Handling Overflow)
    public static void fibonacciInt() {
        int n = 0;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int fn;

        System.out.println("F(" + n + ") = " + fnMinus1);
        n++;
        System.out.println("F(" + n + ") = " + fnMinus2);

        while (Integer.MAX_VALUE - fnMinus1 > fnMinus2) {
            n++;
            fn = fnMinus1 + fnMinus2;
            System.out.println("F(" + n + ") = " + fn);
            fnMinus1 = fnMinus2;
            fnMinus2 = fn;
        }
        System.out.println("F(" + (n + 1) + ") is out of range of int");
    }

    // 5.5 Number System Conversion
    public static void testToRadix(Scanner in) {
        System.out.print("Enter a number and radix: ");
        String inStr = in.next();
        System.out.print("Enter the input radix: ");
        int inRadix = in.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = in.nextInt();
        in.close();

        System.out.printf(
                "\"%s\" in radix %d is \"%s\" in radix %d",
                inStr,
                inRadix,
                toRadix(inStr, inRadix, outRadix),
                outRadix);
    }

    public static String toRadix(String inStr, int inRadix, int outRadix) {
        inStr = inStr.toUpperCase();

        // convert input radix to decimal
        int numDec = 0;
        int idx = 0;
        while (idx < inStr.length()) {
            char inChar = inStr.charAt(inStr.length() - idx - 1);
            if ('0' <= inChar && inChar <= '9') {
                numDec += Math.pow(inRadix, idx) * Character.getNumericValue(inChar);
            } else {
                numDec += Math.pow(inRadix, idx) * (inChar - 55);
            }
            idx++;
        }

        if (outRadix == 10) {
            return String.valueOf(numDec);
        }

        // convert decimal to output radix
        StringBuilder result = new StringBuilder();
        while (numDec > 0) {
            int term = numDec % outRadix;
            if (term <= 9) {
                result.insert(0, term);
            } else {
                result.insert(0, (char) (term + 55));
            }
            numDec /= outRadix;
        }
        return result.toString();
    }

}
