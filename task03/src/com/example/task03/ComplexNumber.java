package com.example.task03;

public class ComplexNumber {
    double re;
    double im;

    ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    ComplexNumber add(ComplexNumber rhs) {
        if (rhs == null) {
            throw new NullPointerException("");
        }
        return new ComplexNumber(this.re + rhs.re, this.im + rhs.im);
    }

    ComplexNumber sub(ComplexNumber rhs) {
        if (rhs == null) {
            throw new NullPointerException("");
        }
        return new ComplexNumber(this.re - rhs.re, this.im - rhs.im);
    }

    ComplexNumber mult(ComplexNumber rhs) {
        if (rhs == null) {
            throw new NullPointerException("");
        }
        return new ComplexNumber(this.re * rhs.re - this.im * rhs.im, this.im * rhs.re + this.re * rhs.im);
    }

    public String toString() {
        return String.format("%g %+gi", this.re, this.im);
    }
}
