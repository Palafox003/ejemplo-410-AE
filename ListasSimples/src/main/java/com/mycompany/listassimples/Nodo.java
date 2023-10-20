/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listassimples;

/**
 *
 * @author Admin
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    
    public Nodo(){
        this.valor=0;
        this.siguiente=null;
    }
    
    public Nodo(int v){
        this.valor=v;
        this.siguiente=null;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public void setValor(int x){
        this.valor=x;
    }
    
    public Nodo getSiguiente(){
        return this.siguiente;
    }
    
    public void setSiguiente(Nodo x){
        this.siguiente=x;
    }
}
