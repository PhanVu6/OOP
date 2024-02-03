public class ComputePI{

    public static double solutionMaxDenominator(){
        double sum = 0.0;
        int MAXDENOMINATOR = 1000; 
        for (int denominator = 1; denominator <= MAXDENOMINATOR; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., MAXDENOMINATOR
            if (denominator % 4 == 1) {
                sum += 1.0 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0 / denominator;
            } else { // phần dư là 0 hoặc 2
                System.out.println("Impossible !!!");
            }
        }
        System.out.print("Giá trị của pi theo giá trị mẫu số là: ");
        return 4*sum;
    }
    
    public static double solutionMaxTerm(){
        int MAXTERM = 10000; // số thuật ngữ sử dụng trong tính toán
        double sum = 0.0;
        
        for (int term = 1; term <= MAXTERM; term++) {
            if (term % 2 == 1) { // số lẻ: cộng
                sum += 1.0 / (term * 2 - 1);
            } else { // số chẵn: trừ
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        System.out.print("Giá trị của pi theo giá trị phần tử là: ");
        return 4*sum;
    }

    public static void main(String[] args) {
        System.out.println(solutionMaxDenominator());
        System.out.println(solutionMaxTerm());
        double piDifference = Math.abs(solutionMaxDenominator() - Math.PI);
        double piDifferencePercentage = (piDifference / Math.PI) * 100;

        System.out.println("Computed PI: " + solutionMaxDenominator());
        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Absolute difference: " + piDifference);
        System.out.println("Difference as percentage of Math.PI: " + piDifferencePercentage + "%");

    }
}