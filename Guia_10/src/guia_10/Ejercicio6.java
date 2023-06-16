/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import Servicio.AplicacionServicio;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                AplicacionServicio Apps = new AplicacionServicio();
        
        Apps.introducirElementos();
        Apps.mostrarProductos();
        Apps.modificarSuPrecio();
        Apps.mostrarProductos();
        Apps.eliminarProducto();
        Apps.mostrarProductos();
        
    }
    
}
