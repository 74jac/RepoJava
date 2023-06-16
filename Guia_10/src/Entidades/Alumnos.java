/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 */
package Entidades;

/**
 *
 * @author JoséAgustín
 */
public class Alumnos {
    
     public String nombre;
     private Integer[] notas = new Integer [3];

    public Alumnos() {
    }

    public Alumnos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
