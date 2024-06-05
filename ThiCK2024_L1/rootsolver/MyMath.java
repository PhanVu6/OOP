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
        double accuracy = 0.0001, term, expSum, expPre;
        int i = 1;
        expSum = 1;
        term = 1;
        expPre = expSum;
        do {
            term *= x / i;
            expSum += term;
            i++;
        } while (accuracy <= expPre - expSum);
        return expSum;
    }

    public double ln(double x) {
        double accuracy = 0.0001, term, lnSum, lnPre;
        int i = 2;
        lnSum = x;
        term = 1;
        lnPre = lnSum;
        do {
            term *= -x;
            lnSum += term / i;
            i++;
        } while (accuracy <= lnPre - lnSum);
        return lnSum;
    }
}
