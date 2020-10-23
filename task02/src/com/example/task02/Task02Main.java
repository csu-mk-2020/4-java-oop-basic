package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(0, 30, 0);
        TimeSpan t2 = new TimeSpan(0, 40, 0);

        t1.subtract(t2);
    }
}
