/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_servicios_extra_1;

import Entidades.Raiz;
import Servicios.ServiciosRaiz;

public class Oop_Servicios_Extra_1 {

    public static void main(String[] args) {
        ServiciosRaiz sr = new ServiciosRaiz();
        Raiz r = sr.CrearRaiz();
        sr.calcular(r);    
    } 
}
