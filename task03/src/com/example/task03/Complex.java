package com.example.task03;

public class Complex {

    double re;
    double im;

    Complex(double re, double im){
        this.re = re;
        this.im = im;
    }

    Complex add(Complex rhs){
        return new Complex(this.re + rhs.re, this.im + rhs.im);
    }

    Complex sub(Complex rhs){
        return new Complex(this.re - rhs.re, this.im - rhs.im);
    }

    Complex mult(Complex rhs){
        return new Complex(
                this.re*rhs.re - this.im*rhs.im,
                this.im*rhs.re + this.re*rhs.im);
    }

    public String toString(){
        return String.format("%g %+gi", this.re, this.im);
    }
}
