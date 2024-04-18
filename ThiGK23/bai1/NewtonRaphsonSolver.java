package bai1;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterator;

    public NewtonRaphsonSolver(double tolerance, int maxIterator) {
        this.tolerance = tolerance;
        this.maxIterator = maxIterator;
    }

    @Override
    public double solve(Polynomial p, double epsilon, double x_0) {
        double result = x_0;
        String table = "";
        double f = 0, f_prime = 0, x_pre = 0;
        System.out.println("f = " + p);
        System.out.println("f' = " + p.derivative());
        System.out.println("x_0 = " + x_0);

        for (int i = 0; i < this.maxIterator; i++) {
            f = p.evaluate(result);
            f_prime = p.derivative().evaluate(result);

            if (f == 0 || f_prime < epsilon) {
                break;
            }
            if (f_prime == 0) {
                throw new Error("f'(x) = 0 by x = " + result);
            }
            x_pre = result;
            result = result - f / f_prime;
            if (Math.abs(result - x_pre) < tolerance) {
                break;
            }
            table = String.format("step = %d, x = %f, f(pre_x) = %f, f'(pre_x) = %f ", i + 1, result, f, f_prime);
            System.out.println(table);
        }

        return result;
    }

}
