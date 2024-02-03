import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        System.out.print(reverseInt(number));
    }

    private static String reverseInt(int number){
        String str = "";
        while(number >= 1){
            str += number % 10 + " ";
            number /= 10;
        }
        str.trim();
        return str;
    }
}
