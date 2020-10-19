package com.example.task01;
/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(){
    }

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip() {
        int tmp = -x;
        x = -y;
        y = tmp;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}