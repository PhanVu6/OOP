package bai1;

public class ArrayPolynomial extends AbstractPolynomial {
    private final int DEFAULT_CAPACITY = 1;
    private double[] coefficients = new double[DEFAULT_CAPACITY];
    private int size;

    public ArrayPolynomial() {
        this.coefficients = coefficients();
        this.size = degree();
    }

    public void enlarge() {
        double[] newArray = new double[2 * this.coefficients.length];
        System.arraycopy(this.coefficients, 0, newArray, 0, coefficients.length - 1);
        this.coefficients = newArray;
    }

    public ArrayPolynomial append(double num) {
        enlarge();
        coefficients[size] = num;
        size++;
        return this;
    }

    public ArrayPolynomial insert(double num, int degree) {
        if (degree < 0 || degree >= size) {
            throw new ArrayIndexOutOfBoundsException("Index is out of the range");
        }
        if (degree > coefficients.length) {
            enlarge();
        }
        for (int i = size - 1; i >= degree; i--) {
            coefficients[i + 1] = coefficients[i];
        }
        coefficients[degree] = num;
        size++;
        return this;
    }

    public ArrayPolynomial minus(ArrayPolynomial list) {
        int newLength = Math.max(coefficients.length, list.coefficients.length);
        double[] addMyPolyArray = new double[newLength];
        double coeff;
        double rightcoeff;
        for (int i = 0; i < newLength; i++) {
            coeff = 0.0;
            rightcoeff = 0.0;
            if (i < coefficients.length) {
                coeff = coefficients[i];
            }

            if (i < list.coefficients.length) {
                rightcoeff = list.coefficients[i];
            }

            addMyPolyArray[i] = coeff - rightcoeff;
        }

        this.coefficients = addMyPolyArray;
        return this;
    }

    public ArrayPolynomial multiply(ArrayPolynomial list) {
        int newLengthCoeffs = size + list.size - 1;
        double[] multiplyMyPolyArray = new double[newLengthCoeffs];
        int index = 0;
        while (index < newLengthCoeffs) {
            for (int fid = 0, lid = index; (fid <= index && lid >= 0); fid++, lid--) {
                if (lid <= coefficients.length - 1 && fid <= list.coefficients.length - 1) {
                    multiplyMyPolyArray[index] += coefficients[lid] * list.coefficients[fid];
                }
            }
            index++;
        }
        this.coefficients = multiplyMyPolyArray;

        return this;
    }

    public ArrayPolynomial plus(ArrayPolynomial list) {
        int newLength = Math.max(coefficients.length, list.coefficients.length);
        double[] addMyPolyArray = new double[newLength];
        double coeff;
        double rightcoeff;
        for (int i = 0; i < newLength; i++) {
            coeff = 0.0;
            rightcoeff = 0.0;
            if (i < coefficients.length) {
                coeff = coefficients[i];
            }

            if (i < list.coefficients.length) {
                rightcoeff = list.coefficients[i];
            }

            addMyPolyArray[i] = coeff + rightcoeff;
        }

        this.coefficients = addMyPolyArray;
        return this;
    }

    public ArrayPolynomial set(double num, int degree) {
        if (degree < 0 || degree >= size) {
            throw new ArrayIndexOutOfBoundsException("Index is out of the range");
        }
        this.coefficients[degree] = num;
        return this;
    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return this.coefficients;
    }

    @Override
    public int degree() {
        for (int i = coefficients.length - 1; i >= 0; i--) {
            if (coefficients[i] != 0) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public Polynomial derivative() {
        ArrayPolynomial newArrayPoly = new ArrayPolynomial();
        newArrayPoly.coefficients = differentiate();
        return newArrayPoly;
    }

    @Override
    public double evaluate(double x) {
        double result = 0.0;
        double terms = x;
        for (int i = size - 1; i >= 0; i--) {
            result = coefficients[i] + result * terms;
        }
        return result;
    }
}
