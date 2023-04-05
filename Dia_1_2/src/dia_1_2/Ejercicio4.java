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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dada una cantidad de grados centígrados se debe mostrar su
//equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
//+ (9 * C / 5).

int num1; 


Scanner leer = new Scanner(System.in);
    
System.out.println("Ingrese un valor en grados centigrados");
    num1 = leer.nextInt();

    
int suma = 32 + (9 * num1 /5);
        
System.out.println("Los grados F son: " + suma);

    }
    
}
