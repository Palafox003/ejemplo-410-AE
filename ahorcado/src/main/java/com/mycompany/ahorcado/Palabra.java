/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ahorcado;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Palabra {
    private String[] palabrasx={"Auto","Windows","Linux","Perro","Gato","Casa","Redes"};
    Random rnd=new Random();
    private String palabras=palabrasx[rnd.nextInt(palabrasx.length)];
    private char[] palabra=new char[this.palabras.length()];
    private char[] palabraAux=new char[this.palabras.length()]; 
    private int errores=0;
    
    public Palabra(){
        for(int i = 0; i < palabra.length; i++) {
            this.palabra[i]='*';
            this.palabraAux[i]=this.palabras.charAt(i);
        }
    }
    
    public String getPalabras(){
        return this.palabras;
    }
    
    public void setPalabras(String palabra){
        this.palabras=palabra;
    }
    
    public void cambiarPalabra(){
        palabras=palabrasx[rnd.nextInt(palabrasx.length)];
        this.errores=0;
    }
    
    public void verificarPalabra(char letra){
        int correcto=0;
        for (int i = 0; i < this.palabras.length(); i++) {
            if(this.palabraAux[i]==letra){
                this.palabra[i]=letra;
                correcto++;
            }
        }
        if(correcto==0){
            this.errores++;
        }
       
    }
    
    public void imprimirPalabra(){
            String p="";
        for (int i = 0; i < this.palabra.length; i++) {
            p+="-"+this.palabra[i];
        }
        System.out.println(p);
        this.imprimirAhorcado();
    }
    
    public void imprimirAhorcado(){
        switch(this.errores){
            case 0:
                System.out.println("Tienes 3 oportunidades");
                System.out.println("Errores="+this.errores);
                break;
            case 1:
                System.out.println("Te quedan 2 oportunidades");
                System.out.println("(T_T)");
                break;
            case 2:
                System.out.println("Te queda 1 oportunidades");
                System.out.println("(T_T)");
                System.out.println(" /|\\ ");
                break;
            case 3:
                System.out.println("Ahorcado");
                System.out.println("(T_T)");
                System.out.println(" /|\\ ");
                System.out.println("  | ");
                System.out.println("  /\\ ");
                break;
            default:
                System.out.println("Errores="+this.errores);
                System.out.println("Ahorcado");
                System.out.println("(T_T)");
                System.out.println(" /|\\ ");
                System.out.println("  | ");
                System.out.println("  /\\ ");
                break;
        }
    }
}
