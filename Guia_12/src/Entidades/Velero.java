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
public class Velero extends Barco{
    private int cantMastiles;
    private Alquiler alquiler;

    public Velero() {
        
    }

    public Velero(int cantMastiles, Alquiler alquiler, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.cantMastiles = cantMastiles;
        this.alquiler = alquiler;
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
    
   
    @Override
    public int calcularAlquiler() {
        return (int) (alquiler.CantidadDias()+ cantMastiles);
    }

    @Override
    public String toString() {
        return "Velero{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion +"cantMastiles=" + cantMastiles + ", alquiler=" + alquiler + '}';
    }
    
    
    
}
