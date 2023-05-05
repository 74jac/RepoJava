/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author JoséAgustín
 */
public class Estudiante {
    public String[] nombre = new String[8];
    public double[] nota = new double[8];

     public Estudiante() {
    }
    
    
    public Estudiante(String[] nombre, double[] nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }
    

}
