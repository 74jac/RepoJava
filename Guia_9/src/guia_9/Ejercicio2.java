/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosServicios; 
/**
 *
 * @author JoséAgustín
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ParDeNumeros n2 = new ParDeNumeros();
        ParDeNumerosServicios n1 = new ParDeNumerosServicios();
        n1.Mostrar();
        n1.DevolverMayor();
        n1.CalcularPotencia();
        n1.CalcularRaiz();
        
    }
    
}  
        
  
