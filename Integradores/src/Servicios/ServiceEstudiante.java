/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidades.Estudiante;
import java.util.Scanner;
/**
 *
 * @author JoséAgustín
 */
public class ServiceEstudiante {
    
    
    
    public Estudiante crearEstudiante() {
        Estudiante e = new Estudiante();
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("ingrese el nombre del estudiante");
            //String nombre= leer.next();
            e.nombre[i] = leer.next();

            System.out.println("ingrese el nota del estudiante");
            e.nota[i] = leer.nextInt();

        }
        return e;
} 
    public double calcularPromedio(Estudiante e) {
        double suma = 0;

        for (int i = 0; i < 8; i++) {
            suma = suma + e.nota[i];
        }
        return suma / 8;
    }

public void notaMPromedio(Estudiante e){


    for (int i = 0; i < 8; i++) {
        if (e.nota[i]> calcularPromedio(e)) {
          
            System.out.println("El alumno " + e.nombre[i] + " supera el promedio " + e.nota[i]);
        }
    }
   
}


}

