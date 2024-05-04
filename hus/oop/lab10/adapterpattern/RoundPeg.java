package adapterpattern;

public class RoundPeg {
    private int radius;

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    public RoundPeg() {
        radius = 0;
    }

    public int getRadius() {
        return radius;
    }
}
