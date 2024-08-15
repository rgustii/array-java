/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALAT_MUSIK;

/**
 *
 * @author rafig
 */
public class IMP {
    public static void main(String[] args) {
        // contoh penggunaan polimorfisme
        AM[] alatMusik = new AM[6];
        alatMusik[0] = new bass();
        alatMusik[1] = new biola();
        alatMusik[2] = new gitar();
        alatMusik[3] = new kecapi();
        alatMusik[4] = new piano();
        alatMusik[5] = new saxophone();

        for (int i = 0; i < alatMusik.length; i++) {
            alatMusik[i].mainkan();
        }
    }
}
