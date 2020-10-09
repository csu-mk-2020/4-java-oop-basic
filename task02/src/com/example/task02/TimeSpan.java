package com.example.task02;

import java.util.Objects;

public class TimeSpan {
    private int hour;
    private int min;
    private int sec;


    public TimeSpan(int Hour, int Min, int Sec) {
        this.hour = Hour;
        this.min = Min;
        this.sec = Sec;
    }

    public void add(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time);
        this.hour += time.hour;
        this.min += time.min;
        this.sec += time.sec;
    }

    public void subtract(TimeSpan time) throws NullPointerException{
        Objects.requireNonNull(time);
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
