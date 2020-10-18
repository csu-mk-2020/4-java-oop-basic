package com.example.task02;

import java.util.Objects;

/**
 * Временной интервал
 */
public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    /**
     * @param hours часы >= 0
     * @param minutes минуты в диапазоне 0-59
     * @param seconds секунды в диапазоне 0-59
     * @throws IllegalArgumentException если часы < 0 или секунды или минуты не лежат в диапазоне 0-59
     */
    public TimeSpan(int hours, int minutes, int seconds) throws IllegalArgumentException {
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

    /**
     * @param hours часы >= 0
     * @throws IllegalArgumentException если часы < 0
     */
    public void setHours(int hours) throws IllegalArgumentException {
        if (hours < 0) {
            throw new IllegalArgumentException("Часы должны быть неотрицательными");
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    /**
     * @param minutes в диапазоне 0-59
     * @throws IllegalArgumentException если минуты не лежат в диапазоне 0-59
     */
    public void setMinutes(int minutes) {
        if (minutes >= 60 || minutes < 0) {
            throw new IllegalArgumentException("Минуты должны быть в диапазоне 0-59");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    /**
     * @param seconds в диапазоне 0-59
     * @throws IllegalArgumentException если минуты не лежат в диапазоне 0-59
     */
    public void setSeconds(int seconds) {
        if (seconds >= 60 || seconds < 0) {
            throw new IllegalArgumentException("Секунды должны быть в диапазоне 0-59");
        }
        this.seconds = seconds;
    }


    /**
     * @param time временной интервал
     * @throws NullPointerException если time == null
     */
    public void add(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time);
        normalize(this.denormalize() + time.denormalize());
    }

    /**
     * @param time временной интервал
     * @throws NullPointerException если time == null
     * @throws IllegalStateException если временной интервал получается отрицательным
     */
    public void subtract(TimeSpan time) throws NullPointerException, IllegalStateException {
        Objects.requireNonNull(time);
        int result = this.denormalize() - time.denormalize();
        if (result < 0){
            throw new IllegalStateException("Получившийся временной интервал не может быть отрицательным");
        }
        normalize(result);
    }

    public String toString() {
        return String.format("%d:%d:%d", this.hours, this.minutes, this.seconds);
    }

}
