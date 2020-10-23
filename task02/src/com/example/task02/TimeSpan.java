package com.example.task02;
import java.util.Objects;
public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) throws IllegalStateException {
        if((hours < 0 || hours > 60) || (minutes < 0 || minutes > 60) || (seconds < 0 || seconds > 60)) {
            throw new IllegalStateException("Exception: invalid hours value");
        }
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
        if(this.seconds < 0){
            --this.minutes;
            this.seconds += 60;
        }
        if(this.minutes < 0){
            --this.hours;
            this.minutes += 60;
        }
        if(this.hours < 0){
            throw new IllegalStateException("Exception: Hours < 0");
        }
        this.minutes += this.seconds / 60;
        this.hours += this.minutes / 60;
        this.seconds %= 60;
        this.minutes %= 60;
    }

    /**
     * Прибавляет к текущему интервалу значение переданного интервала
     * @param time - складываемое значение
     * @throws NullPointerException
     */
    public void add(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time, "Except: object is null");
        this.seconds += time.seconds;
        this.minutes += time.minutes;
        this.hours   += time.hours;

        normalizeTime();
    }

    public void subtract(TimeSpan time) throws NullPointerException {
        Objects.requireNonNull(time, "Except: object is null");
        TimeSpan tmpTime = new TimeSpan(this.hours, this.minutes, this.seconds);
        try{
            tmpTime.seconds -= time.seconds;
            tmpTime.minutes -= time.minutes;
            tmpTime.hours   -= time.hours;

            tmpTime.normalizeTime();
        }
        catch (IllegalStateException ecxeption){
            throw new IllegalStateException("Can't subtract because lhs < rhs");
        }
        this.setHours(tmpTime.hours);
        this.setMinutes(tmpTime.minutes);
        this.setSeconds(tmpTime.seconds);
    }

    /**
     *
     * @return время в строковом формате
     */
    public String toString() {
        return String.format("Time : %d:%d:%d", hours, minutes, seconds);
    }
}
