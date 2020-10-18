package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point(30, 66);
        Point p2 = new Point(21, 9);

        double dis = p1.distance(p2);

        System.out.println("Point 1:");
        p1.print();
        p1.flip();
        System.out.println("Reverse point 1:");
        System.out.println(p1);
        System.out.println("Point 2:");
        p2.print();
        p2.flip();
        System.out.println("Reverse point 2:");
        System.out.println(p2);
        System.out.println("Point1 - Point2 distance:");
        System.out.println(dis);

    }
}
