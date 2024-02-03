import java.util.Scanner;

public class CylinderComputation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius, height, baseArea, surfaceArea, volume;

        System.out.print("Nhập bán kính đáy của hình trụ: ");
        radius = scanner.nextDouble();
        System.out.print("Nhập chiều cao của hình trụ: ");
        height = scanner.nextDouble();

        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;

        System.out.printf("Diện tích đáy là: %.2f%n", baseArea);
        System.out.printf("Diện tích bề mặt là: %.2f%n", surfaceArea);
        System.out.printf("Thể tích là: %.2f%n", volume);

        scanner.close();
    }
}
