/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listassimples;

/**
 *
 * @author Admin
 */
public class ListasSimples {

    public static void main(String[] args) {
        Lista lista1=new Lista();
            lista1.agregarNodoFinalMejorado(new Nodo(100));
            lista1.agregarNodoFinalMejorado(new Nodo(150));
            lista1.agregarNodoFinalMejorado(new Nodo(200));
            if(lista1.verificarLista()){
                System.out.println("Lista Vacia");
            }else{
                System.out.println("Lista Ocupada");
            }
        System.out.println("Nodos de la lista: "+lista1.getIndex());
        lista1.imprimirPrimerNodo();
        lista1.imprimirUltimoNodo();
    }
}
