/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9;

import Servicios.ArregloServicio;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] a = new double[50];
        double[] b = new double[20];
        ArregloServicio as = new ArregloServicio();

        as.inicializarA(a);
        as.mostrar(a);
        as.ordenar(a);
        as.inicializarB(a, b);
        as.mostrar(a);
        as.mostrar(b);

    }
    
}
