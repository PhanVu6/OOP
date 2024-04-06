package hus.oop.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> ans = new TreeSet<>();
        Iterator<Integer> iterator = first.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (second.contains(value)) {
                ans.add(value);
            }
        }
        return ans;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> ans = new TreeSet<>();
        Iterator<Integer> iterator1 = first.iterator();
        while (iterator1.hasNext()) {
            Integer value = iterator1.next();
            ans.add(value);
        }
        Iterator<Integer> iterator2 = second.iterator();
        while (iterator2.hasNext()) {
            Integer value = iterator2.next();
            ans.add(value);
        }
        return ans;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = new TreeSet<>(first);
        intersectionSet.retainAll(second);
        return intersectionSet;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new TreeSet<>(first);
        unionSet.addAll(second);
        return unionSet;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new TreeSet<>(source));
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> ans = new ArrayList<>();
        Iterator<Integer> iterator = source.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (!ans.contains(value)) {
                ans.add(value);
            }
        }
        return ans;
    }

    public static String firstRecurringCharacter(String s) {
        s = s.toLowerCase();
        int[] arr = new int[28];
        for (int i = 0; i < s.length(); i++) {
            int code = (int) s.charAt(i) - (int) ('a');
            arr[code]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[(int) s.charAt(i) - (int) ('a')] > 1) {
                return String.valueOf(s.charAt(i));
            }
        }

        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> opSet = new HashSet<>();
        int[] cnt = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                int code = Character.toLowerCase(c) - 'a';
                cnt[code]++;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c) && cnt[Character.toLowerCase(c) - 'a'] > 1) {
                opSet.add(c);
            }
        }

        return opSet;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] ans = new Integer[source.size()];
        return source.toArray(ans);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.ceiling(value);
    }

}