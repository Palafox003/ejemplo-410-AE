/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculos;

/**
 *
 * @author Admin
 */
public class Calculos {

    public static void main(String[] args) {
        Calcular c1=new Calcular();
            System.out.println(c1.elMayor(5, 10));
            System.out.println(c1.elMenor(2, 3, 1));
            System.out.println("Números pares= "+c1.cantidadPares(10));
            System.out.println("Sumatoria= "+c1.sumatoria(10));
            System.out.println("suma= "+c1.suma(10));
            System.out.println("Impares= "+c1.impares(1, 10));
    }
}
