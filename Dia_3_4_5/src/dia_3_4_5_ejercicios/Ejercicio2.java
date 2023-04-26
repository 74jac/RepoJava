/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_3_4_5_ejercicios;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
    Scanner leer = new Scanner(System.in);
    String frase;
    System.out.println("Escribir una frase");          
        
    frase = leer.nextLine();
        
    if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("CORRECTO");
    } else {
            System.out.println("INCORRECTO");
        }
                                                                      
    }
}
  
