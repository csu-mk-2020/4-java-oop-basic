package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(2, 2));
        Point point = new Point(1, 1);
        String message = "on a line containing a segment ";
        if (line.isCollinearLine(point)){
            message = " lies " + message;
        }
        else {
            message = " does not lie " + message;
        }
        System.out.println(point.toString()+message+line.toString());
    }
}
