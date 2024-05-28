package integration;

public class MidpointRule implements Integrator {
    private double precision;
    private int maxIterations;

    public MidpointRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu
     * phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n =
     * n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia
     * đôi vượt quá ngưỡng quy định (maxIterations).
     * 
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int n0 = (int) (Math.random() * 9) + 1;
        double integration2n0 = integrate(poly, lower, upper, 2 * n0);
        double integrationn0 = integrate(poly, lower, upper, n0);
        while (Math.abs(integration2n0 - integrationn0) / 3 > this.precision && maxIterations-- > 0) {
            n0 = 2 * n0;
            integration2n0 = integrate(poly, lower, upper, 2 * n0);
            integrationn0 = integrate(poly, lower, upper, n0);
        }
        return integrationn0;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân
     * hoạch đều.
     * 
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double deta_x = (upper - lower) / numOfSubIntervals;
        double sum_x = 0;
        int degree_x = 0;
        double result = 0;
        while (degree_x < numOfSubIntervals) {
            sum_x = ((lower + degree_x * deta_x) + (lower + (degree_x + 1) * deta_x)) / 2;
            result += poly.evaluate(sum_x);
            degree_x++;
        }
        result *= deta_x;
        return result;
    }
}
