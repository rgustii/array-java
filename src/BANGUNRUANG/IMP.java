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
public class IMP {
    public static void main(String[] args) {
        
        kubus k = new kubus(4);
        System.out.println(" volume kubus : " + k.Hvol());
        
        balok b = new balok(2,3,4);
        System.out.println(" volume balok : " + b.Hvol());
        
        tabung t = new tabung(4,6);
        System.out.println(" volume tabung : " + t.Hvol());
        
        kerucut ke = new kerucut(5,6);
        System.out.println(" volume kerucut : " + k.Hvol());
        
        limas l = new limas(6,7);
        System.out.println(" volume limas : " + l.Hvol());
        
        prisma p = new prisma(4,9);
        System.out.println(" volume prima : " + p.Hvol());
        
        bola ba = new bola(4);
        System.out.println(" volume balok : " + ba.Hvol());
    }
}
