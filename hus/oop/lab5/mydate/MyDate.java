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
    public static final int[] DAYS_IN_MONTHS_LEAP_YEAR = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public boolean isValidDate(int year, int month, int day) {
        boolean checkYear = (year >= 1 && year <= 9999);
        boolean checkMonth = (month >= 1 && month <= 12);

        if (isLeapYear(year) && checkYear && checkMonth
                && (DAYS_IN_MONTHS_LEAP_YEAR[month - 1] >= day && day >= 1)) {
            return true;
        } else if (!isLeapYear(year) && checkYear && checkMonth
                && (DAYS_IN_MONTHS[month - 1] >= day && day >= 1)) {
            return true;
        }
        return false;
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
        if (!isLeapYear(day) && day >= 1 && day <= DAYS_IN_MONTHS[month - 1]) {
            this.day = day;
        } else if (isLeapYear(day) && day >= 1 && day <= DAYS_IN_MONTHS_LEAP_YEAR[month - 1]) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        if (!(isValidDate(year, month, day))) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }

        return String.format("%s %d %s %04d",
                DAYS[getDayOfWeek(year, month, day)], day, MONTHS[month - 1], year);
    }

    public MyDate nextDay() {
        if (isLeapYear(year)) {
            if (this.day < DAYS_IN_MONTHS_LEAP_YEAR[month - 1]) {
                ++this.day;
            } else if (this.month < 12) {
                this.day = 1;
                nextMonth();
            } else {
                throw new IllegalStateException("Day out of range!");
            }
        } else {
            if (this.day < DAYS_IN_MONTHS[month - 1]) {
                ++this.day;
            } else if (this.month <= 12) {
                this.day = 1;
                nextMonth();
            } else {
                throw new IllegalStateException("Day out of range!");
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (isLeapYear(year) && this.day > DAYS_IN_MONTHS_LEAP_YEAR[month]) {
            day = DAYS_IN_MONTHS_LEAP_YEAR[month];
        } else if (this.day > DAYS_IN_MONTHS[month]) {
            day = DAYS_IN_MONTHS[month];
        }

        if (this.month == 12) {
            this.month = 1;
            nextYear();
        } else if (this.month < 12) {
            ++this.month;
        }
        return this;
    }

    public MyDate nextYear() {
        if (this.year < 9999 && isLeapYear(year) && this.month == 2 && this.day == 29) {
            ++this.year;
            this.day = 28;
        } else if (this.year < 9999) {
            ++this.year;
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        if (isLeapYear(year)) {
            if (this.day > 1) {
                --this.day;
            } else if (this.day == 1) {
                previousMonth();
                this.day = DAYS_IN_MONTHS_LEAP_YEAR[month - 1];
            } else {
                throw new IllegalStateException("Day out of range!");
            }
        } else {
            if (this.day > 1) {
                --this.day;
            } else if (this.month == 1) {
                this.day = DAYS_IN_MONTHS[month - 1];
                previousMonth();
            } else {
                throw new IllegalStateException("Day out of range!");
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        if (this.month == 1) {
            this.month = 12;
            previousYear();
        } else if (isLeapYear(year) && this.day > DAYS_IN_MONTHS_LEAP_YEAR[month - 2]) {
            this.day = DAYS_IN_MONTHS_LEAP_YEAR[month - 2];
            --this.month;
        } else if (this.day > DAYS_IN_MONTHS[month - 2]) {
            this.day = DAYS_IN_MONTHS[month - 2];
            --this.month;
        } else {
            --this.month;
        }
        return this;
    }

    public MyDate previousYear() {
        if (this.year > 1 && isLeapYear(year) && month == 2 && day == 29) {
            --this.year;
            this.day = 28;
        } else if (this.year > 1) {
            --this.year;
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }
}
