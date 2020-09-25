package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(1, 2), new Point(2, 3));
        System.out.println(l1.isCollinearLine(new Point(3, 4)));
    }
}
