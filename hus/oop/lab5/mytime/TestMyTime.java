package hus.oop.lab5.mytime;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(23, 9, 59);
        System.out.println("Now: " + time1);
        time1.setTime(23, 59, 59);
        System.out.println("Now: " + time1);
        System.out.println("Next Second: " + time1.nextSecond());
        System.out.println("Next Second: " + time1.nextSecond());
        System.out.println("Next Minute: " + time1.nextMinute());
        System.out.println("Next Hour: " + time1.nextHour());
        System.out.println(time1);
        System.out.println("Previous Second: " + time1.previousSecond());
        System.out.println("Previous Minute: " + time1.previousMinute());
        System.out.println("Previous Hour: " + time1.previousHour());
        System.out.println("Previous Hour: " + time1.previousHour());
        System.out.println(time1);

    }
}
