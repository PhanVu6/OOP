package rootsolver;

public class MyMath {
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

    public static double cos(double x) {
        double term, denominator, cosX;
        term = 1;
        cosX = 1;
        int i = 1;
        do {
            denominator = 2 * i * (2 * i - 1);
            term *= -(x * x) / denominator;
            cosX += term;
            i++;

        } while (Math.abs(term) >= 1e-15);
        return cosX;
    }

    public double exp(double x) {
        double term, expSum;
        int i = 1;
        expSum = 1;
        term = 1;
        do {
            term *= x / i;
            expSum += term;
            i++;
        } while (Math.abs(term) >= 1e-15);
        return expSum;
    }

    public double ln(double x) {
        double term, lnSum;
        int i = 2;
        lnSum = x;
        term = x;
        do {
            term *= -x;
            lnSum += term / i;
            i++;
        } while (Math.abs(term) >= 1e-15);
        return lnSum;
    }
}
