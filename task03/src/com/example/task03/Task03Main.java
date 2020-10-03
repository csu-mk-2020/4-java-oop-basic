package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(7, -5);
        Complex c2 = new Complex(0, 123);
        System.out.println(c1.sum(c2).toString());
        System.out.println(c1.mult(c2).toString());
    }
}
