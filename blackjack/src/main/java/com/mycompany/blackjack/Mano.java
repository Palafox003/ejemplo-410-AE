package com.mycompany.blackjack;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class Mano {
    private ArrayList<Carta> mano=new ArrayList<Carta>();
    private boolean estatus=true;
    private int puntos=0;
    
    public Mano(){
        
    }
    
    public boolean getEstatus(){
        return this.estatus;
    }
    
    public void setEstatus(boolean e){
        this.estatus=e;
    }
    
    public int getPuntos(){
        return this.puntos;
    }
    
    public void setPuntos(int p){
        this.puntos=p;
    }
    
    public void agregarCarta(Carta x){
        if(estatus){
            this.mano.add(x);
            if(x.getValor()>10){
                 this.puntos+=10;
            }else{
                this.puntos+=x.getValor();
            }
        }
    }
    
    public void imprimirMano(){
        System.out.println("Mano del Jugador");
        for(int i=0;i<this.mano.size();i++){
            System.out.println((i+1)+". "+this.mano.get(i).getNombre());
        }
        System.out.println("Puntos del jugador: "+puntos);
        this.validarMano();
    }
    
    public void validarMano(){
        if(this.puntos>21){
            System.out.println("Perdiste");
            this.estatus=false;
        }
    }
    
    public void imprimirMesa(){
        System.out.println("Mano de la Mesa");
        System.out.println("1. ??????????");
        int suma=0;
        for(int i=1;i<this.mano.size();i++){
            System.out.println((i+1)+". "+this.mano.get(i).getNombre());
            suma+=this.mano.get(i).getValor();
        }
        System.out.println("Puntos de la mesa: "+suma);
        
        if(this.puntos>21){
            System.out.println("La casa pierde puntos: "+this.puntos);
        }
        
        
    }
}
