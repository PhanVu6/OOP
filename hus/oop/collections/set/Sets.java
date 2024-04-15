package hus.oop.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersec = new TreeSet<>();
        for (Integer element : second) {
            if (first.contains(element)) {
                intersec.add(element);
            }
        }
        return intersec;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new TreeSet<>();
        for (Integer element : first) {
            union.add(element);
        }
        for (Integer elementSecond : second) {
            if (!union.contains(elementSecond)) {
                union.add(elementSecond);
            }
        }
        return union;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new TreeSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new TreeSet<>(first);
        union.addAll(second);
        return union;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new TreeSet<>(source));
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> list = new ArrayList<>();
        for (Integer element : source) {
            if (!list.contains(source)) {
                list.add(element);
            }
        }
        return list;
    }

    public static String firstRecurringCharacter(String s) {
        String getFristStr = "";
        getFristStr += s.charAt(0);
        return getFristStr;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> getCharacters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && !getCharacters.contains(s.charAt(i))) {
                    getCharacters.add(s.charAt(i));
                }
            }
        }
        return getCharacters;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] array = new Integer[source.size()];
        return source.toArray(array);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.getFirst();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.getLast();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.ceiling(value);
    }
}
