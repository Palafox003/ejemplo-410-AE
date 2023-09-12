/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglo;

/**
 *
 * @author Admin
 */
public class Clima {
    private float[] temperaturas;
    
    public Clima(){
        temperaturas=new float[7];
    }
    
    public void agregarTemperatura(int posicion, float temp){
        temperaturas[posicion]=temp;
    }
    
    public float verPromedio(){
        float sum=0;
        for (int i = 0; i < 7; i++) {
            sum+=temperaturas[i];
        }
        return sum/7;
    }
}
