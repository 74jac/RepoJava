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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int minuto;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos");
        minuto = leer.nextInt();
        System.out.println("Los minutos ingresados equivalen a: " + (minuto / 1440 ) + " días." );
        System.out.println("Los minutos ingresados equivalen a: " + (minuto / 60 ) + " horas." );
    }
    
}
