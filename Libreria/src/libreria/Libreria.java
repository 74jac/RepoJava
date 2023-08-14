/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import libreria.servicios.AutorServicios;
import libreria.servicios.EditorialServicios;
import libreria.servicios.LibroServicios;

/**
 *
 * @author JoséAgustín
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroServicios ls = new LibroServicios();
        EditorialServicios ed = new EditorialServicios();
        AutorServicios au = new AutorServicios();
        
//        ed.crearEditorial("Unicornio");
//        au.crearAutor("Cordero");
        ls.crearLibro(4445644, "El tunel", 2002, 22, 2, 2, true, , 1);
        
        
        
        
    }
    
}
