package com.example.task04;
import java.util.Objects;

public class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
}
