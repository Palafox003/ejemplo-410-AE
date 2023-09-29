/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ventas;

/**
 *
 * @author Admin
 */
public class Ventas {

    public static void main(String[] args) {
            Venta v=new Venta();
                v.poblar();
                v.imprimirTabla();
               System.out.println("Promedio total: "+ v.promedio());
               float[] promedios=v.promedioAnual();
               
               for (int i = 0; i < promedios.length; i++) {
                   System.out.println("Año "+i+"="+promedios[i]);
                }
        
    }
}
