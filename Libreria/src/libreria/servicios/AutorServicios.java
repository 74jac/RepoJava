/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.Entidades.Autor;
import libreria.Persistencia.AutorDAO;

public class AutorServicios extends Autor {
    
    private EditorialServicios editorialServicios;
    private LibroServicios libroservicios;
    private final AutorDAO DAO;

    public AutorServicios(){
        this.DAO = new AutorDAO();
    }

    public EditorialServicios getEditorialServicios() {
        return editorialServicios;
    }

    public void setEditorialServicios(EditorialServicios editorialServicios) {
        this.editorialServicios = editorialServicios;
    }

    public LibroServicios getLibroservicios() {
        return libroservicios;
    }

    public void setLibroservicios(LibroServicios libroservicios) {
        this.libroservicios = libroservicios;
    }
    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nobre de autor");           
            }
            autor.setNombre(nombre);
            DAO.guardar(autor);
            
            return autor;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
