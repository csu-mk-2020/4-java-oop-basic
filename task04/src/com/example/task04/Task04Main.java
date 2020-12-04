package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line ln = new Line(new Point(2,2),new Point(-2,-2));
        System.out.println(Boolean.toString(ln.isCollinearLine(new Point(0,0))));
        System.out.println(ln.toString());

    }
}
