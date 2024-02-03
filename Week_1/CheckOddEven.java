public class CheckOddEven { 
    
    public static String checkCondistionNumber(int number) {
        if (number % 2 == 0) {
            return "Even Number"; // số chẵn
        } else {
            return "Old Number"; // số lẻ
        }   
    }

    public static void main(String[] args) { 
        int number = 49; // Đặt giá trị của ”number” ở đây!
        System.err.println(checkCondistionNumber(number));
        System.out.println("Bye!");
    }
}
