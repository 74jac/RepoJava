/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author JoséAgustín
 */
@Entity
public class Fabricante implements Serializable {

    @Id
    private int id;
    private int codigo;
    private String nombre;

        public Fabricante() {
    }

    public Fabricante(int id, int codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Fabricante{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + '}';
    }

   

}

      


    