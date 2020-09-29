package com.example.task03;

/**
 * Класс комплексных чисел
 * */
public class Complex {
    private double re;
    private double im;

    Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe(){
        return re;
    }
    public double getIm(){
        return im;
    }

    public static Complex sum(Complex dst, Complex src){
        if (dst == null || src == null) {
            throw new IllegalArgumentException("аргумент пуст");
        }
        return new Complex(src.getRe()+dst.getRe(),src.getIm()+dst.getIm());
    }

    public static Complex multiply(Complex dst, Complex src){
        if (dst == null || src == null){
            throw new IllegalArgumentException("аргумент пуст");
        }
        return new Complex(dst.getRe() * src.getRe() - dst.getIm() * src.getIm(), dst.getRe() * src.getIm() + dst.getIm() * src.getRe());
    }

    public String toString(){
        return String.format("%.2f+%.2fi", re, im);
    }
}
