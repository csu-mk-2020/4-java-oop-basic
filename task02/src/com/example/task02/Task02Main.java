package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(10, 10, 10);
        TimeSpan time2 = new TimeSpan(0, 52, 55);
        time.add(time2);
        time.subtract(time2);
        System.out.println(time.toString());

    }
}
