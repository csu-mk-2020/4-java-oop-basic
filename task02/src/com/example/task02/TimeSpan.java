package com.example.task02;

import java.util.Objects;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan(int hours, int minutes, int seconds) {
        if (seconds >= 60 || seconds < 0) {
            throw new IllegalArgumentException("Секунды должны быть в диапазоне 0-59");
        }
        if (minutes >= 60 || minutes < 0) {
            throw new IllegalArgumentException("Минуты должны быть в диапазоне 0-59");
        }
        if (hours < 0) {
            throw new IllegalArgumentException("Часы должны быть неотрицательными");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private void normalize(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Секунды должны быть неотрицательными");
        }
        this.seconds = seconds % 60;
        this.minutes = seconds / 60 % 60;
        this.hours = seconds / (60 * 60);
    }

    private int denormalize() {
        return this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Часы должны быть неотрицательными");
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 60 || minutes < 0) {
            throw new IllegalArgumentException("Минуты должны быть в диапазоне 0-59");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 60 || seconds < 0) {
            throw new IllegalArgumentException("Секунды должны быть в диапазоне 0-59");
        }
        this.seconds = seconds;
    }

    void add(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time);
        normalize(this.denormalize() + time.denormalize());
    }

    void subtract(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time);
        normalize(this.denormalize() - time.denormalize());
    }

    public String toString() {
        return String.format("%d:%d:%d", this.hours, this.minutes, this.seconds);
    }

}
