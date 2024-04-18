package bai1;

public interface Polynomial {
    public double coefficient(int degree);

    public double[] coefficients();

    public int degree();

    public Polynomial derivative();

    public double evaluate(double num);
}