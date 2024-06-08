package hus.oop.mynumbersystem;

import java.math.BigInteger;

public class OctalConverter extends AbstractNumberSystemConverter {
    public OctalConverter(ANumber aNumber) {
        super(aNumber);
    }

    /**
     * Chuyển đổi một số được biểu diễn trong hệ cơ số 10
     * sang số được biểu diễn trong hệ cơ số 8.
     * 
     * @param decimal
     * @return xâu ký tự biểu diễn số trong hệ cơ số 8.
     *
     *         Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     *         không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    @Override
    public String decimalTo(String decimal) {
        BigInteger numDecimalBigInteger = new BigInteger(decimal);
        if (numDecimalBigInteger.compareTo(BigInteger.ZERO) == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        BigInteger radix = new BigInteger("8");
        while (numDecimalBigInteger.compareTo(BigInteger.ZERO) > 0) {
            result.insert(0, numDecimalBigInteger.remainder(radix));
            numDecimalBigInteger = numDecimalBigInteger.divide(radix);
        }

        return result.toString();
    }

    /**
     * Cập nhật số được chuyển đổi khi số ban đầu thay đổi
     * hoặc cơ số của số ban đầu thay đổi.
     */
    @Override
    public void update(ANumber number) {
        this.originalNumber.setNumberPresentation(number.getNumberPresentation());
        this.originalNumber.setRadix(number.getRadix());
        this.toDecimal();
        this.convertedNumber = this.decimalTo(this.originalNumber.getNumberPresentation());
    }

    /**
     * Hiển thị số ra terminal theo định dạng a1a2...an(8).
     */
    @Override
    public void display() {
        System.out.println(this.convertedNumber + "(8)");
    }
}
