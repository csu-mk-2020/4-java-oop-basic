package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

    public double distance(Point point) {
        if (point != null) {
            return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
        } else throw new IllegalArgumentException("аргумент пуст");
    }

    void flip() {
        x = -x - y - (y = -x);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
