package hus.oop.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {

    public static void main(String[] args) {
        // Test insertFirst
        List<Integer> testList1 = new ArrayList<>();
        System.out.println("List: " + testList1);
        Lists.insertFirst(testList1, 5);
        System.out.println("After insertFirst: " + testList1);

        // Test insertLast
        List<Integer> testList2 = new ArrayList<>();
        System.out.println("List: " + testList2);
        Lists.insertLast(testList2, 10);
        System.out.println("After insertLast: " + testList2);

        // Test replaceThird
        List<Integer> testList3 = new ArrayList<>();
        testList3.add(1);
        testList3.add(2);
        testList3.add(3);
        testList3.add(4);
        System.out.println("List: " + testList3);
        Lists.replaceThird(testList3, 100);
        System.out.println("After replaceThird: " + testList3);

        // Test removeThird
        List<Integer> testList4 = new ArrayList<>();
        testList4.add(1);
        testList4.add(2);
        testList4.add(3);
        testList4.add(4);
        System.out.println("List: " + testList4);
        Lists.removeThird(testList4);
        System.out.println("After removeThird: " + testList4);

        // Test removeEvil
        List<Integer> testList5 = new ArrayList<>();
        testList5.add(666);
        testList5.add(1);
        testList5.add(2);
        System.out.println("List: " + testList5);
        Lists.removeEvil(testList5);
        System.out.println("After removeEvil: " + testList5);

        // Test generateSquare
        List<Integer> testList6 = Lists.generateSquare();
        System.out.println("generateSquare: " + testList6);

        // Test contains
        List<Integer> testList7 = new ArrayList<>();
        testList7.add(1);
        testList7.add(2);
        testList7.add(3);
        System.out.println("List: " + testList7);
        System.out.println("contains 3? " + Lists.contains(testList7, 3));
        System.out.println("contains 6? " + Lists.contains(testList7, 6));

        // Test copy
        List<Integer> testList8 = new ArrayList<>();
        System.out.println("List: " + testList7);
        Lists.copy(testList7, testList8);
        System.out.println("copy: " + testList8);

        // Test reverse
        List<Integer> testList9 = new ArrayList<>();
        testList9.add(1);
        testList9.add(2);
        testList9.add(3);
        System.out.println("List: " + testList9);
        Lists.reverse(testList9);
        System.out.println("reverse: " + testList9);

        // Test reverseManual
        List<Integer> testList10 = new ArrayList<>();
        testList10.add(1);
        testList10.add(2);
        testList10.add(3);
        System.out.println("List: " + testList10);
        Lists.reverseManual(testList10);
        System.out.println("reverseManual: " + testList10);

        // Test insertBeginningEnd
        LinkedList<Integer> testList11 = new LinkedList<>();
        System.out.println("List: " + testList11);
        Lists.insertBeginningEnd(testList11, 7);
        System.out.println("After insertBeginningEnd: " + testList11);
    }
}