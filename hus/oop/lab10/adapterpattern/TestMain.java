package adapterpattern;

public class TestMain {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        boolean fits = hole.fits(roundPeg); // true
        System.out.println("Fit is: " + fits);
        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
        // This won't compile due to incompatible types
        // hole.fits(smallSquarePeg);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println(smallSquarePegAdapter.getRadius());
        System.out.println(largeSquarePegAdapter.getRadius());
    }
}
