package hus.oop.mynumbersystem;

public class ANumber {
    private String numberPresentation; // Biểu diễn số
    private int radix; // Cơ số

    public ANumber(String originalNumber, int radix) {
        this.numberPresentation = originalNumber.toUpperCase();
        this.radix = radix;
    }

    public String getNumberPresentation() {
        return this.numberPresentation;
    }

    public void setNumberPresentation(String numberPresentation) {
        this.numberPresentation = numberPresentation.toUpperCase();
    }

    public int getRadix() {
        return this.radix;
    }

    public void setRadix(int radix) {
        this.radix = radix;
    }
}