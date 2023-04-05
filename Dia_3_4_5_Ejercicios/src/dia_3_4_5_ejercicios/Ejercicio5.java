/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package dia_3_4_5_ejercicios;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int limite, num, suma = 0; 

System.out.println("Ingrese un limite");
Scanner leer = new Scanner(System.in);
limite = leer.nextInt();
        
Scanner lee = new Scanner(System.in);
    do {
        System.out.println("Ingrese un numero");
        num = lee.nextInt();
        suma += num;
        System.out.println("Suma= " + suma);
} while (suma <= limite);
        
System.out.println("Suma llego al limite");        
        
    }
    
}
