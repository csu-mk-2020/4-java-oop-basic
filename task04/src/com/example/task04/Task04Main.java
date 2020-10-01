package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line l = new Line(new Point(0,0), new Point(10, 0));
        System.out.println(l);
        System.out.println(l.isCollinearLine(new Point(5, 0)));
    }
}
