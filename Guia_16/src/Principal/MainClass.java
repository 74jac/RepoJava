/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.logging.Level;
import java.util.logging.Logger;
import principal.dominio.usuario.UsuarioServicio;

/**
 *
 * @author JoséAgustín
 */
public class MainClass {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        
        UsuarioServicio usuarioServicio = new UsuarioServicio();
        try {
            usuarioServicio.crearUsuario("chiquito@chiquito", "asdafdads");
        } catch (Exception ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
