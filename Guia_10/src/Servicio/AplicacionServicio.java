/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Digital
 */
public class AplicacionServicio {

    Scanner leer = new Scanner(System.in);

    HashMap<String, Double> productos = new HashMap();

    public void introducirElementos() {
        String resp = "";
        do {
            System.out.println("Introduzca el nombre del producto");
            String nombreProducto = leer.next();
            System.out.println("Introduzca el valor del producto");
            double valorProducto = leer.nextDouble();
            productos.put(nombreProducto, valorProducto);

            System.out.println("Quiere ingresar otro elemento?");
            resp = leer.next();

        } while (resp.equalsIgnoreCase("Si"));

    }

    public void modificarSuPrecio() {
        
        do {
            System.out.println("Ingrese el nombre del producto a modificar precio");

        String nombreProducto = leer.next();
        if (productos.containsKey(nombreProducto)) {
            System.out.println("Ingrese el precio nuevo");
            double precio = leer.nextDouble();
            productos.put(nombreProducto, precio);
            System.out.println("El nuevo precio para " + nombreProducto + "es de: " + precio);
            break;
        } else {
            System.out.println("El producto no fue encontrado");
        }
        } while (true);
        
        
        

    }

    public void mostrarProductos() {
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            System.out.println("El producto es: " + aux.getKey());
            System.out.println("El precio del producto es " + aux.getValue());
        }

    }

    public void eliminarProducto() {
        System.out.println("Ingrese nombre del producto a eliminar");
        String nombreEliminado = leer.next();
        if (productos.containsKey(nombreEliminado)) {
            productos.remove(nombreEliminado);

        } else {
            System.out.println("El producto ingresado no se encuentra en la lista");
        }
    }

}
