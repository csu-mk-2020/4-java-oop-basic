package com.example.task01;
import java.util.Objects;
import org.omg.PortableServer.POAPackage.ObjectNotActive;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int tmp = -this.x;
        this.x = -this.y;
        this.y = tmp;
    }

    double distance(Point point)  {
        if (point == null) {
            throw new IllegalArgumentException("point не может быть null");
        }
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

}
