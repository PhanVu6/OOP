package rootsolver;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * 
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp chia đôi (Bisection)
     * 
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        double x = 0.0;
        int index = 1;

        if (function.evaluate(lower) * function.evaluate(upper) >= 0) {
            return Double.NEGATIVE_INFINITY;
        }

        double previousVal = x;
        while (index <= maxIterations) {
            previousVal = x;
            x = (lower + upper) / 2;
            if (function.evaluate(x) == 0 || Math.abs(previousVal - x) < tolerance) {
                return x;
            }
            index++;
            if (function.evaluate(lower) * function.evaluate(x) > 0) {
                lower = x;
            } else {
                upper = x;
            }
        }
        return x;
    }
}
