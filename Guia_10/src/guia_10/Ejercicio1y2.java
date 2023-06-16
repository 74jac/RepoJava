/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1y2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n") ;
        /* 
        Ejercicios 1 y 2:
        
        1. ArrayList <String> que guarde razas de perros.
        2. Bucle: pide raza, guarda en lista, pregunta si continuamos. al salir mostrar lista.
        3. Pedir una raza. Iterator: busca raza en lista, si esta se borra y 
           se muestra la lista ordenada, si no esta se informa y se muestra la lista
        */
        
        System.out.println("----- Registro de Razas Perrunas -----");
        System.out.println("1. Creacion de Lista");
        ArrayList<String> perros = new ArrayList<>();
        System.out.println("-----");
        System.out.println("");
        System.out.println("2. Bucle de Ingreso");
        String resp;
        boolean continuacion = true;
        String raza;
        do {
          
            System.out.println("Ingrese raza perruna:");
            raza = leer.next();
            //perros.add(leer.next());
            perros.add(raza);
            
            System.out.println("Quiere ingresar otra raza?");
            resp = leer.next();
            if (!resp.equalsIgnoreCase("si")) {
                continuacion = false;
            }
        } while (continuacion);
        // FOREACH de impresion de Lista
        for (String p : perros) {
            System.out.println("Raza: "+p+". ");
        }
        System.out.println("-----");
        System.out.println("");
        System.out.println("3. Iterador de Eliminacion");
        System.out.println("Indique una raza perruna a eliminar:");
        raza = leer.next();
        boolean buscar = true;
        Iterator <String> it = perros.iterator();
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase(raza)) {
                it.remove();
                buscar = false;
            }
        }
        System.out.println("");
        if (buscar==false) {
            System.out.println("raza eliminada.");
        } else {
            System.out.println("raza no encontrada.");
        }
        System.out.println("");
        Collections.sort(perros);
        System.out.println(perros);
        
        
    }
    
}
