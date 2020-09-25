package com.example.task02;

public class TimeSpan {
    private int hour;
    private int min;
    private int sec;

    TimeSpan() {
    }

    TimeSpan(int Hour, int Min, int Sec) {
        this.hour = Hour;
        this.min = Min;
        this.sec = Sec;
    }

    void add(TimeSpan time) {
        this.hour += time.hour;
        this.min += time.min;
        this.sec += time.sec;
    }

    void subtract(TimeSpan time) {
        this.hour -= time.hour;
        this.min -= time.min;
        this.sec -= time.sec;
    }

    public String toString() {
        this.min += this.sec / 60;
        this.hour += this.min / 60;
        this.sec = this.sec % 60;
        this.min = this.min % 60;
        return String.format("(%d:%d:%d)", this.hour, this.min, this.sec);
    }
}
