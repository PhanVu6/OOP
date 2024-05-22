package integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * 
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder outStr = new StringBuilder();
        int degree = degree();
        for (int i = degree; i >= 0; i--) {
            double coeff = coefficient(i);
            if (coeff != 0) {
                if (coeff > 0 && i != degree) {
                    outStr.append(" + ");
                }
                if (i != 0) {
                    if (coeff != 1) {
                        outStr.append(coeff);
                    }
                    outStr.append("x");
                    if (i > 1) {
                        outStr.append("^" + i);

                    }
                } else {
                    outStr.append(coeff);
                }

            }
        }
        return outStr.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * 
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] originalCoefficients = coefficients();
        double[] lateDeriveCoefficients = new double[originalCoefficients.length - 1];
        for (int i = 1; i < originalCoefficients.length; i++) {
            lateDeriveCoefficients[i - 1] = originalCoefficients[i] * i;
        }
        return lateDeriveCoefficients;
    }
}
