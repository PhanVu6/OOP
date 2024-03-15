package hus.oop.lab5.mydate;

public class TestMyDate {
    public static void main(String[] args) {
        System.out.println("Test 1");
        MyDate date1 = new MyDate(2012, 2, 28);
        System.out.println(date1); // Tuesday 28 Feb 2012
        System.out.println(date1.nextDay()); // Wednesday 29 Feb 2012
        System.out.println(date1.nextDay()); // Thursday 1 Mar 2012
        System.out.println(date1.nextMonth()); // Sunday 1 Apr 2012
        System.out.println(date1.nextYear()); // Monday 1 Apr 2013
        System.out.println("Test 2");
        MyDate date2 = new MyDate(2012, 1, 2);
        System.out.println(date2); // Monday 2 Jan 2012
        System.out.println(date2.previousDay()); // Sunday 1 Jan 2012
        System.out.println(date2.previousDay()); // Saturday 31 Dec 2011
        System.out.println(date2.previousMonth()); // Wednesday 30 Nov 2011
        System.out.println(date2.previousYear()); // Tuesday 30 Nov 2010

        System.out.println("Test 3");
        MyDate date3 = new MyDate(2012, 2, 29);
        System.out.println(date3.previousYear()); // Monday 28 Feb 2011

        // System.out.println("Test 4");
        // MyDate date4 = new MyDate(2099, 11, 31); // Invalid year , month , or day !
        // System.out.println(date4);
        // System.out.println(date4.nextDay());
        // System.out.println(date4.nextDay());
        // System.out.println(date4.nextMonth());
        // System.out.println(date4.nextYear());
        // System.out.println();

        // System.out.println("Test 5");
        // MyDate date5 = new MyDate(2011, 2, 30); // Invalid year , month , or day !
        // System.out.println(date5);
        // System.out.println(date5.previousDay());
        // System.out.println(date5.previousDay());
        // System.out.println(date5.previousMonth());
        // System.out.println(date5.previousYear());
    }
}
