/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vehiculo;

/**
 *
 * @author Admin
 */
public class Vehiculo {

    public static void main(String[] args) {
        Auto auto1=new Auto();
            System.out.println( auto1.conocerMarcha());
            auto1.subirCambio();
            System.out.println( auto1.conocerMarcha());
            System.out.println("velocidad: "+auto1.getVelocidad() +" km/h");
            auto1.acelerar();
            System.out.println("velocidad: "+auto1.getVelocidad() +" km/h");
    }
}
