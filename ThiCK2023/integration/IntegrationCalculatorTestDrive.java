package integration;

public class IntegrationCalculatorTestDrive {
  public static void main(String[] args) {
    /*
     * TODO
     * 
     * - Chạy demo các hàm test.
     * - Lưu kết quả chạy chương trình vào file text có tên
     * <TenSinhVien_MaSinhVien_Integration>.txt
     * (ví dụ, NguyenVanA_123456_Integration.txt)
     * - Nộp file kết quả chạy chương trình (file text trên) cùng với các file
     * source code.
     */
    testArrayPolynomial();
    testListPolynomial();
    testIntegrationCalculator();
  }

  public static void testArrayPolynomial() {
    /*
     * TODO
     * 
     * - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào
     * đa thức, xóa phần tử trong đa thức,
     * sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức,
     * tính giá trị của đa thức khi biết
     * giá trị của x).
     */
    System.out.println("Test Array Polynominal");
    ArrayPolynomial ap1 = new ArrayPolynomial();
    ap1.append(0);
    ap1.append(2);
    ap1.append(-3);
    ap1.append(1);
    ap1.append(0);
    System.out.println(ap1);
    System.out.println("Gia tri cua poly tai x = 5: " + ap1.evaluate(5));

    ArrayPolynomial ap2 = new ArrayPolynomial();
    ap2.append(0);
    ap2.append(0);
    ap2.append(6);
    ap2.append(-5);
    ap2.append(1);
    ap2.set(10, 2);
    System.out.println(ap2);

    System.out.println("Plus");
    System.out.println(ap1.plus(ap2));
    System.out.println("Minus");
    System.out.println(ap1.minus(ap2));
    System.out.println("Multiply");
    System.out.println(ap1.multiply(ap2));
    System.out.println();
  }

  public static void testListPolynomial() {
    /*
     * TODO
     * 
     * - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào
     * đa thức, xóa phần tử trong đa thức,
     * sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức,
     * tính giá trị của đa thức khi biết
     * giá trị của x).
     */
    System.out.println("Test List Polynominal");
    ListPolynomial lp1 = new ListPolynomial();
    lp1.append(0);
    lp1.append(2);
    lp1.append(-3);
    lp1.append(1);
    lp1.append(0);
    System.out.println(lp1);
    System.out.println("Gia tri cua poly tai x = 5: " + lp1.evaluate(5));
    lp1.set(20, 2);

    ListPolynomial lp2 = new ListPolynomial();
    lp2.append(0);
    lp2.append(0);
    lp2.append(6);
    lp2.append(-5);
    lp2.append(1);
    System.out.println(lp2);
    System.out.println("Plus");
    System.out.println(lp1.plus(lp2));
    System.out.println("Minus");
    System.out.println(lp1.minus(lp2));
    System.out.println("Multiply");
    System.out.println(lp1.multiply(lp2));
    System.out.println();
  }

  public static void testIntegrationCalculator() {
    /*
     * TODO
     * 
     * - Tạo một đa thức.
     * - Viết demo chương trình tính tích phân xác định của đa thức theo các phương
     * pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
     * IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời
     * gian chạy chương trình.
     * - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa
     * thức.
     */
    System.out.println("Test intergation caculator");
    ArrayPolynomial ap1 = new ArrayPolynomial();
    ap1.append(0);
    ap1.append(0);
    ap1.append(1);
    ap1.append(0);
    System.out.println(ap1);

    IntegrationCalculator integrationCaculator = new IntegrationCalculator(ap1);
    System.out.println("Intergation caculator by MidPointRule");
    integrationCaculator.setIntegrator(new MidpointRule(0.001, 100));
    System.out.println(integrationCaculator.integrate(0, 1));

    System.out.println("Intergation caculator by SimpsonRule");
    integrationCaculator.setIntegrator(new SimpsonRule(0.001, 100));
    System.out.println(integrationCaculator.integrate(0, 1));

    System.out.println("Intergation caculator by TrapezoidRule");
    integrationCaculator.setIntegrator(new TrapezoidRule(0.001, 100));
    System.out.println(integrationCaculator.integrate(0, 1));
  }
}