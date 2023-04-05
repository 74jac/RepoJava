/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class OpinionPelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer =new Scanner(System.in);
        System.out.println("Califique la peli del 1 al 5");
        opinion = leer.nextInt();
        
        if (opinion >=1 && opinion <=5) { 
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Lastima");
                    break;
                case 3:
                    System.out.println("buena");
                    break;
                case 4: 
                    System.out.println("muy buena");
                    break;
                case 5:
                    System.out.println("Muy buena");
                    break;
        }
    } else if (opinion < 0) {
        System.out.println("que mal");
    } else if (opinion == 0) {
        System.out.println("No es valido");
    } else {
        System.out.println("te pasaste!");
    }
    System.out.println("Hasta la proxima");    
    }       
    }
 