/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Karen
 */
public class AlojamientoExtrahotelero extends Alojamiento{
    protected String esPrivado;
    protected double cantMetrosCuadrados;

    public AlojamientoExtrahotelero() {
    }

    public AlojamientoExtrahotelero(String esPrivado, double cantMetrosCuadrados) {
        this.esPrivado = esPrivado;
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    public AlojamientoExtrahotelero(String esPrivado, double cantMetrosCuadrados, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(nombre, direccion, localidad, gerenteEncargado);
        this.esPrivado = esPrivado;
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    public String getEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(String esPrivado) {
        this.esPrivado = esPrivado;
    }

    public double getCantMetrosCuadrados() {
        return cantMetrosCuadrados;
    }

    public void setCantMetrosCuadrados(double cantMetrosCuadrados) {
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }
    
    
}
