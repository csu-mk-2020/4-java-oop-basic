package com.example.task04;

public class Line {
    final private Point p1;
    final private Point p2;

    public Line(Point p1, Point p2) {
        if (p1 == null){
            throw new IllegalArgumentException("первый аргумент пуст");
        }
        if (p2 == null){
            throw new IllegalArgumentException("второй аргумент пуст");
        }
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public boolean isCollinearLine(Point p) {
        if (p != null) {
            return (p.x * (p2.y - p1.y) - p.y * (p2.x - p1.x) == p1.x * p2.y - p2.x * p1.y);
        } else throw new IllegalArgumentException("аргумент пуст");
    }

    public String toString() {
        return p1.toString() + "->" + p2.toString();
    }
}