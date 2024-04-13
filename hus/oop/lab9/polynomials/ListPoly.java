package hus.oop.lab9.polynomials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        Double[] newArray = new Double[coeffs.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = coeffs[i];
        }
        this.coefficients = new ArrayList<>(Arrays.asList(newArray));
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }

    @Override
    public double coefficient(int index) {
        return coefficients.get(index);
    }

    @Override
    public double[] coefficients() {
        double[] newCoeffi = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            newCoeffi[i] = coefficients.get(i);
        }
        return newCoeffi;
    }

}
