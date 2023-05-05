/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradores;

import Entidades.Estudiante;
import Servicios.ServiceEstudiante;
/**
 *
 * @author JoséAgustín
 */
public class Integradores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceEstudiante s = new ServiceEstudiante();
        Estudiante e = s.crearEstudiante();
              
        s.calcularPromedio(e);
        s.notaMPromedio(e);
    }
    }
    

