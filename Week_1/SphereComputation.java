import java.util.Scanner;

public class SphereComputation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius, surfaceArea, volume;

        System.out.print("Nhập bán kính hình cầu: ");
        radius = scanner.nextDouble();

        surfaceArea = 4.0 * Math.PI * radius * radius;
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Diện tích bề mặt là: %.2f%n", surfaceArea);
        System.out.printf("Thể tích là: %.2f%n", volume);

        scanner.close();
    }
}
