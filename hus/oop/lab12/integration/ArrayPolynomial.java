package integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents = new double[DEFAULT_CAPACITY];
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        this.coefficents = coefficients();
        this.size = degree();
    }

    /**
     * 
     * Lấy hệ số của đa thức tại phần tử index
     * 
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        return coefficents[index];
    }

    /**
     * 
     * Lấy mảng các hệ số của đa thức.
     * 
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        return this.coefficents;
    }

    /**
     * 
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * 
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        enlarge();
        coefficents[size] = coefficient;
        size++;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * 
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index is out of the range");
        }
        if (index > coefficents.length) {
            enlarge();
        }
        for (int i = size - 1; i >= index; i--) {
            coefficents[i + 1] = coefficents[i];
        }
        coefficents[index] = coefficient;
        size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * 
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index is out of the range");
        }
        this.coefficents[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * 
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        for (int i = coefficents.length - 1; i >= 0; i--) {
            if (coefficents[i] != 0) {
                return i;
            }
        }
        return 0;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * 
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double result = 0.0;
        double terms = x;
        for (int i = degree(); i >= 0; i--) {
            result = coefficents[i] + result * terms;
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * 
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        ArrayPolynomial newArrayPoly = new ArrayPolynomial();
        newArrayPoly.coefficents = differentiate();
        return newArrayPoly;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * 
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        int newLength = Math.max(coefficents.length, another.coefficents.length);
        double[] addMyPolyArray = new double[newLength];
        double coeff;
        double rightcoeff;
        for (int i = 0; i < newLength; i++) {
            coeff = 0.0;
            rightcoeff = 0.0;
            if (i < coefficents.length) {
                coeff = coefficents[i];
            }

            if (i < another.coefficents.length) {
                rightcoeff = another.coefficents[i];
            }

            addMyPolyArray[i] = coeff + rightcoeff;
        }

        this.coefficents = addMyPolyArray;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * 
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        int newLength = Math.max(coefficents.length, another.coefficents.length);
        double[] addMyPolyArray = new double[newLength];
        double coeff;
        double rightcoeff;
        for (int i = 0; i < newLength; i++) {
            coeff = 0.0;
            rightcoeff = 0.0;
            if (i < coefficents.length) {
                coeff = coefficents[i];
            }

            if (i < another.coefficents.length) {
                rightcoeff = another.coefficents[i];
            }

            addMyPolyArray[i] = coeff - rightcoeff;
        }

        this.coefficents = addMyPolyArray;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * 
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        int resultDegree = this.size + another.size - 1;
        double[] resultCoeffs = new double[resultDegree];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < another.size; j++) {
                resultCoeffs[i + j] += this.coefficents[i] * another.coefficents[j];
            }
        }

        this.coefficents = resultCoeffs;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        double[] newArray = new double[2 * this.coefficents.length];
        System.arraycopy(this.coefficents, 0, newArray, 0, coefficents.length - 1);
        this.coefficents = newArray;
    }
}
