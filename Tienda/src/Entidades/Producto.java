/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author JoséAgustín
 */
@Entity
public class Producto implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    private int id;
    private int codigo;
    private String nombre;
    private double precio;
    @ManyToOne
    private Fabricante fabricante;

    public Producto() {
    }

    public Producto(int id, int codigo, String nombre, double precio, Fabricante fabricante) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + '}';
    }
    
    
}


    