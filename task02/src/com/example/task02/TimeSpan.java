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
        _minutes += _seconds / 60;
        _seconds %= 60;
        _hours += _minutes / 60;
        _minutes %= 60;
    }

    private void checkSubtract(TimeSpan time) throws IllegalStateException {
        try {
            TimeSpan tmp = new TimeSpan(
                    _hours - time._hours,
                    _minutes - time._minutes,
                    _seconds - time._seconds);
        }
        catch(IllegalArgumentException ex) {
            throw new IllegalStateException();
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
        return _seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 60) {
            throw new IllegalArgumentException();
        }
        _seconds = seconds;
        normalize();
    }

    public int getMinutes() {
        return _minutes;
    }

    public void setMinutes(int minutes) throws IllegalArgumentException {
        if (minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException();
        }
        _minutes = minutes;
        normalize();
    }

    public int getHours() {
        return _hours;
    }

    public void setHours(int hours) throws IllegalArgumentException {
        if (hours < 0) {
            throw new IllegalArgumentException();
        }
        _hours = hours;
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
        checkSubtract(time);
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
