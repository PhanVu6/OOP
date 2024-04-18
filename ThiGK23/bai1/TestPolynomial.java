package bai1;

public class TestPolynomial {
    public static void main(String[] args) {
        testArrayPolynomial();
        testListPolynomial();
        testRootSolver();
    }

    // Array Class
    public static void testArrayPolynomial() {
        System.out.println("\n*) ARRAY:");
        ArrayPolynomial ap = new ArrayPolynomial();
        ArrayPolynomial ap2 = new ArrayPolynomial();

        ap.append(1);
        ap.append(2);
        ap.append(3);
        ap.append(4);
        System.out.println("Polycy 1 by array method: " + ap);
        ap2.append(4);
        ap2.append(5);
        ap2.append(6);
        System.out.println("Polycy 2 by array method: " + ap2);

        System.out.println("Insert by array method, polycy 1 position is 1 with value 2: " + ap.insert(2, 1));

        System.out.println("Minus poly by array method: " + ap.minus(ap2));
        System.out.println("Plus poly by array method: " + ap.plus(ap2));
        System.out.println("Set by array method, value position 1 by value 5: " +
                ap.set(5, 1));
        System.out.println("Evaluate poly by array method (value x = 2): " +
                ap.evaluate(2));
        System.out.println("Derivative polycy 1 by array method: " + ap.derivative());

        System.out.println();
        System.out.println("Polycy 1 by array method: " + ap);
        System.out.println("Polycy 2 by array method: " + ap2);
        System.out.println("Multiply poly by array method: " + ap.multiply(ap2));
    }

    // List Class
    public static void testListPolynomial() {
        System.out.println("\n*) LIST:");
        ListPolynomial lp = new ListPolynomial();
        ListPolynomial lp2 = new ListPolynomial();

        lp.append(1);
        lp.append(2);
        lp.append(3);
        lp.append(4);
        System.out.println("Polycy 1 by list method: " + lp);
        lp2.append(4);
        lp2.append(5);
        lp2.append(6);
        System.out.println("Polycy 2 by list method: " + lp2);

        System.out.println("Insert by list method, polycy 1 position is 1 with value 2: " + lp.insert(2, 1));

        System.out.println("Minus poly by list method: " + lp.minus(lp2));
        System.out.println("Plus poly by list method: " + lp.plus(lp2));
        System.out.println("Set by list method, value position 1 by value 5: " +
                lp.set(5, 1));
        System.out.println("Evaluate poly by list method (value x = 2): " +
                lp.evaluate(2));
        System.out.println("Derivative polycy 1 by list method: " + lp.derivative());

        System.out.println();
        System.out.println("Polycy 1 by list method: " + lp);
        System.out.println("Polycy 2 by list method: " + lp2);
        System.out.println("Multiply poly by list method: " + lp.multiply(lp2));
    }

    public static void testRootSolver() {

        // NewtonRaphsonSolver;
        NewtonRaphsonSolver newton = new NewtonRaphsonSolver(0.001, 20);
        // BisectionSolver;
        BisectionSolver bisection = new BisectionSolver(0.001, 20);
        // SecantSolver;
        SecantSolver secant = new SecantSolver(0.001, 20);

        ListPolynomial lp3 = new ListPolynomial();
        lp3.append(8);
        lp3.append(12);
        lp3.append(3);
        lp3.append(1);

        ArrayPolynomial ap3 = new ArrayPolynomial();
        ap3.append(8);
        ap3.append(12);
        ap3.append(3);
        ap3.append(1);

        // Polynomial
        Polynomial polycy1 = lp3;
        Polynomial polycy2 = ap3;
        RootSolver method1 = newton;
        RootSolver method2 = bisection;

        // 1 param
        PolynomialRootFinding PolyRootFinding2 = new PolynomialRootFinding(polycy2);
        PolyRootFinding2.setRootSolver(method2);
        if (method2 instanceof NewtonRaphsonSolver) {
            System.out.println("\n*) NewtonRaphsonSolver");
            System.out.println(PolyRootFinding2.solve(-10, 5));
        } else if (method2 instanceof SecantSolver) {
            System.out.println("\n*) SecantSolver");
            System.out.println(PolyRootFinding2.solve(-5, 5));
        } else if (method2 instanceof BisectionSolver) {
            System.out.println("\n*) BisectionSolver");
            System.out.println(PolyRootFinding2.solve(-5, 5));
        }

        // 2 param
        PolynomialRootFinding PolyRootFinding1 = new PolynomialRootFinding(polycy1, method1);
        if (method1 instanceof NewtonRaphsonSolver) {
            System.out.println("\n*) NewtonRaphsonSolver");
            System.out.println(PolyRootFinding1.solve(-10, 5));
        } else if (method1 instanceof SecantSolver) {
            System.out.println("\n*) SecantSolver");
            System.out.println(PolyRootFinding1.solve(-5, 5));
        } else if (method1 instanceof BisectionSolver) {
            System.out.println("\n*) BisectionSolver");
            System.out.println(PolyRootFinding1.solve(-5, 5));
        }
    }

}
