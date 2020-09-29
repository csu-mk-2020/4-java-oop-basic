package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip() {
        int tmp = -this.x;
        this.x = -this.y;
        this.y = tmp;
    }

    double distance(Point point) {
        return Math.sqrt((Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2)));
    }

    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
