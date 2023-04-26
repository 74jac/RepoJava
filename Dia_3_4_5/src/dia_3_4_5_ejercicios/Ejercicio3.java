package dia_3_4_5_ejercicios;

import java.util.Scanner;




/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java..
 */

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    String frase;
    System.out.println("Ingrese una frase");
    Scanner leer = new Scanner(System.in);
    frase = leer.next();
        
    if (frase.length() <= 8){ 
    System.out.println("CORECTO");
    
    }else {
       System.out.println("INCORECTO"); 
    }
    }
}
