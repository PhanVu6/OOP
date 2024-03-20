package hus.oop.lab5.mydate;

import javax.imageio.IIOException;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public static final String[] MONTHS = { "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    public static final String[] DAYS = { "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday" };
    public static final int[] DAYS_IN_MONTHS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        boolean checkYear = (year >= 1 && year <= 9999);
        boolean checkMonth = (month >= 1 && month <= 12);

        if (!checkYear || !checkMonth) {
            return false;
        }

        int lastDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year) && month == 2) {
            lastDay = 29;
        }
        return 1 <= day && day <= lastDay;
    }

    public int getDayOfWeek(int year, int month, int day) {
        final int[] mounthCommonYear = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
        final int[] mounthLeapYear = { 0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6 };

        if (isLeapYear(year)) {
            return (day + mounthLeapYear[month - 1] + 5 * ((year - 1) % 4) + 4 * ((year - 1) % 100)
                    + 6 * ((year - 1) % 400)) % 7;
        }
        return (day + mounthCommonYear[month - 1] + 5 * ((year - 1) % 4) + 4 * ((year - 1) % 100)
                + 6 * ((year - 1) % 400)) % 7;
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 9999) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int lastDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(day) && month == 2) {
            lastDay = 29;
        }

        if (day >= 1 && day <= lastDay) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %s %04d",
                DAYS[getDayOfWeek(year, month, day)], day, MONTHS[month - 1], year);
    }

    public MyDate nextDay() {
        ++day;
        int lastDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year) && month == 2) {
            lastDay = 29;
        }

        if (day > lastDay) {
            day = 1;
            nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        ++month;
        int lastDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year) && month == 2) {
            lastDay = 29;
        }

        if (month > 12) {
            month = 1;
            nextYear();
        }

        if (day > lastDay) {
            day = lastDay;
        }
        return this;
    }

    public MyDate nextYear() {
        ++year;
        if (this.year > 9999) {
            year = 9999;
            throw new IllegalStateException("Year out of range!");
        }

        if (!isLeapYear(year) && month == 2 && day == 29) {
            day = 28;
        }
        return this;
    }

    public MyDate previousDay() {
        --day;
        if (day < 1) {
            previousMonth();
            if (isLeapYear(year) && month == 2) {
                day = 29;
            } else {
                day = DAYS_IN_MONTHS[month - 1];
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        --month;
        if (month < 1) {
            previousYear();
            month = 12;
        }

        if (isLeapYear(year) && month == 2) {
            day = 29;
        } else if (day > DAYS_IN_MONTHS[month - 1]) {
            day = DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }

    public MyDate previousYear() {
        --year;
        if (year < 1) {
            year = 1;
            throw new IllegalStateException("Year out of range!");
        }

        if (!isLeapYear(year) && month == 2 && day == 29) {
            day = 28;
        }

        return this;
    }
}
