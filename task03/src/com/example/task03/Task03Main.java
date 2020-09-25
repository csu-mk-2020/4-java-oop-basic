package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(1, 1);
        Complex c = b.sum(a);
        Complex d = a.mul(b);
        Complex f = new Complex(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
