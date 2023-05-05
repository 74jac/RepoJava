/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        
        System.out.println("Usted tiene " + ps.edad(p1.getNacimiento()));
        System.out.println(ps.menorQue(p1, ps.edad(p1.getNacimiento())));
        ps.mostrarPersona(p1);
    }
    
}
