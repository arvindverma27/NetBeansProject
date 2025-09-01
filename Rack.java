/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractlalitidlysanchamakerr;

/**
 *
 * @author arvind verma
 */
public class Rack extends Cylinder {
    
    public Rack(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double getHeight() {
        return super.getHeight(); 
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    } 

    @Override
    public double getCylinderSArea() {
        return super.getCylinderSArea(); 
    }

    @Override
    public double getCylinderVolume() {
        return super.getCylinderVolume(); 
    }
    
}
