package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(23, 59, 59);
        TimeSpan time2 = new TimeSpan(23, 59, 59);
        time1.add(time2);
        System.out.println(time1.toString());
    }
}
