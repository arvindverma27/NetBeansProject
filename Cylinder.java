  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractlalitidlysanchamakerr;

/**
 *
 * @author arvind verma
 */
public class Cylinder {
    private  double  height;
    private double radius;
    
public  Cylinder(double height, double radius){
        this.height =  height;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    } 
 
    public  double getCylinderVolume(){
         return 3.14*radius*radius*height;
    }
    public double getCylinderSArea(){
        return 2*3.14*radius*height+2*3.14*radius*radius;
    }
    
    
}
