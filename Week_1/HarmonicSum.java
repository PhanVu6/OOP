public class HarmonicSum {

    public static double sumLeftToRight(int max_denominator){
        double sumL2R = 0.0;
        
        for (int denominator = 1; denominator <= max_denominator; ++denominator) {
            sumL2R += 1.0 / denominator;
        }
        return sumL2R;
    }
    
    public static double sumRightToLeft(int max_denominator){
        double sumR2L = 0.0;

        for (int denominator = max_denominator; denominator >= 1; --denominator) {
            sumR2L += 1.0 / denominator;
        }
        return sumR2L;
    }

    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;
        double sumR2L = 0.0;

        // Tính tổng từ trái sang phải
        System.out.println("The sum from left-to-right is: " + sumLeftToRight(MAX_DENOMINATOR));


        // Tính tổng từ phải sang trái
        System.out.println("The sum from right-to-left is: " + sumRightToLeft(MAX_DENOMINATOR));

        // Tính hiệu tuyệt đối và hiển thị
        double absDiff = Math.abs(sumLeftToRight(MAX_DENOMINATOR) - sumRightToLeft(MAX_DENOMINATOR));
        System.out.println("The absolute difference between the two sums is: " + absDiff);

        // So sánh tính chính xác
        if (sumLeftToRight(MAX_DENOMINATOR) > sumRightToLeft(MAX_DENOMINATOR)) {
            System.out.println("The sum from left-to-right is more accurate.");
        } else if (sumLeftToRight(MAX_DENOMINATOR) < sumRightToLeft(MAX_DENOMINATOR)) {
            System.out.println("The sum from right-to-left is more accurate.");
        } else {
            System.out.println("The two sums are equal.");
        }
    }
}
