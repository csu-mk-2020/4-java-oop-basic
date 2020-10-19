package com.example.task02;
import java.util.Objects;
public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours   = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) throws IllegalStateException {
        if(hours < 0 || hours > 60){
            throw new IllegalStateException("Exception: invalid hours value");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) throws IllegalStateException {
        if(minutes < 0 || minutes > 60){
            throw new IllegalStateException("Exception: invalid minutes value");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws IllegalStateException {
        if(seconds < 0 || seconds > 60){
            throw new IllegalStateException("Exception: invalid seconds value");
        }
        this.seconds = seconds;
    }

    /**
     * Нормализация
     */
    private void normalizeTime() throws IllegalStateException{
        if(seconds < 0){
            --minutes;
            seconds += 60;
        }
        if(minutes < 0){
            --hours;
            minutes += 60;
        }
        if(hours < 0){
            throw new IllegalStateException("Exception: Hours < 0");
        }
        minutes += seconds / 60;
        hours += minutes / 60;
        seconds %= 60;
        minutes %= 60;
    }

    /**
     * Прибавляет к текущему интервалу значение переданного интервала
     * @param time - складываемое значение
     * @throws NullPointerException
     */
    public void add(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time, "Except: object is null");
        this.seconds -= time.seconds;
        this.minutes -= time.minutes;
        this.hours   -= time.hours;

        normalizeTime();
    }

    public void subtract(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time, "Except: object is null");
        try{
            this.seconds -= time.seconds;
            this.minutes -= time.minutes;
            this.hours   -= time.hours;

            normalizeTime();
        }
        catch (IllegalStateException ecxeption){
            throw new IllegalStateException("Can't subtract because lhs < rhs");
        }
    }

    /**
     *
     * @return время в строковом формате
     */
    public String toString() {
        return String.format("Time : %d:%d:%d", hours, minutes, seconds);
    }
}
