package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hrs, int min, int sec) {
        if (hrs < 0) {
            throw new IllegalArgumentException("часы не могут быть отрицательными");
        }
        if (min < 0 || min >= 60) {
            throw new IllegalArgumentException("минуты вне диапазона [0,60]");
        }
        if (sec < 0 || sec >= 60) {
            throw new IllegalArgumentException("секунды вне диапазона [0,60]");
        }
        this.hour = hrs;
        this.minute = min;
        this.second = sec;
    }

    private int inSecondsTimeSpan() {
        return (this.hour * 60 * 60) + (this.minute * 60) + this.second;
    }

    private void normalize(int src) {
        this.second = src % 60;
        this.minute = src / 60 % 60;
        this.hour = src / (60 * 60);
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
            throw new IllegalArgumentException("часы часы не могут быть отрицательными");
        }
        hour = src;
    }

    public void setMinute(int src) {
        if (src < 0 || src >= 60) {
            throw new IllegalArgumentException("минуты вне диапазона [0,60]");
        }
        minute = src;
    }

    public void setSecond(int src) {
        if (src < 0 || src >= 60) {
            throw new IllegalArgumentException("секунды вне диапазона [0,60]");
        }
        second = src;
    }

    public void add(TimeSpan time) {
        if (time == null) {
            throw new NullPointerException("аргумент пуст");
        }
        normalize(this.inSecondsTimeSpan() + time.inSecondsTimeSpan());
    }

    public void subtract(TimeSpan time) {
        if (time == null) {
            throw new NullPointerException("аргумент пуст");
        }
        if (this.inSecondsTimeSpan() < time.inSecondsTimeSpan()) {
            throw new IllegalArgumentException("аргумент велик");
        }
        normalize(this.inSecondsTimeSpan() - time.inSecondsTimeSpan());
    }


    public String toString() {
        return String.format("[%d:%d:%d]", hour, minute, second);
    }

}