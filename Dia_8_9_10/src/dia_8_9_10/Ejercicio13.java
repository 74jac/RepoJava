/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de 
equipo y define su tipo de dato de tal manera que te permita alojar sus nombres 
más adelante.
 */
package dia_8_9_10;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] equipo = new String[7];
    
        
        for (int i = 0; i <= 6; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre de los alumnos: ");
            equipo[i] = leer.next();
        }
        System.out.println("-------------------");
        System.out.println("Lista de alumnos");
        for (int i = 0; i <= 6; i++) {
            System.out.println(equipo[i]);
        }
     }
    
}
