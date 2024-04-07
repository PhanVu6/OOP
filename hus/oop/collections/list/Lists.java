package hus.oop.collections.list;

import java.util.*;

public class Lists {

    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    public static void replaceThird(List<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(List<Integer> list) {
        if (list.size() > 3) {
            list.remove(2);
        } else {
            System.out.println("No third value exists.");
        }
    }

    public static void removeEvil(List<Integer> list) {
        if (contains(list, 666)) {
            list.remove(Integer.valueOf(666));
        } else {
            System.out.println("No Evil exists.");
        }
    }

    public static List<Integer> generateSquare() {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ans.add(i * i);
        }
        return ans;
    }

    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        Iterator<Integer> iterator = source.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            target.add(num);
        }
    }

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(List<Integer> list) {
        int temp = 0;
        int indexEnd = list.size() - 1;

        for (int i = 0; i < indexEnd; i++) {
            temp = list.get(i);
            list.set(i, list.get(indexEnd));
            list.set(indexEnd, temp);
            indexEnd--;
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        insertFirst(list, value);
        insertLast(list, value);
    }
}
