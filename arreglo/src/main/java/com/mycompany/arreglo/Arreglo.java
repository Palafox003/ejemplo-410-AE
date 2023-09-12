/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arreglo;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Arreglo {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Clima clima=new Clima();
        
        for (int i = 0; i < 7; i++) {
            Temperatura t=new Temperatura();
            System.out.println("Ingresa la temperatura máxima del día: " + i);
            t.setMaxima(leer.nextFloat());
            System.out.println("Ingresa la temperatura mínima del día " + i);
            t.setMinima(leer.nextFloat());
            clima.agregarTemperatura(i, t);
        }
        System.out.println("Promedio temperaturas Máximas: "+ clima.verPromedioMaxima());
        System.out.println("Promedio temperaturas  Mínimas: "+clima.verPromedioMinima());
    }
}
