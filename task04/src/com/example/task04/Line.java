package com.example.task04;

import java.util.Objects;

public class Line {
    private Point p1, p2;

    public Line(Point p1, Point p2){
        this.p1 = Objects.requireNonNull(p1);
        this.p2 = Objects.requireNonNull(p2);
    }

    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public String toString() {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
    }

    public boolean isCollinearLine(Point p){
        Objects.requireNonNull(p);
        return ((p.x * (p2.y - p1.y) - p.y * (p2.x - p1.x)) == (p1.x * p2.y - p2.x * p1.y));
    }
}
