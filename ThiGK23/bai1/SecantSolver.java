package bai1;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterator;

    public SecantSolver(double tolerance, int maxIterator) {
        this.tolerance = tolerance;
        this.maxIterator = maxIterator;
    }

    @Override
    public double solve(Polynomial p, double x_a, double x_b) {
        double result = 0.0;
        String table = "";
        System.out.println("f = " + p);
        System.out.println("x_0_a = " + x_a + ", x_0_p = " + x_b);

        for (int i = 0; i < this.maxIterator; i++) {
            result = x_b - p.evaluate(x_b) * (x_b - x_a) / (p.evaluate(x_b) - p.evaluate(x_a));
            if (p.evaluate(result) == 0) {
                break;
            }
            table = String.format("step = %d, c = %f, a = %f, b = %f, f(pre_x) = %f", i + 1, result, x_a, x_b,
                    p.evaluate(result));
            System.out.println(table);

            x_a = x_b;
            x_b = result;
        }

        return result;
    }

}
