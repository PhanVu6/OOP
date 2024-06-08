package hus.oop.mynumbersystem;

import java.util.Random;

public class NumberSystemTestDrive {
    public static void main(String[] args) {
        ANumber number = getRandomNumber();
        INumberSystemConverter binaryConverter = new BinaryConverter(number);
        INumberSystemConverter octalConverter = new OctalConverter(number);
        INumberSystemConverter hexConverter = new HexadecimalConverter(number);

        NumberSystemController controller = new NumberSystemController();
        controller.registerConverter(binaryConverter);
        controller.registerConverter(octalConverter);
        controller.registerConverter(hexConverter);

        controller.setNumberPresentation(number.getNumberPresentation());
        controller.setRadix(number.getRadix());

        System.out.println("Original number: " + controller.getNumberPresentation());
        System.out.println("Radix: " + controller.getRadix());

        System.out.print("Binay: ");
        binaryConverter.display();
        System.out.print("Octal: ");
        octalConverter.display();
        System.out.print("Hex: ");
        hexConverter.display();
        System.out.println("----------------");

        number = getRandomNumber();
        controller.setNumberPresentation(number.getNumberPresentation());
        controller.setRadix(number.getRadix());

        System.out.println("Original number: " + controller.getNumberPresentation());
        System.out.println("Radix: " + controller.getRadix());

        System.out.print("Binary: ");
        binaryConverter.display();
        System.out.print("Octal: ");
        octalConverter.display();
        System.out.print("Hex: ");
        hexConverter.display();
        System.out.println("----------------");

        number = getRandomNumber();
        controller.setNumberPresentation(number.getNumberPresentation());
        controller.setRadix(number.getRadix());

        System.out.println("Original number: " + controller.getNumberPresentation());
        System.out.println("Radix: " + controller.getRadix());

        System.out.print("Binary: ");
        binaryConverter.display();
        System.out.print("Octal: ");
        octalConverter.display();
        System.out.print("Hex: ");
        hexConverter.display();
        System.out.println("----------------");
    }

    private static ANumber getRandomNumber() {
        return getRandomNumber(2, 17);
    }

    private static ANumber getRandomNumber(int lowerBoundRadix, int upperBoundRadix) {
        String values = "0123456789ABCDEF";
        Random random = new Random();
        int radix = random.nextInt(lowerBoundRadix, upperBoundRadix);
        while (radix == 10) {
            radix = random.nextInt(lowerBoundRadix, upperBoundRadix);
        }

        int n = random.nextInt(10, 31);
        StringBuilder number1 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            number1.append(values.charAt(random.nextInt(radix)));
        }

        return new ANumber(number1.toString(), radix);

    }
}
