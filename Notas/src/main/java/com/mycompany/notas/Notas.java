/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.notas;

/**
 *
 * @author Admin
 */
public class Notas {

    public static void main(String[] args) {
        Acta acta=new Acta(3,4);
            acta.poblar();            
        for (int i = 0; i < acta.getNotas().length; i++) {
            for (int j = 0; j < acta.getNotas()[0].length; j++) {
                System.out.println(acta.getNotas()[i][j] + "-");
            }
            System.out.println("Promedio= "+acta.promedioAlumno(i));
            System.out.println("");
        }
        System.out.println("Promedio Total= "+acta.promedioTotal());
    }
}
