package com.example.task01;

import java.util.Objects;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int tmp = this.x;
        this.x = this.y * -1;
        this.y = tmp * -1;
    }

    public double distance(Point point) throws NullPointerException {
        Objects.requireNonNull(point);
        double dx = Math.abs(this.x - point.x);
        double dy = Math.abs(this.y - point.y);

        return Math.hypot(dx, dy);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
