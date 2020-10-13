package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;
    private int timestamp;

    public TimeSpan(int hours, int minutes, int seconds) {
        if (hours > 24 || hours < 0) {
            throw new IllegalArgumentException("Часы могут быть только [0-23]");
        }
        if (minutes > 59 || minutes < 0) {
            throw new IllegalArgumentException("Минуты могут быть только [0-59]");
        }
        if (seconds > 59 || seconds < 0) {
            throw new IllegalArgumentException("Секунды могут быть только [0-59]");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.timestamp = this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
    }

    void setHours(int hours) {
        if (hours > 24 || hours < 0) {
            throw new IllegalArgumentException("Часы должны быть неотрицательными");
        }
        this.hours = hours;
        this.timestamp = this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
    }

    int getHours() {
        return this.hours;
    }

    void setMinutes(int minutes) {
        if (minutes > 59 || minutes < 0) {
            throw new IllegalArgumentException("Часы должны быть неотрицательными");
        }
        this.minutes = minutes;
        this.timestamp = this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
    }

    int getMinutes() {
        return this.minutes;
    }

    void setSeconds(int seconds) {
        if (seconds > 59 || seconds < 0) {
            throw new IllegalArgumentException("Часы должны быть неотрицательными");
        }
        this.seconds = seconds;
        this.timestamp = this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
    }

    int getSeconds() {
        return this.seconds;
    }

    private void timestampToTime() {
        this.seconds = this.timestamp % 60;
        this.minutes = this.timestamp / 60 % 60;
        this.hours = this.timestamp / 3600 % 3600;
    }

    void add(TimeSpan timeSpan) {
        this.timestamp = this.timestamp + timeSpan.timestamp;
        timestampToTime();
    }

    void subtract(TimeSpan timeSpan) {
        this.timestamp = this.timestamp - timeSpan.timestamp;
        timestampToTime();
    }

    public String toString() {
        return String.format("%d:%d:%d", this.hours, this.minutes, this.seconds);
    }
}
