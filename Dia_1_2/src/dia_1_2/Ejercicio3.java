/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_1_2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas
        //y después toda en minúsculas.
        String frase;

Scanner leer = new Scanner(System.in);
    
System.out.println("Ingrese una frase");
    frase = leer.next();
String frase1 = toLowerCase(frase);
System.out.println(frase1);
String frase2 = toUpperCase(frase);
System.out.println(frase2);
        
        
    }


    
}
