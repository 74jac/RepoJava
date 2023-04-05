/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_8_9_10;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              String[] equipo = new String[7];
    
        
        for (int i = 0; i < 6; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre de los alumnos: ");
            equipo[i] = leer.next();
        }
        System.out.println("-------------------");
        System.out.println("Lista de alumnos");
        for (int i = 0; i < 6; i++) {
            System.out.println(equipo[i]);
        }
     }
    
}
   