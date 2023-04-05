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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0,j = 0;
    Scanner leer = new Scanner(System.in);
    String FDE="&&&&&";
    String secuencia;
    do {
        System.out.print("Ingrese secuencia: ");
        secuencia=leer.next();
        if (secuencia.length()==5&&secuencia.substring(0, 1).equals("X")&&secuencia.substring(4,5).equals("O")){
            i++;
        } else {
            j++; 
        }
    }
    while (!secuencia.equals(FDE));
    System.out.print("Correctas: " + i + " - Incorrectas: " + j);
}
}
        
