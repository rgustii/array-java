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
public class tabung extends B1{
    double jariJari, tinggi;

    public tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    double Hvol() {
        return Math.PI * Math.pow(this.jariJari, 2) * this.tinggi;
    }

    }

