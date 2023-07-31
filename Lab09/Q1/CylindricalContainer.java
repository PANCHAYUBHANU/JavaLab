/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author asus
 */
public class CylindricalContainer extends Container{
     public CylindricalContainer(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}
