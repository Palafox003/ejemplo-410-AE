/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.volado;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Moneda {
    
    private int cara;
    Random rnd=new Random();
    
    public Moneda(){
        this.cara=0;
    }
    
    public Moneda(int valor){
        this.cara=valor;
    }
    
    public void mostrarCara(){
        if(this.cara==0){
            System.out.println("Moneda=Cara");
        }else{
            System.out.println("Moneda=Cruz");
        }
    }
    
    public void lanzar(){
        this.cara=rnd.nextInt(2);
    }
    
    public int getCara(){
        return this.cara;
    }
}
