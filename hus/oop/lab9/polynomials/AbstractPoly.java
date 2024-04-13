package hus.oop.lab9.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {

    public double[] derive() {
        double[] originalCoefficients = coefficients();
        double[] derivedCoefficients = new double[originalCoefficients.length - 1];
        for (int i = 1; i < originalCoefficients.length; i++) {
            derivedCoefficients[i - 1] = originalCoefficients[i] * i;
        }
        return derivedCoefficients;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        AbstractPoly thatPoly = (AbstractPoly) o;
        double[] thatCoeff = thatPoly.coefficients();
        double[] thisCoeff = coefficients();
        if (thisCoeff.length != thatCoeff.length) {
            return false;
        }
        for (int i = 0; i < thatCoeff.length; i++) {
            if (thisCoeff[i] != thatCoeff[i])
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder outStr = new StringBuilder();
        int degree = degree();
        for (int i = degree; i >= 0; i--) {
            double coeff = coefficient(i);
            if (coeff != 0) {
                if (coeff > 0 && i != degree) {
                    outStr.append('+');
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
