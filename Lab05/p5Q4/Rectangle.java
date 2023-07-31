package com.mycompany.p5q4;
import java.lang.Math;

public class Rectangle extends Shape {

    public Rectangle(String name, double length, double width) {
        super(name, length, width);
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}