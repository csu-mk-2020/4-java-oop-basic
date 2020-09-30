package com.example.task02;

import java.util.Objects;

public class TimeSpan {
    private int _seconds;
    private int _minutes;
    private int _hours;

    private void normalize() throws IllegalStateException {
        if (_seconds < 0) {
            _minutes--;
            _seconds += 60;
        }
        if (_minutes < 0) {
            _hours--;
            _minutes += 60;
        }
        if (_hours < 0) {
            throw new IllegalStateException();
        }
        _minutes += _seconds / 60;
        _seconds %= 60;
        _hours += _minutes / 60;
        _minutes %= 60;
    }

    public TimeSpan() {
        this(0,0,0);
    }

    public TimeSpan(int seconds, int minutes, int hours) {
        setSeconds(seconds);
        setMinutes(minutes);
        setHours(hours);
    }

    public int getSeconds() {
        return _seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 60) {
            throw new IllegalArgumentException();
        }
        this._seconds = seconds;
    }

    public int getMinutes() {
        return _minutes;
    }

    public void setMinutes(int minutes) throws IllegalArgumentException {
        if (minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException();
        }
        this._minutes = minutes;
    }

    public int getHours() {
        return _hours;
    }

    public void setHours(int hours) throws IllegalArgumentException {
        if (hours < 0) {
            throw new IllegalArgumentException();
        }
        this._hours = hours;
    }

    public void add(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time);
        _seconds += time._seconds;
        _minutes += time._minutes;
        _hours += time._hours;
        normalize();
    }

    public void subtract(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time);
        _seconds -= time._seconds;
        _minutes -= time._minutes;
        _hours -= time._hours;
        normalize();
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", _hours, _minutes, _seconds);
    }
}
