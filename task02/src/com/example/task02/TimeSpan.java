package com.example.task02;

import java.sql.Time;
import java.util.Objects;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    TimeSpan(int hours, int minutes, int seconds) {
        if (seconds >= 60 || seconds < 0
                || minutes >= 60 || minutes < 0
                || hours < 0) {
            throw new IllegalArgumentException("Wrong argument value");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (hours > 0) {
            throw new IllegalArgumentException("Hours must be positive");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes > 0) {
            throw new IllegalArgumentException("Minutes must be positive");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds > 0) {
            throw new IllegalArgumentException("Seconds must be positive");
        }
        this.seconds = seconds;
    }

    private void update() throws Exception {
        int total = this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
        if (total < 0) {
            throw new Exception("TimeSpan less than 0");
        }
        this.seconds = total % 60;
        this.minutes = (total / 60) % 60;
        this.hours = (total / 60) / 60;
    }

    void add(TimeSpan time) throws Exception {
        Objects.requireNonNull(time);
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
        this.update();
    }

    void subtract(TimeSpan time) throws Exception {
        Objects.requireNonNull(time);
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
        this.update();
    }

    public String toString() {
        return String.format(
                "Hours: %d, Minutes: %d, Seconds: %d",
                this.hours, this.minutes, this.seconds
        );
    }
}
