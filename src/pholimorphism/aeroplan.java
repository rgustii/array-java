/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pholimorphism;

/**
 *
 * @author rafig
 */
public class aeroplan extends vehicle{
    
    public void walk (){
        System.out.println(" aeroplan flying ");
    }
    public static void main(String[] args) {
       // TODO code application logic here
       aeroplan garuda = new aeroplan();
       garuda.function();
       garuda.fuel();
       garuda.walk();
    }
}
