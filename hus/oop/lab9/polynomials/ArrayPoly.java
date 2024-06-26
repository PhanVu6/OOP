package hus.oop.lab9.polynomials;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }

    @Override
    public double coefficient(int index) {
        return coefficients[index];
    }

    @Override
    public double[] coefficients() {
        double[] newCoeffi = new double[coefficients.length];
        System.arraycopy(coefficients, 0, newCoeffi, 0, coefficients.length);
        return newCoeffi;
    }
}
