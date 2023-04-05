/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
convertir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package dia_6_7;

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
       
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de EUROS: ");
        double euro = leer.nextDouble();
        System.out.print("A que moneda desea convertir?: ");
        String moneda = leer.next();
        convertir(euro,moneda);
    }
    public static void convertir(double euro, String moneda) {
        moneda=moneda.toLowerCase();
        switch(moneda){
            case "dolares":
                System.out.println(""+1.28611*euro);
                break;
            case "libras":
                System.out.println(""+1.28611*euro);
                break;
            case "yenes":
                System.out.println(""+129.852*euro);   
                break;
        }
    }
}
        
      

