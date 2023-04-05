/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
usuario, validando que el primer número múltiplo del segundo e imprima si el 
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package dia_6_7;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejecicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese primer número: ");
        num1=leer.nextInt();
        System.out.println("Ingrese segundo número: ");
        num2=leer.nextInt();
        esMultiplo(num1,num2);
        
    }
        
    public static void esMultiplo (int num1, int num2) {
        if (num1%num2==0) {
            System.out.println("El primer número es múltiplo del segundo");
        } else {
            System.out.println("El primer número NO es múltiplo del segundo");    
        }
    }
}

   
    
