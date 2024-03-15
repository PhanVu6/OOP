package hus.oop.lab5.mycomplex;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex();
        System.out.println(complex1);
        MyComplex complex2 = new MyComplex(1.0, 3.0);
        System.out.println(complex2);

        // test getters and magnitude()
        System.out.println("Real of complex1 is " + complex1.getReal());
        System.out.println("Imag of complex1 is " + complex1.getImag());
        System.out.printf("Magnitude of complex2 is %.2f\n", complex2.magnitude());

        // test setters
        System.out.println("Set real of complex1 to 2");
        complex1.setReal(2);
        System.out.println("Set imag of complex1 to 1");
        complex1.setImag(1);
        System.out.println("Complex1 now is: " + complex1.toString());
        complex2.setValue(4.0, 1.0);
        System.out.println("Complex2 now is: " + complex2.toString());

        // // test isReal() and isImaginary()
        // if (complex1.isReal()) {
        // System.out.println("Complex1 is real");
        // } else {
        // System.out.println("Complex1 is not real");
        // }
        //
        // if(complex2.isImaginary()) {
        // System.out.println("Complex2 is imaginary");
        // } else {
        // System.out.println("Complex2 is not imaginary");
        // }
        //
        // // test equals()
        // if (complex1.equals(2.0, 1.0)) {
        // System.out.println("complex1 is equals with 2.0 + 1.0i");
        // } else {
        // System.out.println("complex1 is not equals with 3.0 + 1.0i");
        // }
        //
        // if (complex1.equals(complex2)) {
        // System.out.println("complex1 is equals with complex2");
        // } else {
        // System.out.println("complex1 is not equals with complex2");
        // }
        //
        // // test addInto() and addNew()
        // System.out.println("Complex1 add complex2 to itself");
        // complex1.addInto(complex2);
        // System.out.println("Complex1 now is " + complex1.toString());
        //
        // MyComplex myComplexAdd = complex1.addNew(complex2);
        // System.out.println("New complex is addition of complex1 and complex2");
        // System.out.println("New complex is " + myComplexAdd.toString());

        // test substract()
        complex1.subtract(complex2);
        System.out.println(complex1);

        // test multiply() and devide()
        MyComplex myComplexMulti = complex1.multiply(complex2);
        System.out.println(myComplexMulti);
        MyComplex myComplexDevide = complex1.divide(complex2);
        System.out.println(myComplexDevide);

        // test agrument() and conjugate()
        System.out.println("argument of complex1 is " + complex1.argument());
        System.out.println("conjugate of complex1 is " + complex1.conjugate());
    }
}
