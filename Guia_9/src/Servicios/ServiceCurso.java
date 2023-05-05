/*
       - service
                    Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese 
el nombre de cada alumno.
                    Método crearCurso(): el método crear curso, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
                    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en 
una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el 
precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.

 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author PC SABRINA
 */
public class ServiceCurso {
    Scanner input = new Scanner (System.in).useDelimiter("\n");
    
    public void cargarAlumnos(Curso c){
        for (int i = 0; i < 5; i++) {
          System.out.println("Ingrese el nombre del alumno: " + (i+1));
          c.alumnos[i]= input.next();
        }
        }
    public Curso crearCurso(Curso c){
        
        System.out.println("Ingrese el nombre de su curso");
        c.setNombreCurso(input.next());
        System.out.println("Ingrese cantidad de horas: ");
        c.setCantidadHoraspordia(input.nextInt());
        System.out.println("Ingrese cantidad de dias por semana: ");
        c.setCantidadDiasPorSemana(input.nextInt());
        System.out.println("Ingrese su turno: ");
        c.setTurno(input.next());
        System.out.println("Ingrese precio por hora: ");
        c.setPrecioPorHora(input.nextDouble());
        
        cargarAlumnos(c);
        return c;  
    }
    public double calcularGananciaSemanal(Curso c){
        
       return c.getCantidadHoraspordia()*c.getPrecioPorHora()*5*c.getCantidadDiasPorSemana();
        
        
        
    }
    
}
