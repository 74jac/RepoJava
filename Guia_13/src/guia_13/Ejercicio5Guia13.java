/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_13;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santincho
 */
public class Ejercicio5Guia13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();

        int numeroAdivinar = random.nextInt(500) + 1;
        int intentos = 0;

        System.out.println("Bienvenido a Adivina el Numero:");
        System.out.println("Genere un numero entre 1 y 500. Intenta adivinarlo");

        Scanner leer = new Scanner(System.in);
        boolean adivinado = false;

        while (!adivinado) {

            try {
                System.out.println("Ingresa un numero");
                int numeroUsuario = leer.nextInt();
                intentos++;

                if (numeroUsuario == numeroAdivinar) {
                    adivinado = true;
                    System.out.println("Felicidades! Adivinaste el numero");
                } else if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El numero a adivinar es mayor.");
                } else {
                    System.out.println("El numero a adivinar es menor.");
                }
            }catch(InputMismatchException e){
               intentos++;
                System.out.println(
        
"Error: Debes ingresar un número válido.");
                leer.nextLine(); 
               
            }
    }

    }  
}