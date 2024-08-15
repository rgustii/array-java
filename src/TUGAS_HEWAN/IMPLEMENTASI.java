/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_HEWAN;

/**
 *
 * @author rafig
 */
public class IMPLEMENTASI {
    public static void main(String[] args) {
        
        // HEWAN DARAH PANAS
        DP dp = new DP();
        
        // MAMALLIA
        mamalia mamalia = new mamalia();
        m1 beruang = new m1();
        m2 harimau = new m2();
        m3 paus = new m3();
        
        // BURUNG
        burung burung = new burung();
        b1 unta = new b1();
        b2 merak = new b2();
        b3 rajawali = new b3();
        
        // HEWAN DARAH DINGIN
        DD dd = new DD();
        
        // IKAN
        ikan ikan = new ikan();
        i1 salmon = new i1();
        i2 mas = new i2();
        i3 guppy = new i3();
        
        // REPTIL
        reptil reptil = new reptil();
        r1 penyu = new r1();
        r2 buaya = new r2();
        r3 ular = new r3();
        
        // AMFIBI
        amfibi amfibi = new amfibi();
        a1 katak = new a1();
        a2 kodok = new a2();
        a3 kadal = new a3();
        
        // MANGGIL METHOD JENIS PADA SETIAP OBJEK
        
        System.out.println("= = = = KLASIFIKASI HEWAN VERTEBRATA = = = =");
        
        // DP
        dp.jenis();
        
        // mamalia
        mamalia.jenis();
        beruang.jenis();
        harimau.jenis();
        paus.jenis();
        
        // burung
        burung.jenis();
        unta.jenis();
        merak.jenis();
        rajawali.jenis();
        
        // DD
        dd.jenis();
        
        // ikan
        ikan.jenis();
        salmon.jenis();
        mas.jenis();
        guppy.jenis();
        
        // reptil
        reptil.jenis();
        penyu.jenis();
        buaya.jenis();
        ular.jenis();
        
        // amfibi
        amfibi.jenis();
        katak.jenis();
        kodok.jenis();
        kadal.jenis();
    }
}
