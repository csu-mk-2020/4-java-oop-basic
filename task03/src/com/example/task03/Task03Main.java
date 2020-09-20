package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(2d, -5d);
        Complex c2 = new Complex(-3d, 4d);
        System.out.println(c1.add(c2).toString());
        System.out.println(c1.mult(c2).toString());
    }
}
