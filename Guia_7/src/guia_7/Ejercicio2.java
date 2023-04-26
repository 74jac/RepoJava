/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import guia_7.circunferencia.Circunferencia;
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

       Circunferencia circu = new Circunferencia();
       
        System.out.println("Ingrese el radio");       
        circu.crearCircunferencia();
       
        System.out.println( circu.crearArea());
        System.out.println(circu.crearPerimetro());

}

}
