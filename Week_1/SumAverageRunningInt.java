public class SumAverageRunningInt {

    public static double calculatorByFor(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;
        double average;

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
        average = (double) sum / (UPPERBOUND - LOWERBOUND + 1);

        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.print("The average is ");
        return average;
    }

    public static double calculatorByWhile(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;
        double average;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum += number;
            number++;
        }
        average = (double) sum / (UPPERBOUND - LOWERBOUND + 1);

        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.print("The average is ");
        return average;
    }

    public static double calculatorByDoWhile(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;
        double average;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum += number;
            number++;
        }
        average = (double) sum / (UPPERBOUND - LOWERBOUND + 1);

        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.print("The average is ");
        return average;
    }

    public static int sumOfSquares() {
        int sum = 0;
        for (int number = 1; number < 100; number++) {
            sum += number * number;
        }
        return sum;
    }
    
    public static int sumEvenNumber(){
        int sumEven = 0; // Tổng tích lũy của số chẵn
        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            }
        }
        return sumEven;
    }
    
    public static int sumOddNumber(){
        
        int sumOdd = 0; // Tổng tích lũy của số lẻ
        
        // Tính tổng
        for (int number = 1; number <= 100; number++) {
            if (number % 2 != 0) {
                sumOdd += number;
            }
        }
        return sumOdd;
    }
    
    public static int absDiffNumber(){
        int absDiff = 0;
        absDiff = (sumOddNumber() > sumEvenNumber()) ? sumOddNumber() - sumEvenNumber() : sumEvenNumber() - sumOddNumber();

        return absDiff;
    }
    
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int count = UPPERBOUND - LOWERBOUND + 1;
        
        System.out.println("Print with for:");
        System.out.println(calculatorByFor(LOWERBOUND, UPPERBOUND));
        System.out.println();

        System.out.println("Print with while:");
        System.out.println(calculatorByWhile(LOWERBOUND, UPPERBOUND));
        System.out.println();
        
        System.out.println("Print with do-while:");
        System.out.println(calculatorByDoWhile(LOWERBOUND, UPPERBOUND));
        System.out.println();

        System.out.println("Count " + count);

        System.out.println("sum of squares for 1 to 100: " + sumOfSquares());
        
        System.out.println("sum odd number for 1 to 100: " + sumOddNumber());
        
        System.out.println("sum even number for 1 to 100: " + sumEvenNumber());

        System.out.println("sum abs diff number for 1 to 100: " + absDiffNumber());
    }
}
