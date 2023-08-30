/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author Admin
 */
public class Auto {
    private String potente="aaaa";
    private int velocidad=20;
    private int marcha=1;
    private int velocidadMaxima=120;
    private int velocidadMaximaReversa=60;
    
    public int getVelocidad(){
        return velocidad;
    }
    
    public int subirCambio(){
        if(getMarcha() >=1 || getMarcha()<6){
            setMarcha(getMarcha() + 1);
        }
        return getMarcha();
    }
    
    public int bajarCambio(){
        if(getMarcha() >1 || getMarcha()<=6){
            setMarcha(getMarcha() - 1);
        }
        return getMarcha();
    }
    
    public int reversa(){
        setMarcha(6);
        return getMarcha();
    }
    
    public int acelerar(){
        if(getMarcha()==-1 && getVelocidad()<getVelocidadMaximaReversa()){
            setVelocidad(getVelocidad() + 1);
        }
        if(getVelocidad()>=0 && getVelocidad()<getVelocidadMaxima()){
            setVelocidad(getVelocidad() + 1);
        }
        return getVelocidad();
    }
    
    public int frenar(){
        if(getVelocidad()>=1){
            setVelocidad(getVelocidad() - 1);
        }
        return getVelocidad();
    }
    
    public String conocerMarcha(){
        String mensaje="";
        switch(getMarcha()){
            case -1: mensaje="Va en reversa";break;
            case 1: mensaje="Va en primera";break;
            case 2: mensaje="Va en segunda";break;
            case 3: mensaje="Va en tercera";break;
            case 4: mensaje="Va en cuarta";break;
            case 5: mensaje="Va en quinta";break;
            case 6: mensaje="Va en sexta";break;
        }
        return mensaje;
    }

    /**
     * @return the potente
     */
    public String getPotente() {
        return potente;
    }

    /**
     * @param potente the potente to set
     */
    public void setPotente(String potente) {
        this.potente = potente;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the marcha
     */
    public int getMarcha() {
        return marcha;
    }

    /**
     * @param marcha the marcha to set
     */
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    /**
     * @return the velocidadMaxima
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * @param velocidadMaxima the velocidadMaxima to set
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * @return the velocidadMaximaReversa
     */
    public int getVelocidadMaximaReversa() {
        return velocidadMaximaReversa;
    }

    /**
     * @param velocidadMaximaReversa the velocidadMaximaReversa to set
     */
    public void setVelocidadMaximaReversa(int velocidadMaximaReversa) {
        this.velocidadMaximaReversa = velocidadMaximaReversa;
    }

}
