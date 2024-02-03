public class ExtractDigits {
    public static void main(String[] args) {
        int n = 15423;

        System.out.print("Extracted digits in reverse order: ");
        
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n / 10;
        }

        System.out.println();
    }
}
