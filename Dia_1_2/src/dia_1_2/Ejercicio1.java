/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_1_2;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida dos números enteros por teclado y calcule
//la suma de los dos. El programa deberá después mostrar el resultado de
//la suma

int num1; 
int num2;

Scanner leer = new Scanner(System.in);
    
System.out.println("Ingrese un numero entero positivo");
    num1 = leer.nextInt();
System.out.println("Ingrese un numero entero positivo");
    num2 = leer.nextInt();
    
int suma = num1 + num2;
        
System.out.println("La suma de" + num1 + " mas " + num2 + " es: " + suma);



    }
    
}
