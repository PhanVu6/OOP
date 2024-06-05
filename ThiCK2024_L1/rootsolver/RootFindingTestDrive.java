package rootsolver;

public class RootFindingTestDrive {
    public static void main(String[] args) {
        /*
         * TODO
         * 
         * Chạy các hàm test để test chương trình.
         * Lưu kết quả chạy chương trình vào file text có tên
         * <TenSinhVien_MaSinhVien_RootFinding>.txt
         * (ví dụ, NguyenVanA_123456_RootFinding.txt).
         * Nén tất cả các file source code và file kết quả chạy chương trình vào file
         * zip có tên
         * <TenSinhVien_MaSinhVien_RootFinding>.zip (ví dụ,
         * NguyenVanA_123456_RootFinding.txt), và nộp bài
         * lên classroom.
         */

        testRootSolver();
    }

    public static void testRootSolver() {
        /*
         * TODO
         * 
         * - Viết chương trình tìm nghiệm của hàm (sin(x).x - 3) theo các phương pháp đã
         * cho (Bisection, Newton-Raphson, Secant) sử dụng
         * UnivariateRealRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời
         * gian chạy chương trình.
         * - In ra phương pháp sử dụng, hàm và nghiệm của hàm tìm được.
         */

        AbstractFunction function = new UnivariateRealFunction();
        RootSolver secantSolver = new SecantSolver(0.001, 15);
        RootSolver newtonRaphsonSolver = new NewtonRaphsonSolver(0.001, 15);
        RootSolver bisectionSolver = new BisectionSolver(0.001, 15);

        UnivariateRealRootFinding univariateRealRootFinding0 = new UnivariateRealRootFinding(function, secantSolver);
        UnivariateRealRootFinding univariateRealRootFinding1 = new UnivariateRealRootFinding(function,
                newtonRaphsonSolver);
        UnivariateRealRootFinding univariateRealRootFinding2 = new UnivariateRealRootFinding(function, bisectionSolver);

        // SecantSolver
        System.out.println("SecantSolver: " +
                univariateRealRootFinding0.solve(1, 4) + "\n");

        // NewtonRaphsonSolver
        System.out.println("NewtonRaphsonSolver: " +
                univariateRealRootFinding1.solve(1, 4) + "\n");

        // BisectionSolver
        System.out.println("BisectionSolver: " +
                univariateRealRootFinding2.solve(1, 4));

    }
}
