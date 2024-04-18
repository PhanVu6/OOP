package hus.oop.decorator;

import java.util.Comparator;

public class MyCostComparator implements Comparator<Bread> {

    @Override
    public int compare(Bread o1, Bread o2) {
        if (o1.cost() == o2.cost()) {
            return 0;
        }
        return o1.cost() - o2.cost() > 0 ? 1 : -1;
    }

}
