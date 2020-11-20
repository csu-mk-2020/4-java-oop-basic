package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(4, 4));
        Point point = new Point(2, 2);
        System.out.println(line.isCollinearLine(point));
        System.out.println(line.getP1());
        System.out.println(line.getP2());
        System.out.println(line.toString());
    }
}
