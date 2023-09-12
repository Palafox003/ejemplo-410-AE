/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculos;

/**
 *
 * @author Admin
 */
public class Calcular {
    
    public int elMayor(int num1, int num2){
        if(num1 >num2){
            return num1;
        }else{
            return num2;
        }
    }
    
    public int elMenor(int num1, int num2, int num3){
        if(num1 < num2 && num1 < num3){
            return num1;
        }else if(num2 <num3){
            return num2;
        }else{
            return num3;
        }
    }
    
    public int cantidadPares(int num){
        int pares=0;
        for (int i = 1; i <= num; i++) {
            if(i%2==0){
                pares++;
            }
        }
        return pares;
    }
    
    public int sumatoria(int num){
        int sumatoria=0;
        for (int i = 1; i <= num; i++) {
            sumatoria+=i;
        }
        return sumatoria;
    }
    
    public int suma(int num){
        if(num==1){
            return 1;
        }else{
            return num+suma(num-1);
        }
    }
    
    public int impares(int num1, int num2){
        int impares=0;
        for (int i = num1; i <= num2; i++) {
            if(i%2!=0){
                impares++;
            }
        }
        return impares;
    }
}
