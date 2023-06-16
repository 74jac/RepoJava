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
public class Residencia extends AlojamientoExtrahotelero{
    protected int cantHabitaciones;
    protected boolean descuentoAgremios, campoDeportivo;

    public Residencia(int cantHabitaciones, boolean descuentoAgremios, boolean campoDeportivo) {
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoAgremios = descuentoAgremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(int cantHabitaciones, boolean descuentoAgremios, boolean campoDeportivo, String esPrivado, double cantMetrosCuadrados) {
        super(esPrivado, cantMetrosCuadrados);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoAgremios = descuentoAgremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(int cantHabitaciones, boolean descuentoAgremios, boolean campoDeportivo, String esPrivado, double cantMetrosCuadrados, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(esPrivado, cantMetrosCuadrados, nombre, direccion, localidad, gerenteEncargado);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoAgremios = descuentoAgremios;
        this.campoDeportivo = campoDeportivo;
    }



    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoAgremios() {
        return descuentoAgremios;
    }

    public void setDescuentoAgremios(boolean descuentoAgremios) {
        this.descuentoAgremios = descuentoAgremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    
    
}
