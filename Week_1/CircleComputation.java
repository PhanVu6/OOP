import java.util.Scanner;

public class CircleComputation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;
        double diameter;
        double circumference;
        double area;
        
        System.out.print("Nhập bán kính hình tròn: ");
        radius = scanner.nextDouble();

        diameter = 2.0 * radius;
        circumference = 2.0 * Math.PI * radius;
        area = Math.PI * radius * radius;
        
        displayResults(diameter, circumference, area);
        scanner.close();
    }

    
    private static void displayResults(double diameter, double circumference, double area) {        
        System.out.printf("Đường kính là: %.2f%n", diameter);
        System.out.printf("Chu vi là: %.2f%n", circumference);
        System.out.printf("Diện tích là: %.2f%n", area);
    }
}
