/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.Entidades.Editorial;
import libreria.Persistencia.EditorialDAO;

/**
 *
 * @author JoséAgustín
 */
public class EditorialServicios {
    
    private AutorServicios autorservicios;
    private LibroServicios libroServicios;
    private final EditorialDAO DAO;
    
    public EditorialServicios(){
        this.DAO = new EditorialDAO();
        
    }

    public AutorServicios getAutorservicios() {
        return autorservicios;
    }

    public void setAutorservicios(AutorServicios autorservicios) {
        this.autorservicios = autorservicios;
    }

    public LibroServicios getLibroServicios() {
        return libroServicios;
    }

    public void setLibroServicios(LibroServicios libroServicios) {
        this.libroServicios = libroServicios;
    }
    
    public Editorial crearEditorial(String nombre){
        Editorial editorial = new Editorial();
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nobre de autor");           
            }
            editorial.setNombre(nombre);
            DAO.guardar(editorial);
            
            return editorial;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
        public void asignarEditorial (String nombre){
            
            
        }
    }
    
}
