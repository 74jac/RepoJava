/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Administrador
 */
public class Motor extends Barco {
    private int cv;
    private Alquiler alquiler;

    public Motor() {
    }

    
    public Motor(int cv, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public int calcularAlquiler() {
        return alquiler.CantidadDias()+cv;
    }

    @Override
    public String toString() {
        return "Motor{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion +" cv=" + cv + ", alquiler=" + alquiler + '}';
    }
    
    
    
}
