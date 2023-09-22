/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notas;

/**
 *
 * @author Admin
 */
public class Acta {
    private float[][] notas;
    
    public Acta(int cantidadAlumnos, int cantidadNotas){
        notas=new float[cantidadAlumnos][cantidadNotas];
    }
    
    public void poblar(){
        for (int filas = 0; filas < notas.length; filas++) {
            for (int columnas = 0; columnas < notas[0].length; columnas++) {
                notas[filas][columnas]=(float)((Math.random()*9f)+1);
            }
        }
    }
    
    public float promedioAlumno(int fila){
        float promedioAlumno=0;
        for (int i = 0; i < notas.length; i++) {
            promedioAlumno+=notas[fila][i];
        }
        return promedioAlumno/notas[0].length;
    }
    
    public float promedioTotal(){
        float promedioFinal=0;
        for (int filas = 0; filas < notas.length; filas++) {
            for (int columnas = 0; columnas < notas[0].length; columnas++) {
                promedioFinal+=notas[filas][columnas];
            }
        }
        return promedioFinal/(notas.length*notas[0].length);
    }
    
    public float[][] getNotas(){
        return notas;
    }
    
    
}
