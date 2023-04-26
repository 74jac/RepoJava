/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Operacion {
    
    private int numero1;
    
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public Operacion(){
        
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

     
    public int sumar(){
        int suma = this.numero1 + this.numero2;
    return suma;
        
    }
    public int restar(){
        int resta = this.numero1 - this.numero2;
    return resta;
        
    }    

    public int multiplicar() {
        if (numero2 == 0) {
           System.out.println("El resultado es 0, Error."); 
        } else {
            int multi = numero1 * numero2; 
            return multi;      
        }
        return 0;
    } 

    public int dividir() {
        if (numero2 <= 0) {
           System.out.println("El resultado es 0, Error.");
        
        } else {
                int divi = numero1 / numero2;
         return divi;
        }
        return 0;
     
       
    }
    Scanner leer = new Scanner(System.in);

    public int creaOperacion() {
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        return numero1;
       
    }
 
    
    
}
    
    
    
    
    
    

