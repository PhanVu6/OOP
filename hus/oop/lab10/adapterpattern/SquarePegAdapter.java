package adapterpattern;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super();
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        return peg.getWidth() * (int) Math.sqrt(2) / 2;
    }
}
