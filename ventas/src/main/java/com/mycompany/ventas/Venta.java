/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventas;
import java.util.Random;
/**
 *
 * @author Admin
 */
public class Venta {
    private int[][] ventas;
    Random rnd=new Random();
    
    public Venta(){
        ventas=new int[12][4];
    }
    
    public void poblar(){
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j]=rnd.nextInt(100);
            }
        }
    }
    
    public float promedio(){
        float total=0;
        for (int i = 0; i < 4; i++) {
            float promedio=0;
            for (int j = 0; j < 12; j++) {
                promedio+=this.ventas[j][i];
            }
            total+=promedio/12;
        }
        return total/4;
    }
    
    public float[] promedioAnual(){
        float[] promedios=new float[4];
        for (int i = 0; i < 4; i++) {
            float promedio=0;
            for (int j = 0; j < 12; j++) {
                promedio+=this.ventas[j][i];
            }
            promedios[i]=promedio/12;
        }
        return promedios;
    }
    
    public void imprimirTabla(){
        for (int i = 0; i < 4; i++) {
            String fila="|";
            for (int j = 0; j < 12; j++) {
                fila+=this.ventas[j][i]+"|";
            }
            System.out.println(fila);
            System.out.println("--------------------------------------");
        }
    }
}
