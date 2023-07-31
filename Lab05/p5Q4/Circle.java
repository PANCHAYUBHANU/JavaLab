package com.mycompany.p5q4;
import java.lang.Math;

public class Circle extends Shape {

    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}