package com.example.task04;

public class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    public String toString(){
        return String.format("(%d, %d)", this.x, this.y);
    }
}
