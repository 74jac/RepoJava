/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package dia_6_7;

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
        System.out.print("Ingrese la cantidad de personas: ");
        int N = leer.nextInt();
        for (int i=0; i<N; i++) {
            if (datos(i)){
                System.out.print("La persona es MAYOR de edad");
            }
            else{
                System.out.print("La persona es MENOR de edad");
            }
            System.out.println("");
            System.out.print("Desea mostrar la siguiente persona?: ");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("No"))
                break;
        }
        
    }
    public static boolean datos(int i){
       Scanner leer = new Scanner(System.in);
       System.out.print("Ingrese el nombre de la persona "+(i+1)+": ");
       String nombre = leer.next();
       System.out.print("Ingrese la edad de la persona "+(i+1)+": ");
       int edad = leer.nextInt();
        System.out.println("---------DATOS:---------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
       if (edad>=18){
           return true;
       }
       else{
           return false;
       }
    }
}
        
        
 