/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package dia_8_9_10;

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

        int n = 0, numero, c = 0;

        System.out.println("Ingrese el tamaño del vector");

        n = leer.nextInt();

        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {

            vector[i] = (int) (Math.random() * 10);

        }
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }

        System.out.println("Ingrese el numero que desee buscar");
        numero = leer.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == numero) {
                System.out.println("el numero que buscas esta en la posicion " + vector[i]);
                c++;
            } else {
                System.out.println("No se encontro ");
            }

        }
        System.out.println("Se encontraron tantos repetidos " + c);
    }
}  
        
 
