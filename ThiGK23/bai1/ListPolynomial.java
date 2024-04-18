package bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    public ListPolynomial() {
        this.coefficients = new ArrayList<>();
    }

    public ListPolynomial append(double value) {
        coefficients.add(value);
        return this;
    }

    public ListPolynomial insert(double value, int degree) {
        if (degree < 0 || degree >= coefficients.size()) {
            throw new ArrayIndexOutOfBoundsException("Index is out of the range");
        }
        coefficients.add(degree, value);
        return this;
    }

    // Sử dụng thư viện đi nhé
    public ListPolynomial minus(ListPolynomial list) {
        int newLength = Math.max(coefficients.size(), list.coefficients.size());
        Double[] addMyPolyArray = new Double[newLength];
        Double coeff;
        Double rightcoeff;
        for (int i = 0; i < newLength; i++) {
            coeff = 0.0;
            rightcoeff = 0.0;
            if (i < coefficients.size()) {
                coeff = coefficients.get(i);
            }

            if (i < list.coefficients.size()) {
                rightcoeff = list.coefficients.get(i);
            }

            addMyPolyArray[i] = coeff - rightcoeff;
        }

        this.coefficients = new ArrayList<>(Arrays.asList(addMyPolyArray));
        return this;
    }

    public ListPolynomial multiply(ListPolynomial list) {
        int newLengthCoeffs = coefficients.size() + list.coefficients.size() - 1;
        double[] newArr = new double[newLengthCoeffs];
        int index = 0;
        while (index < newLengthCoeffs) {
            for (int fid = 0, lid = index; (fid <= index && lid >= 0); fid++, lid--) {
                if (lid <= coefficients.size() - 1 && fid <= list.coefficients.size() - 1) {
                    newArr[index] += coefficients.get(lid) * list.coefficients.get(fid);
                }
            }
            index++;
        }

        Double[] converstDouble = new Double[newLengthCoeffs];
        for (int i = 0; i < newLengthCoeffs; i++) {
            converstDouble[i] = newArr[i];
        }

        this.coefficients = new ArrayList<>(Arrays.asList(converstDouble));
        return this;
    }

    public ListPolynomial plus(ListPolynomial list) {
        int newLength = Math.max(coefficients.size(), list.coefficients.size());
        Double[] addMyPolyArray = new Double[newLength];
        Double coeff;
        Double rightcoeff;
        for (int i = 0; i < newLength; i++) {
            coeff = 0.0;
            rightcoeff = 0.0;
            if (i < coefficients.size()) {
                coeff = coefficients.get(i);
            }

            if (i < list.coefficients.size()) {
                rightcoeff = list.coefficients.get(i);
            }

            addMyPolyArray[i] = coeff + rightcoeff;
        }

        this.coefficients = new ArrayList<>(Arrays.asList(addMyPolyArray));
        return this;
    }

    public ListPolynomial set(double value, int degree) {
        if (degree < 0 || degree >= coefficients.size()) {
            throw new ArrayIndexOutOfBoundsException("Index is out of the range");
        }
        this.coefficients.set(degree, value);
        return this;
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {

        double[] getArr = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            getArr[i] = coefficient(i);
        }
        return getArr;
    }

    @Override
    public int degree() {
        int degree = 0;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            if (coefficients.get(i) != 0) {
                degree = i;
                break;
            }
        }
        return degree;
    }

    @Override
    public Polynomial derivative() {
        ListPolynomial newListPoly = new ListPolynomial();
        Double[] newArrayToCoverst = new Double[differentiate().length];
        for (int i = 0; i < newArrayToCoverst.length; i++) {
            newArrayToCoverst[i] = differentiate()[i];
        }

        newListPoly.coefficients = new ArrayList<>(Arrays.asList(newArrayToCoverst));
        return newListPoly;
    }

    @Override
    public double evaluate(double x) {
        double result = 0.0;
        double terms = x;
        for (int i = degree(); i >= 0; i--) {
            result = coefficients.get(i) + result * terms;
        }
        return result;

    }

}
