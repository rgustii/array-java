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
public class balok extends B1{
    double panjang, lebar, tinggi;
    
    public balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        
    }
    
    public double Hvol(){
        return this.panjang * this.lebar * this.tinggi;
    }
}
