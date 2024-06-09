package hus.oop.mynumbersystem;

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
        if (decimal.equals("0")) {
            return "0";
        }

        int valueOfDecimal = Integer.parseInt(decimal);
        StringBuilder hexadecimal = new StringBuilder();
        String[] digtHexadecimalText = { "A", "B", "C", "D", "E", "F" };
        while (valueOfDecimal != 0) {
            int remainder = valueOfDecimal % 16;
            valueOfDecimal /= 16;

            if (remainder < 10) {
                hexadecimal.append(remainder);
            } else {
                hexadecimal.append(digtHexadecimalText[remainder - 10]);
            }

        }

        return hexadecimal.reverse().toString();
    }

    /**
     * Cập nhật số được chuyển đổi khi số ban đầu thay đổi
     * hoặc cơ số của số ban đầu thay đổi.
     */
    @Override
    public void update(ANumber number) {
        this.convertedNumber = decimalTo(this.convertedNumber);
        display();
    }

    /**
     * Hiển thị số ra terminal theo định dạng a1a2...an(16).
     */
    @Override
    public void display() {
        System.out.println(this.convertedNumber + "(16)");
    }
}
