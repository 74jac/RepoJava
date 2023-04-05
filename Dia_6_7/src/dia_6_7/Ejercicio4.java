/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_6_7;

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
Scanner leer = new Scanner(System.in);
        int contador = 0;
        boolean bandera = true;
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        bandera= esPrimo(num, contador, bandera);
        System.out.println(bandera);
        

        // TODO code application logic here
    }

    public static boolean esPrimo(int num, int contador, boolean bandera) {
        for (int i = 2; i <= num; i++) {

            if (num % i == 0) {
                contador = contador + 1;
            }
        }
        
        if (contador == 1) {
            bandera = true;
        } else {
            bandera = false;
       
        }
        return bandera;

    }
    }
    
