/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYLIST;

import java.util.ArrayList;

/**
 *
 * @author rafig
 */
public class latihan1 {
    public static void main(String[] args) {
        ArrayList<Integer> memori = new ArrayList<Integer>();
        System.out.println(" ukuran seblum ArrayList : " + memori.size());
        System.out.println("====================");
        System.out.println("mengisi ArrayList");
        System.out.println("====================");
        for (int i = 0; i < 10; i++) {
            memori.add(i);
        }
        System.out.println("====================");
        System.out.println("menampilkan ArrayList");
        System.out.println("====================");
        for (int nilai : memori){
            System.out.println(" nilai arraylist -" + nilai + ": " + memori.get(nilai));
        }
    
    }    
    
}
