/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractlalitidlysanchamakerr;

/**
 *
 * @author arvind verma
 */
public class Hemisphere {
    private double radius;

    public Hemisphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
     public double getHemiSphereVolume(){
        return (2 * 3.14 * radius * radius * radius ) / 3;
    }
}
