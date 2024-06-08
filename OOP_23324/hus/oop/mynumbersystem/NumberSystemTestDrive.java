package hus.oop.mynumbersystem;

import java.util.Random;

public class NumberSystemTestDrive {
    public static void main(String[] args) {
        ANumber number1 = getRandomNumber();
        INumberSystemConverter binaryConverter = new BinaryConverter(number1);
        INumberSystemConverter octalConverter = new OctalConverter(number1);
        INumberSystemConverter hexConverter = new HexadecimalConverter(number1);

        NumberSystemController controller = new NumberSystemController();
        controller.registerConverter(binaryConverter);
        controller.registerConverter(octalConverter);
        controller.registerConverter(hexConverter);

        controller.setNumberPresentation(number1.getNumberPresentation());
        controller.setRadix(number1.getRadix());

        System.out.println("Original number: " + controller.getNumberPresentation());
        System.out.println("Radix: " + controller.getRadix());

        System.out.print("Binay: ");
        binaryConverter.display();
        System.out.print("Octal: ");
        octalConverter.display();
        System.out.print("Hex: ");
        hexConverter.display();
        System.out.println("----------------");

        number1 = getRandomNumber();
        controller.setNumberPresentation(number1.getNumberPresentation());
        controller.setRadix(number1.getRadix());

        System.out.println("Original number: " + controller.getNumberPresentation());
        System.out.println("Radix: " + controller.getRadix());

        System.out.print("Binary: ");
        binaryConverter.display();
        System.out.print("Octal: ");
        octalConverter.display();
        System.out.print("Hex: ");
        hexConverter.display();
        System.out.println("----------------");

        number1 = getRandomNumber();
        controller.setNumberPresentation(number1.getNumberPresentation());
        controller.setRadix(number1.getRadix());

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
