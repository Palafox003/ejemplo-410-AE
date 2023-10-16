package com.mycompany.blackjack;

/**
 *
 * @author Admin
 */
public class Carta {
    private int valor;
    private String tipo;
    private String nombre;
    
    public Carta(){
        
    }
    
    public Carta(int valor,String tipo,String nombre){
        this.valor=valor;
        this.tipo=tipo;
        this.nombre=nombre;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public void setValor(int x){
        this.valor=x;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String x){
        this.tipo=x;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String n){
        this.nombre=n;
    }
}
