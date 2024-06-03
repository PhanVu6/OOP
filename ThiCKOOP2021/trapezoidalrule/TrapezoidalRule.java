public class TrapezoidalRule {
    public static void main(String[] args) {
        System.out.println(integrate());
    }

    public static double f(double x) {
        return Math.sin(x) * Math.sin(x) * Math.cos(x);
    }

    public static double integrate(int n) {
        double h = (Math.PI / 2 - 0) / n;
        double x = 0;
        double result = (f(0) + f(n * h)) / 2;
        for (int index = 1; index < n; index++) {
            x = index * h;
            result += f(x);
        }
        return h * result;
    }

    public static double integrate() {
        int n_0 = 2;
        while (integrate(2 * n_0) - integrate(n_0) >= Math.pow(10, -6)) {
            n_0 *= 2;
        }
        return integrate(n_0);
    }
}