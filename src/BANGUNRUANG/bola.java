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
public class bola extends B1{
     double jariJari;

    bola(double jariJari) {
        this.jariJari = jariJari;
    }

    double Hvol() {
        return (4.0/3.0) * Math.PI * Math.pow(this.jariJari, 3);
    }
}


