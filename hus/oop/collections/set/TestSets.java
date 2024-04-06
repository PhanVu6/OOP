package hus.oop.collections.set;

import java.util.*;

public class TestSets {

    public static void main(String[] args) {
        // Test intersectionManual
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersection Manual: " + Sets.intersectionManual(set1, set2));

        // Test unionManual
        System.out.println("Union Manual: " + Sets.unionManual(set1, set2));

        // Test intersection
        System.out.println("Intersection: " + Sets.intersection(set1, set2));

        // Test union
        System.out.println("Union: " + Sets.union(set1, set2));

        // Test toList
        System.out.println("ToList: " + Sets.toList(set1));

        // Test removeDuplicates
        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6);
        System.out.println("Remove Duplicates: " + Sets.removeDuplicates(listWithDuplicates));

        // Test removeDuplicatesManual
        System.out.println("Remove Duplicates Manual: " + Sets.removeDuplicatesManual(listWithDuplicates));

        // Test firstRecurringCharacter
        String s = "Hellohehe";
        System.out.println("First Recurring Character: " + Sets.firstRecurringCharacter(s));

        // Test allRecurringChars
        System.out.println("All Recurring Characters: " + Sets.allRecurringChars(s));

        // Test toArray
        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println("ToArray: " + Arrays.toString(Sets.toArray(set3)));

        // Test getFirst
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 2, 3));
        System.out.println("Get First: " + Sets.getFirst(treeSet));

        // Test getLast
        System.out.println("Get Last: " + Sets.getLast(treeSet));

        // Test getGreater
        System.out.println("Get Greater: " + Sets.getGreater(treeSet, 2));
    }
}
