package hus.oop.lab5.mypolynomial;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        /*
         * public MyPolynomial(double[] coeffs) {}
         * Tạo mảng mới: new MyPolynomial([1.1, 2.2])
         * 
         * public MyPolynomial(double... coeffs) {}
         * Tạo mảng mới: new MyPolynomial(1.1, 2.2)
         */
        this.coeffs = coeffs;
    }

    public int getDegree() {
        // Bổ sung trường hợp bằng 0.
        return coeffs.length - 1;
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
        // Xem xét hornor.
        double result = 0.0;
        double xPow = 1;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * xPow;
            xPow *= x;
        }

        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int newLen = Math.max(coeffs.length, right.coeffs.length);
        double[] addPoly = new double[newLen];
        for (int i = 0; i < newLen; i++) {
            double coeff = 0.0;
            double rightcoeff = 0.0;

            if (i < coeffs.length) {
                coeff = coeffs[i];
            }

            if (i < right.coeffs.length) {
                rightcoeff = right.coeffs[i];
            }

            addPoly[i] = coeff + rightcoeff;
        }

        this.coeffs = addPoly;
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
