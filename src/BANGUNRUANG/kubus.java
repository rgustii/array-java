/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BANGUNRUANG;

/**
 *
 * @author rafig
 */
public class kubus  extends B1{
    double sisi;
    
    public kubus(double sisi){
        this.sisi=sisi;
    }
    
    public double Hvol(){
        return Math.pow(sisi, 3);
    }
}
