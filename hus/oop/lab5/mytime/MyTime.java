package hus.oop.lab5.mytime;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (this.second == 59) {
            this.second = 0;
            nextMinute();
        } else {
            this.second++;
        }
        return this;
    }

    public MyTime nextMinute() {
        if (this.minute == 59) {
            this.minute = 0;
            nextHour();
        } else {
            this.minute++;
        }
        return this;
    }

    public MyTime nextHour() {
        if (this.hour == 23) {
            this.hour = 0;
        } else {
            this.hour++;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (this.second == 0) {
            this.second = 59;
            previousMinute();
        } else {
            this.second--;
        }
        return this;
    }

    public MyTime previousMinute() {
        if (this.minute == 0) {
            this.minute = 59;
            previousHour();
        } else {
            this.minute--;
        }
        return this;
    }

    public MyTime previousHour() {
        if (this.hour == 0) {
            this.hour = 23;
        } else {
            this.hour--;
        }
        return this;
    }
}
