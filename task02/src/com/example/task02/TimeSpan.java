package com.example.task02;

import java.util.Objects;

public class TimeSpan {
    private int hour;
    private int min;
    private int sec;

    public TimeSpan(int hour, int min, int sec){
        if(sec < 0 || sec >= 60 || min < 0 || min >= 60 || hour < 0)
            throw new IllegalArgumentException("Некорректные аргументы");
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour(){
        return hour;
    }

    public int getMin(){
        return min;
    }

    public int getSec(){
        return sec;
    }

    public void setHour(int hour){
        if (hour < 0) {
            throw new IllegalArgumentException("hour не может быть отрицательным");
        }
        this.hour = hour;
    }

    public void setMin(int min){
        if (min < 0 || min >= 60) {
            throw new IllegalArgumentException("min должен быть из [0,59]");
        }
        this.min = min;
    }

    public void setSec(int sec){
        if (sec < 0 || sec >= 60) {
            throw new IllegalArgumentException("sec должен быть из [0,59]");
        }
        this.sec = sec;
    }

    private long totalTime(){
        long tmp = this.hour * 360 + this.min * 60 + this.sec;
        return tmp;
    }

    private void updateTime() throws Exception{
        long total = totalTime();
        if(total < 0) throw new Exception("Текущее время отрицательно");

        this.hour = (int)(total / 360);
        this.min = (int)((total / 60) % 60);
        this.sec = (int)(total % 60);
    }

    public void add(TimeSpan time) throws Exception{
        Objects.requireNonNull(time);
        this.hour += time.hour;
        this.min += time.min;
        this.sec += time.sec;
        this.updateTime();
    }

    public void subtract(TimeSpan time) throws Exception {
        Objects.requireNonNull(time);
        if(totalTime() - (time.hour * 360 + time.min * 60 + time.sec) < 0)
            throw new IllegalArgumentException("Переданный интервал времени длиннее, чем текущий");
        this.hour -= time.hour;
        this.min -= time.min;
        this.sec -= time.sec;
        this.updateTime();
    }

    public String toString() {
        return String.format("Hours: %d, Minutes: %d, Seconds: %d", this.hour, this.min, this.sec);
    }

}
