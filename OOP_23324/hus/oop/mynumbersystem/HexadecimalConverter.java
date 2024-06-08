package hus.oop.mynumbersystem;

import java.math.BigInteger;

public class HexadecimalConverter extends AbstractNumberSystemConverter {
    public HexadecimalConverter(ANumber aNumber) {
        super(aNumber);
    }

    /**
     * Chuyển đổi một số được biểu diễn trong hệ cơ số 10
     * sang số được biểu diễn trong hệ cơ số 16.
     * 
     * @param decimal
     * @return xâu ký tự biểu diễn số trong hệ cơ số 16.
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
        BigInteger radix = new BigInteger("16");
        while (numDecimalBigInteger.compareTo(BigInteger.ZERO) > 0) {
            BigInteger remainder = numDecimalBigInteger.remainder(radix);
            boolean isSmallerOrEqualThan9 = remainder.compareTo(new BigInteger("9")) <= 0;
            boolean isBiggerOrEqualThan0 = remainder.compareTo(BigInteger.ZERO) >= 0;
            boolean isNumber = isBiggerOrEqualThan0 && isSmallerOrEqualThan9;
            if (isNumber) {
                result.insert(0, remainder);
            } else {
                Character c = (char) (remainder.intValue() - 10 + 65);
                result.insert(0, c);
            }
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
     * Hiển thị số ra terminal theo định dạng a1a2...an(16).
     */
    @Override
    public void display() {
        System.out.println(this.convertedNumber + "(16)");
    }
}
