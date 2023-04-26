/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
jugadores jugar un juego de adivinanza de números. El primer jugador elige un 
número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un 
número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
después de cada intento. El juego termina cuando el segundo jugador adivina 
el número o se queda sin intentos. Registra el número de intentos necesarios 
para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Juego {
    
     public int ganadas1 = 0;
    public int ganadas2 = 0;

    public Juego() {
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        int intentos = 0;
        System.out.println("Jugador 1:");
        System.out.print("Ingrese el numero secreto: ");
        int num = leer.nextInt();
        System.out.println("Jugador 2:");
        System.out.println("Tiene 3 vidas");
        System.out.print("Adivine el numero del jugador 1: ");
        do {
            int ad = leer.nextInt();
            if (num > ad) {
                System.out.println("mas alto");
                intentos++;
            } else if (num < ad) {
                System.out.println("mas bajo");
                intentos++;
            } else {
                System.out.println("Gano el jugador 2");
                this.ganadas2++;
                break;
            }
            if (intentos == 3) {
                System.out.println("**Sin vidas**");
                System.out.println("Gano el jugador 1");
                this.ganadas1++;
                break;
            }
        } while (intentos < 3);
        
    }

    public void gameOver() {
        System.out.println("Resultados: ");
        System.out.println("El jugador 1 gano: " + this.ganadas1);
        System.out.println("El jugador 2 gano: " + this.ganadas2);
    }
}   
    

    
   