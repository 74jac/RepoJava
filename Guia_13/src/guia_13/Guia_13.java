/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_13;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Guia_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");

         //Esto dara error
         int valor1 = Integer.valueOf("a");
        //Capturar el error usando try-catch especificando que tipo de error será
        int valor2=5;
         System.out.println("El entero se inicializo en: " + 5);
         try {
             valor2 = Integer.valueOf("a");
             System.out.println("El valor indicado es: " + valor2);  
         } catch (NumberFormatException e){
             System.out.println("El valor indicado no es un numero");
         }
        /*Try-catch acudiendo a la "excepcion madre" es decir tomara una accion para cualquier
            excepcion lanzada*/
        try {
            int valor3 = Integer.valueOf("q");
            System.out.println("El numero indicado es: " + valor3);
        } catch (Exception e){
            System.out.println("El valor indicado no es un numero.");
        }

        try {
            int valor4 = Integer.valueOf("q");
            System.out.println("El numero indicado es: " + valor4);
            /*En este caso el catch tomado sera el NumberFormatException ya que es el tipo
            de excepcion indicado para el error planteado*/
        } catch (NumberFormatException e) {
            System.out.println("El valor indicado no es un numero");
        } catch (Exception e) {
            System.out.println("Valor incorrecto");
            /*Inmediatamente capturada la excepcion se pasa al bloque finally
            el cual se ejecutara independientemente de si la excepcion es 
            lanzada o no*/
        } finally {
            int valor5 = 9;
            System.out.println("El valor ingresado 5 es: " + valor5);
        }

        // TODO code application logic here
    }
    }
    
}
