package com.example.task01;

import java.util.Objects;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public void flip() {
        int tmp = -this.x;
        this.x = -this.y;
        this.y = tmp;
    }

    public double distance(Point point) throws NullPointerException {
        Objects.requireNonNull(point, "Point must not be null");
        return Math.sqrt((Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2)));
    }

    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
