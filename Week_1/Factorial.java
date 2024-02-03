
public class Factorial {
    
    public static long getFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) { 
        int n = 20;
        System.out.println("Giai thừa của " + n + " là " + getFactorial(n));
    }
}
