package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    Line(Point p1, Point p2) {
        if (p1 != null && p2 != null) {
            this.p1 = p1;
            this.p2 = p2;
        } else throw new IllegalArgumentException("аргумент пуст");
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
