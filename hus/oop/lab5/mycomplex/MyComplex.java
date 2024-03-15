package hus.oop.lab5.mycomplex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("(%.1f + %.1fi)", real, imag);
    }

    public boolean isReal() {
        return this.imag == 0;
    }

    public boolean isImagninary() {
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return this.real == another.getReal() && this.imag == another.imag;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan(this.imag / this.real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.getReal() - this.imag * right.imag;
        this.imag = this.real * right.getImag() + this.imag * right.getReal();
        return this;
    }

    public MyComplex divide(MyComplex right) {
        this.real = (this.real * right.getReal() + this.imag * right.imag)
                / (right.getReal() * right.getReal() + right.getImag() * right.getImag());
        this.imag = (this.imag * right.getReal() - this.real * right.getImag())
                / (right.getReal() * right.getReal() + right.getImag() * right.getImag());
        return this;
    }

    public MyComplex conjugate() {
        this.imag *= -1;
        return this;
    }

}
