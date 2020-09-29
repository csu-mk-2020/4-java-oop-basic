package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    TimeSpan(int hrs, int min, int sec) {
        if (hrs >= 0 || (min >= 0 && min < 60) || (sec >= 0 && sec < 60)) {
            hour = hrs;
            minute = min + sec / 60;
            second = sec % 60;
        } else throw new IllegalArgumentException("аргумент вне диапазона [0,59]");
    }

    private void normalize() {
        if (hour >= 0) {
            if (second > 59) {
                minute += second / 60;
                second %= 60;
            }
            if (minute > 59) {
                hour += minute / 60;
                minute %= 60;
            }
            if (second < 0) {
                minute -= (second / 60 + 1);
                second %= 60;
                second += 60;
            }
            if (minute < 0) {
                hour -= (minute / 60 + 1);
                minute %= 60;
                minute += 60;
            }
            if (hour < 0) {
                throw new ArithmeticException("часы не могут быть отрицательными");
            }
        } else throw new ArithmeticException("часы не могу быть отрицательными");
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int src) {
        if (src < 0) {
            throw new IllegalArgumentException("аргумент не может быть отрицательным");
        }
        hour = src;
    }

    public void setMinute(int src) {
        if (src < 0) {
            throw new IllegalArgumentException("аргумент не может быть отрицательным");
        }
        minute = src;
        normalize();
    }

    public void setSecond(int src) {
        if (src < 0) {
            throw new IllegalArgumentException("аргумент не может быть отрицательным");
        }
        second = src;
        normalize();
    }

    void add(TimeSpan time) {
        if (time == null) {
            throw new NullPointerException("аргумент пуст");
        }
        hour += time.getHour();
        minute += time.getMinute();
        second += time.getSecond();
        normalize();
    }

    void subtract(TimeSpan time) {
        if (time == null) {
            throw new NullPointerException("аргумент пуст");
        }
        hour -= time.getHour();
        minute -= time.getMinute();
        second -= time.getSecond();
        normalize();
    }

    public String toString() {
        return String.format("[%d:%d:%d]", hour, minute, second);
    }

}
