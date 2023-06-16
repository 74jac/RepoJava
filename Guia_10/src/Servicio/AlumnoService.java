/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Alumnos;
/**
 *
 * @author JoséAgustín
 */
public class AlumnoService {
   
    Alumnos alumno = new Alumnos();
    private ArrayList<Alumnos> listaAlumnos = new ArrayList();
    private ArrayList<Integer> notas = new ArrayList();


    public void crearAlumno() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = read.next();

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas.add(read.nextInt());
        }

        alumno.setNombre(nombre);
        alumno.setNotas(notas);
        listaAlumnos.add(alumno);
    }

    public void mostrar() {

        for (Alumnos aux : listaAlumnos) {
            System.out.println(aux.getNombre());
            System.out.println(aux.getNotas());

        }

    }
    

    
}

