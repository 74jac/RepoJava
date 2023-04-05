/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_3_4_5_ej_extra;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              String letra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        letra = leer.nextLine();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
        
            System.out.println("Es una vocal");
              } else {
                
               System.out.println("No es una vocal");
        }
    }
    
}
        

