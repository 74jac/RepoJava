package introjava;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoséAgustín
 */
public class Ensayos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Juegador 1 ingrese un numero: ");        
        int jug1= leer.nextInt();
     System.out.println("Jugador 2 intente adivinarlo");    
        int jug2 = 0;
        int cont = 1;
    for (int i = 0; i < 5; i++) {
             jug2= leer.nextInt(); 
        if (jug1 == jug2) {    
             System.out.println("Adivinaste");
            if (jug1 > jug2) {
                System.out.println("El numero es mas alto");
                cont += cont;
            } else {
                System.out.println("El numero es mas bajo");
                cont += cont;
            }

            System.out.println("Intentelo nuevamente");

           
        }
    System.out.println("Te quedaste sin intentos");
}
    }
}