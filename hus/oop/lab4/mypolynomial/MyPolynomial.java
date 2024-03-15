package hus.oop.lab4.mypolynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length;
    }

    public double evaluate(double x) {
        double total = 0;
        double term = 1;
        for (int i = 0; i < coeffs.length; i++) {
            total += coeffs[i] * term;
            term *= x;
        }
        return total;
    }

    public MyPolynomial add(MyPolynomial right) {
        int newLength = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[newLength];
        MyPolynomial newPolynomial = new MyPolynomial(newCoeffs);
        for (int i = 0; i < coeffs.length; i++) {
            newPolynomial.coeffs[i] += this.coeffs[i] + right.coeffs[i];
        }
        return newPolynomial;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int newLengthCoeffs = this.getDegree() + right.getDegree() - 1;
        double[] newCoeffs = new double[newLengthCoeffs];
        MyPolynomial newPolynomial = new MyPolynomial(newCoeffs);
        int index = 0;
        while (index < this.getDegree() + right.getDegree()) {
            for (int fid = 0, lid = index; (fid <= index && lid >= 0); fid++, lid--) {
                if (lid <= coeffs.length - 1 && fid <= right.coeffs.length - 1) {
                    newPolynomial.coeffs[index] += coeffs[lid] * right.coeffs[fid];
                }
            }
            index++;
        }
        return newPolynomial;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String strPolynomials = "";
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (i != 0) {
                strPolynomials += String.format("%.1fx^%d + ", coeffs[i], i);
            } else {
                strPolynomials += String.format("%.1f", coeffs[i]);
            }
        }
        return strPolynomials;
    }
}
