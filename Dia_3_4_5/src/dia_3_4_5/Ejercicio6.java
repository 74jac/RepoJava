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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Implementar un programa que le pida dos números enteros al usuario y 
        //determine si ambos o alguno de ellos es mayor a 25.
        
int num1; 
int num2;

Scanner leer = new Scanner(System.in);
    
System.out.println("Ingrese un numero entero positivo");
    num1 = leer.nextInt();
System.out.println("Ingrese un numero entero positivo");
    num2 = leer.nextInt();
    
if (num1 > 25 && num2 > 25){
          
           
    System.out.println("Ambos numero son mayores a 25");
        
    }else
    System.out.println("Algun numero no es mayor a 25");
    
}
}