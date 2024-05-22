package integration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        this.coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * 
     * @return
     */
    @Override
    public double coefficient(int index) {
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * 
     * @return
     */
    @Override
    public double[] coefficients() {
        double[] getArr = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            getArr[i] = coefficient(i);
        }
        return getArr;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * 
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * 
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        if (index < 0 || index >= coefficients.size()) {
            throw new ArrayIndexOutOfBoundsException("Index is out of the range");
        }
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * 
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        if (index < 0 || index > coefficients.size()) {
            throw new ArrayIndexOutOfBoundsException("Index is out of the range");
        }
        this.coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * 
     * @return
     */
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

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * 
     * @return
     */
    @Override
    public double evaluate(double x) {
        double result = 0.0;
        double terms = x;
        for (int i = degree(); i >= 0; i--) {
            result = coefficients.get(i) + result * terms;
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * 
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
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

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * 
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        int newLength = Math.max(coefficients.size(), another.coefficients.size());
        Double[] addMyPolyArray = new Double[newLength];
        Double coeff;
        Double rightcoeff;
        for (int i = 0; i < newLength; i++) {
            coeff = 0.0;
            rightcoeff = 0.0;
            if (i < coefficients.size()) {
                coeff = coefficients.get(i);
            }

            if (i < another.coefficients.size()) {
                rightcoeff = another.coefficients.get(i);
            }

            addMyPolyArray[i] = coeff + rightcoeff;
        }

        this.coefficients = new ArrayList<>(Arrays.asList(addMyPolyArray));
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * 
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        int newLength = Math.max(coefficients.size(), another.coefficients.size());
        Double[] addMyPolyArray = new Double[newLength];
        Double coeff;
        Double rightcoeff;
        for (int i = 0; i < newLength; i++) {
            coeff = 0.0;
            rightcoeff = 0.0;
            if (i < coefficients.size()) {
                coeff = coefficients.get(i);
            }

            if (i < another.coefficients.size()) {
                rightcoeff = another.coefficients.get(i);
            }

            addMyPolyArray[i] = coeff - rightcoeff;
        }

        this.coefficients = new ArrayList<>(Arrays.asList(addMyPolyArray));
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * 
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        int newLengthCoeffs = coefficients.size() + another.coefficients.size() - 1;
        double[] newArr = new double[newLengthCoeffs];
        for (int i = 0; i < coefficients.size(); i++) {
            for (int j = 0; j < another.coefficients.size(); j++) {
                newArr[i + j] += this.coefficient(i) * another.coefficient(j);
            }
        }
        Double[] converstDouble = new Double[newLengthCoeffs];
        for (int i = 0; i < newLengthCoeffs; i++) {
            converstDouble[i] = newArr[i];
        }

        this.coefficients = new ArrayList<>(Arrays.asList(converstDouble));
        return this;
    }
}
