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
public class limas extends B1{
     double luasAlas, tinggi;

    public limas(double luasAlas, double tinggi) {
        this.luasAlas = luasAlas;
        this.tinggi = tinggi;
    }

    double Hvol() {
        return (1.0/3.0) * this.luasAlas * this.tinggi;
    }
}

