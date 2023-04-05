/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_3_4_5;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
        //e imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
        //Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **

    int num1, num2, num3, num4; 
   
  
    
    Scanner leer = new Scanner(System.in); 
    System.out.println("Ingrese 4 numeros");
    num1 = leer.nextInt();
    if (num1 > 0 && num1 <20){
    }else {
    System.out.println("Ingrese nuevamente");
            num1 = leer.nextInt();    
    }
    num2 = leer.nextInt();
              if (num2 > 0 && num2 <20){
                  
              }else {
            System.out.println("Ingrese nuevamente");
            num2 = leer.nextInt();      
              }   
         
    num3 = leer.nextInt();
                    if (num3 > 0 && num3 <20){
                       
                    }else {
                    System.out.println("Ingrese nuevamente");
                    num3 = leer.nextInt();    
                    }     
    num4 = leer.nextInt();
                        if (num4 > 0 && num4 <20){
                            
                        }else{
                        System.out.println("Ingrese nuevamente");
                        num4 = leer.nextInt();    
                        }                
                    
    System.out.println("===============================");
    System.out.print(num1);
    for (int i = 0; i<num1; i++) {
    System.out.print("*");
    }
            
    System.out.println();
   
    System.out.print(num2);
    for (int i = 0; i<num2; i++) {
    System.out.print("*");
    }
    
    System.out.println();        
    
    System.out.print(num3);
    for (int i = 0; i<num3; i++) {
    System.out.print("*");
    }
    
    System.out.println();        
    
    System.out.print(num4);
    for (int i = 0; i<num4; i++) {
    System.out.print("*");
    }System.out.println();            
        
}
}    
   
    
    
    