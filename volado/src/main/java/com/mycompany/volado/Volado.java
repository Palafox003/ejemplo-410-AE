/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.volado;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Volado {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Cartera cartera=new Cartera();
        Moneda moneda=new Moneda();
        int menu=0;
        int apuesta=0;
        int cara=0;
            cartera.mostrarSaldo();
            while(menu<3){
                System.out.println("1. ¿Cuanto quieres apostar?");
                System.out.println("2. Jugar");
                System.out.println("3. Salir");
                System.out.println("Selecciona una opción:");
                menu=leer.nextInt();
                
                switch(menu){
                    case 1:
                        System.out.println("Inserta la cantidad para tu apuesta:");
                        apuesta=leer.nextInt();
                        if(apuesta>cartera.getSaldo()){
                            System.out.println("Tu saldo es insuficiente");
                            apuesta=0;
                            menu=3;
                        }
                        break;
                    case 2:
                        System.out.println("Selecciona cara=0,cruz=1");
                        cara=leer.nextInt();
                        moneda.lanzar();
                        moneda.mostrarCara();
                        if(cara==moneda.getCara()){
                            System.out.println("Felicidades");
                            cartera.sumarSaldo(apuesta);
                        }else{
                            System.out.println("Surte para la proxima");
                            cartera.restarSaldo(apuesta);
                        }
                        cartera.mostrarSaldo();
                        break;
                    default:
                        menu=3;
                        break;
                }
            }
    }
}
