package com.example.task03;

import java.util.Objects;

public class ComplexNumbers {
    private double real;
    private double image;

    public ComplexNumbers(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public ComplexNumbers add(ComplexNumbers number) throws NullPointerException {
        Objects.requireNonNull(number);
        return new ComplexNumbers(this.real + number.real, this.image + number.image);
    }

    public ComplexNumbers mult(ComplexNumbers number) throws NullPointerException {
        Objects.requireNonNull(number);
        return new ComplexNumbers(this.real * number.real - this.image * number.image, this.image * number.real + this.real * number.image);
    }

    public String toString() {
        if(image >= 0)
            return String.format("%f+%fi", this.real, this.image);
        else
            return String.format("%f%fi", this.real, this.image);
    }
}
