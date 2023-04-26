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
public class Cafetera {
    
    public int capacidadMaxima = 1000;
    public int capacidadActual;
    public int cantidadCafe;

public Cafetera() {
    
}    
    public Cafetera(int capacidadMaxima, int capacidadActual, int cantidadCafe) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        this.cantidadCafe = cantidadCafe;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    
    
    
}
