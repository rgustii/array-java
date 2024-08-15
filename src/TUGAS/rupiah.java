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
public class rupiah {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang dalam rupiah: ");
        int jumlah_uang = input.nextInt();

        int ratusanribu = jumlah_uang / 100000;
        int sisa = jumlah_uang - ratusanribu * 100000;

        int limaplhribu = sisa / 50000;
        sisa = sisa - limaplhribu * 50000;

        int duapuluhribu = sisa / 20000;
        sisa = sisa - duapuluhribu * 20000;

        int sepuluhribu = sisa / 10000;
        sisa = sisa - sepuluhribu * 10000;

        int limaribu = sisa / 5000;
        sisa = sisa - limaribu * 5000;

        int duaribu = sisa / 2000;

        if (ratusanribu > 0) {
            System.out.println(ratusanribu + " Lembar 100000");
        }
        if (limaplhribu > 0) {
            System.out.println(limaplhribu + " Lembar 50000");
        }
        if (duapuluhribu > 0) {
            System.out.println(duapuluhribu + " Lembar 20000");
        }
        if (sepuluhribu > 0) {
            System.out.println(sepuluhribu + " Lembar 10000");
        }
        if (limaribu > 0) {
            System.out.println(limaribu + " Lembar 5000");
        }
        if (duaribu > 0) {
            System.out.println(duaribu + " Lembar 2000");
        }
    }
}
