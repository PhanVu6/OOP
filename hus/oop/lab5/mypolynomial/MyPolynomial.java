package hus.oop.lab5.mypolynomial;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        int degree = coeffs.length - 1;
        // Bổ sung trường hợp bằng 0.
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                break;
            } else {
                degree--;
            }
        }
        return degree;
    }

    @Override
    public String toString() {
        // Thay đổi tên biến có ý nghĩa hơn
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (i == coeffs.length - 1) {
                    sb.append(coeffs[i]);
                } else if (i < coeffs.length - 1) {
                    if (coeffs[i] > 0) {
                        sb.append(" + ");
                    } else {
                        sb.append(" - ");
                    }
                    sb.append(Math.abs(coeffs[i]));
                }

                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0.0;
        double terms = x;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result = coeffs[i] + result * terms;
        }

        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int newLength = Math.max(coeffs.length, right.coeffs.length);
        double[] addMyPolyArray = new double[newLength];
        double coeff;
        double rightcoeff;
        for (int i = 0; i < newLength; i++) {
            coeff = 0.0;
            rightcoeff = 0.0;
            if (i < coeffs.length) {
                coeff = coeffs[i];
            }

            if (i < right.coeffs.length) {
                rightcoeff = right.coeffs[i];
            }

            addMyPolyArray[i] = coeff + rightcoeff;
        }

        this.coeffs = addMyPolyArray;
        return this;
    }
    
    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] resultCoeffs = new double[newDegree + 1];
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                resultCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        this.coeffs = resultCoeffs;
        return this;
    }
}
