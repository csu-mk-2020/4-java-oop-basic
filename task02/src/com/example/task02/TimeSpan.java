package com.example.task02;

import java.util.Objects;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public TimeSpan(int hours, int minutes, int seconds) {
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
        if (hours < 0) {
            throw new IllegalArgumentException("Hours must be positive");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Minutes must be between 0 and 59");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("Seconds must be between 0 and 59");
        }
        this.seconds = seconds;
    }

    private void update() throws Exception {
        long total = this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
        if (total < 0) {
            throw new Exception("TimeSpan less than 0");
        }
        this.seconds = (int)(total % 60);
        this.minutes = (int)((total / 60) % 60);
        this.hours = (int)((total / 60) / 60);
    }

    private boolean check(int hours, int minutes, int seconds) {
        long total = hours * 60 * 60 + minutes * 60 + seconds;
        return total >= 0;
    }

    public void add(TimeSpan time) throws Exception {
        Objects.requireNonNull(time);
        // if (this.check(this.hours+time.hours, this.minutes+time.minutes, this.seconds+time.seconds)){
        // Проверка лишняя, т.к. при добавлении невозможно получить отрицательное значение,
        // поскольку невозможно создать объект с отрицательными значениями hours/minutes/seconds.
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
        this.update();
    }

    public void subtract(TimeSpan time) throws Exception {
        Objects.requireNonNull(time);
        if (this.check(this.hours+time.hours, this.minutes+time.minutes, this.seconds+time.seconds)) {
            this.hours -= time.hours;
            this.minutes -= time.minutes;
            this.seconds -= time.seconds;
            this.update();
        }
        else {
            throw new IllegalStateException("Right-hand side value must be greater than object");
        }
    }

    public String toString() {
        return String.format(
                "Hours: %d, Minutes: %d, Seconds: %d",
                this.hours, this.minutes, this.seconds
        );
    }
}
