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
public class prisma extends B1{
    double luasAlas, tinggi;

    prisma(double luasAlas, double tinggi) {
        this.luasAlas = luasAlas;
        this.tinggi = tinggi;
    }

    double Hvol() {
        return this.luasAlas * this.tinggi;
    }
}

