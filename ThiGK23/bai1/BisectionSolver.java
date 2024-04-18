package bai1;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterator;

    public BisectionSolver(double tolerance, int maxIterator) {
        this.tolerance = tolerance;
        this.maxIterator = maxIterator;
    }

    @Override
    public double solve(Polynomial p, double x_pre_a, double x_pre_b) {
        double result_c = 0.0;
        String table = "";
        int index = 1;
        System.out.println("f = " + p);
        System.out.println("x_0_a = " + x_pre_a + ", x_0_p = " + x_pre_b);

        if (p.evaluate(x_pre_a) * p.evaluate(x_pre_b) >= 0) {
            return Double.NaN;
        }

        while (index <= maxIterator) {
            result_c = (x_pre_a + x_pre_b) / 2;

            table = String.format("step = %d, c = %f, a = %f, b = %f, f(pre_x) = %f", index, result_c, x_pre_a, x_pre_b,
                    p.evaluate(result_c));
            System.out.println(table);

            if (p.evaluate(result_c) == 0 || (x_pre_b - x_pre_a) / 2 < tolerance) {
                break;
            }
            index++;
            if (p.evaluate(x_pre_a) * p.evaluate(result_c) > 0) {
                x_pre_a = result_c;
            } else {
                x_pre_b = result_c;
            }
        }
        return result_c;
    }

}
