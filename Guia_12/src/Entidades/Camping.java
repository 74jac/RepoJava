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
public class Camping extends AlojamientoExtrahotelero{
    protected int numMaxCarpas, numBanios;
    protected boolean restaurant;

    public Camping() {
    }
    

    public Camping(int numMaxCarpas, int numBanios, boolean restaurant) {
        this.numMaxCarpas = numMaxCarpas;
        this.numBanios = numBanios;
        this.restaurant = restaurant;
    }

    public Camping(int numMaxCarpas, int numBanios, boolean restaurant, String esPrivado, double cantMetrosCuadrados) {
        super(esPrivado, cantMetrosCuadrados);
        this.numMaxCarpas = numMaxCarpas;
        this.numBanios = numBanios;
        this.restaurant = restaurant;
    }

    public Camping(int numMaxCarpas, int numBanios, boolean restaurant, String esPrivado, double cantMetrosCuadrados, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(esPrivado, cantMetrosCuadrados, nombre, direccion, localidad, gerenteEncargado);
        this.numMaxCarpas = numMaxCarpas;
        this.numBanios = numBanios;
        this.restaurant = restaurant;
    }

    
    public int getNumMaxCarpas() {
        return numMaxCarpas;
    }

    public void setNumMaxCarpas(int numMaxCarpas) {
        this.numMaxCarpas = numMaxCarpas;
    }

    public int getNumBanios() {
        return numBanios;
    }

    public void setNumBanios(int numBanios) {
        this.numBanios = numBanios;
    }

    public boolean getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }
    
    
    
}
