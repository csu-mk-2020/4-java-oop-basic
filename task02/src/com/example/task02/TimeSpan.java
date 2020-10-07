package com.example.task02;

public class TimeSpan {
    private int hrs;
    private int minutes;
    private int secs;
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

        this.hrs = hours;
        this.minutes = minutes;
        this.secs = seconds;
        this.timestamp = this.hrs * 60 * 60 + this.minutes * 60 + this.secs;
    }

    void setHrs(int hrs) {
        if (hrs < 0) {
            throw new IllegalArgumentException("Часы должны быть неотрицательными");
        }
        this.hrs = hrs;
    }

    int getHrs() {
        return this.hrs;
    }

    void setMinutes(int mnts) {
        if (mnts < 0) {
            throw new IllegalArgumentException("Часы должны быть неотрицательными");
        }
        this.minutes = mnts;
    }

    int getMinutes() {
        return this.minutes;
    }

    void setSecs(int secs) {
        if (secs < 0) {
            throw new IllegalArgumentException("Часы должны быть неотрицательными");
        }
        this.secs = secs;
    }

    int getSecs() {
        return this.secs;
    }

    private void timestampToTime() {
        this.secs = this.timestamp % 60;
        this.minutes = this.timestamp / 60 % 60;
        this.hrs = this.timestamp / 3600 % 3600;
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
        return String.format("%d:%d:%d", this.hrs, this.minutes, this.secs);
    }
}
