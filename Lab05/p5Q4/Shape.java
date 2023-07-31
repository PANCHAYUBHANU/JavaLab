package com.mycompany.p5q4;
import java.lang.Math;

abstract class Shape {
    private String name;
    private double length;
    private double width;

    public Shape(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    abstract double calculateArea();

    public void display() {
        System.out.println("The area of " + name + " is " + calculateArea());
    }
}
