package hus.oop.lab5.mycomplex;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imagninary part): ");
        MyComplex complex1 = new MyComplex(inpScanner.nextDouble(), inpScanner.nextDouble());
        System.out.print("Enter complex number 2 (real and imagninary part): ");
        MyComplex complex2 = new MyComplex(inpScanner.nextDouble(), inpScanner.nextDouble());
        System.out.println();
        System.out.println("Number 1 is: " + complex1);
        if (complex1.isReal()) {
            System.out.printf("%s is a pure real number", complex1);
            System.out.println();
        } else {
            System.out.printf("%s is NOT a pure real number", complex1);
            System.out.println();
        }
        if (complex1.isImagninary()) {
            System.out.printf("%s is a pure imagninary number", complex1);
            System.out.println();
        } else {
            System.out.printf("%s is NOT a pure imagninary number", complex1);
            System.out.println();
        }
        System.out.println();

        System.out.println("Number 2 is: " + complex2);
        if (complex2.isReal()) {
            System.out.printf("%s is a pure real number", complex2);
            System.out.println();
        } else {
            System.out.printf("%s is NOT a pure real number", complex2);
            System.out.println();
        }

        if (complex2.isImagninary()) {
            System.out.printf("%s is a pure imagninary number", complex2);
            System.out.println();
        } else {
            System.out.printf("%s is NOT a pure imagninary number", complex2);
            System.out.println();
        }
        System.out.println();

        if (complex1.equals(complex2)) {
            System.out.printf("%s is equal to %s", complex1, complex2);
            System.out.println();
            System.out.printf("%s + %s = %s", complex1, complex2, complex1.add(complex2));
            System.out.println();
        } else {
            System.out.printf("%s is NOT equal to %s", complex1, complex2);
            System.out.println();
            System.out.printf("%s + %s = %s", complex1, complex2, complex1.add(complex2));
        }

    }
}
