package com.example.task02;

import java.util.Objects;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    private void normalize() throws IllegalStateException {
        if (seconds < 0) {
            minutes--;
            seconds += 60;
        }
        if (minutes < 0) {
            hours--;
            minutes += 60;
        }
        if (hours < 0) {
            throw new IllegalStateException("Total seconds cannot be below zero");
        }
        minutes += seconds / 60;
        seconds %= 60;
        hours += minutes / 60;
        minutes %= 60;
    }

    private void checkSubtract(TimeSpan time) throws IllegalStateException {
        try {
            TimeSpan tmp = new TimeSpan(hours, minutes, seconds);
            tmp.hours -= time.hours;
            tmp.minutes -= time.minutes;
            tmp.seconds -= time.seconds;
            tmp.normalize();
        }
        catch(IllegalStateException ex) {
            throw new IllegalStateException("Cannot subtract if lhs < rhs");
        }
    }

    public TimeSpan() {
        this(0,0,0);
    }

    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 60) {
            throw new IllegalArgumentException();
        }
        this.seconds = seconds;
        normalize();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) throws IllegalArgumentException {
        if (minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException();
        }
        this.minutes = minutes;
        normalize();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) throws IllegalArgumentException {
        if (hours < 0) {
            throw new IllegalArgumentException();
        }
        this.hours = hours;
    }

    public void add(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time);
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;
        normalize();
    }

    public void subtract(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time);
        checkSubtract(time);
        seconds -= time.seconds;
        minutes -= time.minutes;
        hours -= time.hours;
        normalize();
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
