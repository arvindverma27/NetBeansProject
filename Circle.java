/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractlalitidlysanchamakerr;

/**
 *
 * @author arvind verma
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public double getCircleArea(){
        return 3.14*radius*radius;
    }
    public double getCircleCircumference(){
        return 2*3.14*radius;
    }
}
