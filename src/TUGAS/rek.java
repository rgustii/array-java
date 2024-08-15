/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

import java.util.Scanner;

/**
 *
 * @author rafig
 */
public class rek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("  << CEK HASIL TES >>");

        System.out.print("Masukkan nilai tes Akademik: ");
        double nilaiAkademik = input.nextDouble();
        System.out.print("Masukkan nilai tes Ketrampilan: ");
        double nilaiKetrampilan = input.nextDouble();
        System.out.print("Masukkan nilai tes Psikologi: ");
        double nilaiPsikologi = input.nextDouble();
        System.out.println("- - - - - - - - - - - - - - - -");

        double rataRata = (nilaiAkademik + nilaiKetrampilan + nilaiPsikologi) / 3;
        System.out.println("nilai rata-rata : " + rataRata);

        if (rataRata >= 75) {
            System.out.println("Selamat Anda Diterima");
        } else {
            System.out.println("Maaf Anda Tidak diterima");
        }
    }
}
    


