public class Test {
    public static double sin(double x) {
        double denominator, sinX;
        double term = x;
        sinX = x;
        int i = 1;
        do {
            denominator = (i * 2) * (i * 2 + 1);
            term *= -(x * x) / denominator;
            sinX += term;
            i++;
        } while (Math.abs(term) >= 1e-15);
        return sinX;

    }

    public static void main(String[] args) {
        System.out.println(sin(10));
        System.out.println(Math.sin(10));
    }
}
