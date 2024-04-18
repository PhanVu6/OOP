package bai1;

public abstract class AbstractPolynomial implements Polynomial {
    public AbstractPolynomial() {

    }

    public double[] differentiate() {
        double[] originalCoefficients = coefficients();
        double[] lateDeriveCoefficients = new double[originalCoefficients.length - 1];
        for (int i = 1; i < originalCoefficients.length; i++) {
            lateDeriveCoefficients[i - 1] = originalCoefficients[i] * i;
        }
        return lateDeriveCoefficients;
    }

    @Override
    public String toString() {
        StringBuilder outStr = new StringBuilder();
        int degree = degree();
        for (int i = degree; i >= 0; i--) {
            double coeff = coefficient(i);
            if (coeff != 0) {
                if (coeff > 0 && i != degree) {
                    outStr.append(' ').append('+').append(' ');
                }
                if (i != 0) {
                    if (coeff != 1) {
                        outStr.append(coeff);
                    }
                    outStr.append("x");
                    if (i > 1) {
                        outStr.append("^");
                        outStr.append(i);
                    }
                } else {
                    outStr.append(coeff);
                }
            }
        }
        return outStr.toString();
    }

}
