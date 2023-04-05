/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_1_2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que lea un número entero por teclado y muestre
//por pantalla el doble, el triple y la raíz cuadrada de ese número.

int num1; 


Scanner leer = new Scanner(System.in);
    
System.out.println("Ingrese un numero entero positivo");
    num1 = leer.nextInt();

    
int res1 = num1 * 2;
int res2 = num1 * 3;
int res3 = (int) sqrt(num1);
        
System.out.println("El doble de " + num1 + " es: " + res1);
System.out.println("El triple de " + num1 + " es: " + res2);
System.out.println("La raiz cuadrada de " + num1 + " es: " + res3);
    }
    
}
