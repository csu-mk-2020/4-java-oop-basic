package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(1, 30, 3);
        TimeSpan timeSpan = new TimeSpan(1, 30, 3);
        time.add(timeSpan);
        System.out.println(time.toString());
    }
}
