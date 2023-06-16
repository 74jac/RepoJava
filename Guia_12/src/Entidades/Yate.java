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
public class Yate extends Motor{
    private int cantCamarotes;
    private Alquiler alquiler;

    public Yate() {
    }
    
    public Yate(int cantCamarotes, Alquiler alquiler, int cv, int matricula, int eslora, int añoFabricacion) {
        super(cv, matricula, eslora, añoFabricacion);
        this.cantCamarotes = cantCamarotes;
        this.alquiler = alquiler;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }
    
     
    @Override
       public int calcularAlquiler() {
        return alquiler.CantidadDias()+cantCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion +"cantCamarotes=" + cantCamarotes + ", alquiler=" + alquiler + '}';
    }

       
}
