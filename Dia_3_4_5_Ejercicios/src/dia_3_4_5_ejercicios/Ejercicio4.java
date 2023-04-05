/*
Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package dia_3_4_5_ejercicios;

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
    String frase;
    System.out.println("Ingrese una frase");
    Scanner leer = new Scanner(System.in);
    frase = leer.next();
    //String vocal;
    //vocal = frase.substring(0,1);        
    
    if (frase.substring(0,1).equalsIgnoreCase("a")){ 
    System.out.println("CORECTO");
  
    } else {
   
       System.out.println("INCORECTO"); 

    }
    }
    
}
