package hus.oop.lab9.library;

public class Library {
    protected Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent longestRent = rents[0];
        for (int i = 1; i < rents.length; i++) {
            if ((longestRent.end.getTime() - longestRent.begin.getTime()) < (rents[i].end.getTime())
                    - rents[i].begin.getTime()) {
                longestRent = rents[i];
            }
        }
        return longestRent;
    }
}
