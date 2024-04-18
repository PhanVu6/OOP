package bai1;

public class PolynomialRootFinding {
    private Polynomial poly;
    private RootSolver rootSolver;

    public PolynomialRootFinding(Polynomial poly) {
        this.poly = poly;
    }

    public PolynomialRootFinding(Polynomial poly, RootSolver rootSolver) {
        this.poly = poly;
        this.rootSolver = rootSolver;
    }

    public void setPoly(Polynomial poly) {
        this.poly = poly;
    }

    public void setRootSolver(RootSolver rootSolver) {
        this.rootSolver = rootSolver;
    }

    public double solve(double x_a, double x_b) {
        return rootSolver.solve(poly, x_a, x_b);
    }

}
