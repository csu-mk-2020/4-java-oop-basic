package com.example.task02;

import java.sql.Time;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    TimeSpan(int hours, int minutes, int seconds) {
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
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private void update() {
        if (this.seconds >= 60){
            this.seconds -= 60;
            ++this.minutes;
        }
        if (this.minutes >= 60) {
            this.minutes -= 60;
            ++this.hours;
        }
    }

    void add(TimeSpan time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
        this.update();
    }

    void subtract(TimeSpan time) {
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
