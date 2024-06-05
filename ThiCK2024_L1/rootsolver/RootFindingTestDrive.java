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

		double tolerance = 1e-5;
		int maxIterations = 10000;
		AbstractFunction function = new UnivariateRealFunction();
		RootSolver secantSolver = new SecantSolver(tolerance, maxIterations);
		RootSolver newtonRaphsonSolver = new NewtonRaphsonSolver(tolerance, maxIterations);
		RootSolver bisectionSolver = new BisectionSolver(tolerance, maxIterations);

		UnivariateRealRootFinding univariateRealRootFinding0 = new UnivariateRealRootFinding(function,
				secantSolver);
		UnivariateRealRootFinding univariateRealRootFinding1 = new UnivariateRealRootFinding(function,
				newtonRaphsonSolver);
		UnivariateRealRootFinding univariateRealRootFinding2 = new UnivariateRealRootFinding(function,
				bisectionSolver);

		double lower = 8;
		double upper = 10;

		// SecantSolver
		System.out.println("SecantSolver: " +
				univariateRealRootFinding0.solve(lower, upper) + "\n");

		// NewtonRaphsonSolver
		System.out.println("NewtonRaphsonSolver: " +
				univariateRealRootFinding1.solve(lower, upper) + "\n");

		// BisectionSolver
		System.out.println("BisectionSolver: " +
				univariateRealRootFinding2.solve(lower, upper));

	}
}
