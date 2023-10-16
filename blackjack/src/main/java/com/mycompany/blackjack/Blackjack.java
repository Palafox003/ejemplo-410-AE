package com.mycompany.blackjack;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {
        Mazo m=new Mazo();
        Mano j1=new Mano();
        Mano mesa=new Mano();
        Scanner leer=new Scanner(System.in);
            m.Barajear();
            j1.agregarCarta(m.pedirCarta());
            mesa.agregarCarta(m.pedirCarta());
            j1.agregarCarta(m.pedirCarta());
            mesa.agregarCarta(m.pedirCarta());
            
            if(mesa.getPuntos()<17){
                mesa.agregarCarta(m.pedirCarta());
            }
            
            mesa.imprimirMesa();
            j1.imprimirMano();
            
            int estatus=1;
            int cartera=1000;
            int apuesta=0;
            int opcion=0;
            System.out.println("Cartera: "+cartera);
            System.out.println("Inserta la primera apuesta:");
            int apuestaAux=leer.nextInt();
                if(apuestaAux<=cartera){
                    apuesta=apuestaAux;
                }else{
                    System.out.println("Saldo insuficiente en la cartera");
                    System.out.println("Cartera:$"+cartera);
                }
            while(estatus>0){
                System.out.println("Elige una opción:");
                System.out.println("1. Pedir una carta.");
                System.out.println("2. Terminar juego.");
                System.out.println("3. Apostar.");
                System.out.println("4. Juego nuevo.");
                System.out.println("5. Cartera.");
                System.out.println("6. Salir del juego.");
                opcion=leer.nextInt();
                switch(opcion){
                    case 1:
                        j1.agregarCarta(m.pedirCarta());
                        j1.imprimirMano();
                        if(!j1.getEstatus()){
                            cartera-=apuesta;
                            apuesta=0;
                        }
                        break;
                    case 2:
                        if(mesa.getPuntos()<=21 && mesa.getPuntos()>j1.getPuntos()){
                            System.out.println("La casa gana puntos totales: "+mesa.getPuntos());
                            System.out.println("Puntos del jugados: "+j1.getPuntos());
                            cartera-=apuesta;
                            apuesta=0;
                        }else{
                            System.out.println("El jugador gana puntos totales: "+j1.getPuntos());
                            System.out.println("Puntos de la mesa: "+mesa.getPuntos());
                            cartera+=apuesta;
                            apuesta=0;
                        }
                        break;
                    case 3:
                        System.out.println("Inserta la cantidad a apostar:");
                        apuestaAux=leer.nextInt();
                        if(apuestaAux<=cartera){
                             apuesta=apuestaAux;
                        }else{
                            apuesta=0;
                            System.out.println("Saldo insuficiente en tu cartera");
                            System.out.println("Cartea:$"+cartera);
                        }
                       
                        break;
                    case 4:
                        if(cartera>0){
                            m=new Mazo();
                            j1=new Mano();
                            mesa=new Mano();
                             m.Barajear();
                            j1.agregarCarta(m.pedirCarta());
                            mesa.agregarCarta(m.pedirCarta());
                            j1.agregarCarta(m.pedirCarta());
                            mesa.agregarCarta(m.pedirCarta());

                            if(mesa.getPuntos()<17){
                                mesa.agregarCarta(m.pedirCarta());
                            }
                            mesa.imprimirMesa();
                            j1.imprimirMano();
                        }else{
                                System.out.println("Saldo insuficiente.");
                                estatus=0;
                            }
                        break;
                    case 5:
                        System.out.println("Cartera=$"+cartera);
                        System.out.println("Apuesta actual=$"+apuesta);
                        break;
                    case 6:
                        estatus=0;
                        break;
                    default:
                         estatus=0;
                        break;
                }
            }
            
    }
}
