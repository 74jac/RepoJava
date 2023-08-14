/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.Entidades.Autor;
import libreria.Entidades.Editorial;
import libreria.Entidades.Libro;
import libreria.Persistencia.LibroDAO;

/**
 *
 * @author JoséAgustín
 */
public class LibroServicios {
    
    private EditorialServicios editorialServicios;
    private AutorServicios autorservicios;
    private final LibroDAO DAO;
    
    public LibroServicios(){
        this.DAO = new LibroDAO();
    }

    public EditorialServicios getEditorialServicios() {
        return editorialServicios;
    }

    public void setEditorialServicios(EditorialServicios editorialServicios) {
        this.editorialServicios = editorialServicios;
    }

    public AutorServicios getAutorservicios() {
        return autorservicios;
    }

    public void setAutorservicios(AutorServicios autorservicios) {
        this.autorservicios = autorservicios;
    }
    
public Libro crearLibro(long isbn, String titulo, int anio, int ejemplares, int ejemplaresPrestado, int ejemplaresRestantes, boolean alta, Autor autor, Editorial editorial) {
        Libro libro = new Libro();
        try {
         
            libro.setIsbn(isbn);
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe indicar un nobre de autor");           
            }
            libro.setTitulo(titulo);
            libro.getAnio();
            libro.setEjemplares(ejemplares);
            libro.getEjemplaresPrestado();
            libro.getEjemplaresRestantes();
            libro.getAutor();
            libro.getEditorial();
            DAO.guardar(libro);
            
            return libro;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }    
}
