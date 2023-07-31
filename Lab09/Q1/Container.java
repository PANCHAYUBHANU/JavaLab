/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author asus
 */
public abstract class Container {
    
    private double height;
    double radius;

    public Container(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public abstract double getVolume();
    
}
