package hus.oop.mynumbersystem;

import java.math.BigInteger;

public abstract class AbstractNumberSystemConverter implements INumberSystemConverter {
    protected String convertedNumber; // Số được chuyển đổi theo cơ số nào đó từ số gốc
    protected ANumber originalNumber;

    public AbstractNumberSystemConverter(ANumber aNumber) {
        String presentation = new String(aNumber.getNumberPresentation());
        this.originalNumber = new ANumber(presentation, aNumber.getRadix());
        presentation = new String(aNumber.getNumberPresentation());
        this.convertedNumber = presentation;
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
        String originalStringNumber = this.originalNumber.getNumberPresentation();
        int lengthStr = originalStringNumber.length();

        BigInteger newDecimal = BigInteger.ZERO;
        BigInteger radix = new BigInteger(String.valueOf(this.originalNumber.getRadix()));
        BigInteger x = BigInteger.ONE;
        for (int charId = lengthStr - 1; charId >= 0; charId--) {
            Character c = originalStringNumber.charAt(charId);
            boolean isNumberic = '0' <= c && c <= '9';
            if (isNumberic) {
                BigInteger temp = x.multiply(
                        new BigInteger(String.valueOf(Character.getNumericValue(c))));
                newDecimal = newDecimal.add(temp);
            } else {
                BigInteger temp = x.multiply(new BigInteger(String.valueOf((int) (c - 65 + 10))));
                newDecimal = newDecimal.add(temp);
            }
            x = x.multiply(radix);
        }

        this.originalNumber.setNumberPresentation(String.valueOf(newDecimal));

        return this.originalNumber.getNumberPresentation();

    }
}
