package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex src = new Complex(1,2);
        Complex dst = new Complex(3,4);

        System.out.println(Complex.sum(src,dst));
        System.out.println(Complex.multiply(src,dst));
    }
}
