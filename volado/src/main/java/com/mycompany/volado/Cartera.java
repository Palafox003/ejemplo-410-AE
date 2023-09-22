/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.volado;

/**
 *
 * @author Admin
 */
public class Cartera {
    private int saldo;
    
    public Cartera(){
        this.saldo=1000;
    }
    
    public void mostrarSaldo(){
        System.out.println("Saldo de la cartera: $"+this.saldo);
    }
    
    public void sumarSaldo(int valor){
        this.saldo+=valor;
    }
    
    public void restarSaldo(int valor){
        this.saldo-=valor;
    }
    
    public void setSaldo(int valor){
        this.saldo=valor;
    }
    
    public int getSaldo(){
        return this.saldo;
    }
}
