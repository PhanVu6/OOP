import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number between 0-10 or 90-100: ");
        int number = sc.nextInt();
        
        while(true){
            if((number >= 0 && number <= 10) || (number >= 90 && number <= 100)){
                System.out.print("You have entered: " + number);
                break;
            } else {
                System.out.println("Invalid input, try again... ");
                System.out.print("Enter a number between 0-10 or 90-100: ");
                number = sc.nextInt();
            }
        }
    }
}
