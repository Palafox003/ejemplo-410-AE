package com.mycompany.blackjack;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class Mazo {
    private ArrayList<Carta> mazo=new ArrayList<Carta>();
    private String tipos[]={"Corazones","Treboles","Diamantes","Espadas"};
    private String nombres[]={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Jack","Reina","Rey"};
    
    public Mazo(){
        for(int i=0;i<this.tipos.length;i++) {
            for(int j=0;j<this.nombres.length;j++) {
                Carta c=new Carta((j+1),this.tipos[i],this.nombres[j]+" de "+this.tipos[i]);
                this.mazo.add(c);
            }
        }
    }
    
    public void imprimirMazo(){
        for(int i=0;i<this.mazo.size();i++) {
            System.out.println((i+1)+". "+this.mazo.get(i).getNombre());
        }
    }
    
    public void Barajear(){
        Collections.shuffle(mazo);
    }
    
    public Carta pedirCarta(){
        Carta c=this.mazo.get(this.mazo.size()-1);
                this.mazo.remove(this.mazo.size()-1);
        return c;
    }
}
