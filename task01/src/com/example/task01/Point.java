package com.example.task01;

import java.util.Objects;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    /**
     * @param x координата x
     * @param y координата y
     */
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Разворот точки на 180 (на самом деле нет)
     */
    public void flip() {
        int temp = -this.x;
        this.x = -this.y;
        this.y = temp;
    }

    /**
     * @param point точка, до которой считается расстояние от текущей
     * @return расстояние между точками
     * @throws NullPointerException если point == null
     */
    public double distance(Point point) throws NullPointerException {
        Objects.requireNonNull(point);
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    public void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
