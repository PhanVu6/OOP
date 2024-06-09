package hus.oop.mynumbersystem;

public abstract class AbstractNumberSystemConverter implements NumberSystemConverter {
    protected String convertedNumber; // Số được chuyển đổi theo cơ số nào đó từ số gốc

    public AbstractNumberSystemConverter(ANumber aNumber) {
        this.convertedNumber = aNumber.getNumberPresentation();
    }

    /**
     * Chuyển đổi số decimal từ hệ cơ số 10 thành số có hệ cơ số nào đó.
     * 
     * @param decimal
     * @return xâu ký tự biểu diễn một số trong hệ cơ số nào đó.
     *
     *         Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     *         không sử dụng thư viện chuyển đổi số có sẵn của Java.
     *
     *         Gợi ý: có thể sử dụng lớp trung gian BigInteger để thuận lợi hơn cho
     *         việc tính toán.
     */
    public abstract String decimalTo(String decimal);

    /**
     * Chuyển đổi số được biểu diễn trong originalNumber sang biểu diễn số trong hệ
     * cơ số 10.
     * 
     * @return xâu ký tự biểu diễn một số trong hệ cơ số 10.
     *
     *         Yêu cầu: sử dụng thuật toán Horner để chuyển đổi,
     *         không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    public String toDecimal() {
        int radix = 0;

        if (this instanceof BinaryConverter) {
            radix = 2;
        } else if (this instanceof OctalConverter) {
            radix = 8;
        } else if (this instanceof HexadecimalConverter) {
            radix = 16;
        }

        String strNumber = this.convertedNumber;
        int lengthConvertedNumber = convertedNumber.length();
        int convertCharToValue = 0;
        int result = 0;

        for (int i = 0; i < lengthConvertedNumber; i++) {
            convertCharToValue = Character.getNumericValue(strNumber.charAt(i));
            if (radix == 8 && convertCharToValue >= 0 && convertCharToValue < radix) {
                result = convertCharToValue + result * 8;
            }
        }

        strNumber = "" + result;
        return strNumber;
    }
}
