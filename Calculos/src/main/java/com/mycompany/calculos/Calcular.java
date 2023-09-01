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
}
