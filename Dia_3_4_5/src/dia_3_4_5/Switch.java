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
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

    	int opcion;

    	System.out.println("Ingrese una opción");

    	opcion = leer.nextInt();

    	switch (opcion) {
        	case 1:
           System.out.println("Esta línea de código se ejecuta si opcion = 1");
           break;

        	case 2:
           System.out.println("Esta línea de código se ejecuta si opcion = 2");
            break;

        	default:
           System.out.println("El valor ingresado en la variable opcion es diferente" + "a todos los casos analizados por el switch");
    	}

    }
    
}
