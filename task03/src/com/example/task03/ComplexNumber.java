package com.example.task03;

import java.util.Objects;

public class ComplexNumber {
    private double real;
    private double image;

    public ComplexNumber() {
        this.real = 0;
        this.image = 0;
    }

    public ComplexNumber(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    public void setReal(double real){
        this.real = real;
    }

    public void setImage(double image){
        this.image = image;
    }

    public ComplexNumber add(ComplexNumber rhs) throws NullPointerException {
        Objects.requireNonNull(rhs);
        return new ComplexNumber(
                this.real + rhs.real,
                this.image + rhs.image
        );
    }

    public ComplexNumber mult(ComplexNumber rhs) throws NullPointerException {
        Objects.requireNonNull(rhs);
        return new ComplexNumber(
                this.real * rhs.real - this.image * rhs.image,
                this.image * rhs.real + this.real * rhs.image
        );
    }
    
    public String toString() {
        return String.format("%f+%fi", this.real, this.image);
    }
}
