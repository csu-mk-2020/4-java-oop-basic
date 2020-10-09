package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(10, 10, 10);
        t1.subtract(new TimeSpan(9,9,11));
        System.out.println(t1.toString());
    }
}
