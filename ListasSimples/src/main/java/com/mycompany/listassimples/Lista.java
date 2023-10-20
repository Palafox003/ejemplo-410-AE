/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listassimples;

/**
 *
 * @author Admin
 */
public class Lista {
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int index;
    
    public int getIndex(){
        return this.index;
    }
    
    public Lista(){
        this.primerNodo=null;
        this.ultimoNodo=null;
        this.index=0;
    }
    
    public void imprimirPrimerNodo(){
        System.out.println("Primer Nodo: "+this.primerNodo.getValor());
    }
    
    public void imprimirUltimoNodo(){
        System.out.println("Ultimo Nodo: "+this.ultimoNodo.getValor());
    }
    
    public boolean verificarLista(){
        return this.primerNodo==null;
    }
    
    public void agregarNodoFinalMejorado(Nodo x){
        if(this.verificarLista()){
            this.primerNodo=x;
            this.ultimoNodo=x;
            this.index++;
        }else{
            Nodo aux=this.ultimoNodo;
            this.ultimoNodo.setSiguiente(x);
            this.ultimoNodo=x;
            this.index++;
        }
    }
//-----Agregar nodo al final recorriendo la lista con ciclo while    
    public void agregarNodoFinal(Nodo x){
        if(this.verificarLista()){
            this.primerNodo=x;
            this.index++;
        }else{
            Nodo aux=this.primerNodo;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(x);
            this.index++;
        }
    }
//----Agregar nodo cuado la lista esta en null   
    public void agregarNodo(){
        Nodo nodo=new Nodo(100);
        if(this.verificarLista()){
            this.primerNodo=nodo;
            this.index++;
        }
    }
}
