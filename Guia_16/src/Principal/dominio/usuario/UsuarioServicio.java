/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.dominio.usuario;

import Principal.persistencia.UsuarioDAO;

/**
 *
 * @author JoséAgustín
 */
public class UsuarioServicio {

    private final UsuarioDAO dao;
    
    public UsuarioServicio(){
        this.dao = new UsuarioDAO();
    }

    public void crearUsuario(String correoElectronico, String clave)throws Exception {
        try {
            //Validamos
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo Electronico");           
            }
            if (correoElectronico.contains("@") == false){
                throw new Exception("El correo electronico es incorrecto");
            }
            if (clave == null || clave.trim().isEmpty()){
                 throw new Exception("Debe indicar una clave");   
            }
            if (clave.length() < 8){
                throw new Exception("La clave no puede tener menos de 8 caracteres");
            }
            if (buscarUsuerioPorCorreoElectronico(correoElectronico) != null){
                throw new Exception("Ya exisite un usuario con el correo Electronico indica" + correoElectronico);
            }
            //Creamos usuario
            Usuario usuario = new Usuario();
            usuario.setCorreoElectronico(correoElectronico);
            usuario.setClave(clave);
            dao.guardarUsusario(usuario);
        } catch (Exception e) {
            throw e;
            
        }
    }
    
    public void modificarClaveUsuario(String correoElectronico, String claveActual, String nuevaClave) throws Exception {
        try {
            if (correoElectronico == null || correoElectronico.trim().isEmpty()){
                throw new Exception("Debe indicar el Usuario");
            }
            if (claveActual == null || claveActual.trim().isEmpty()){
                throw new Exception("Debe indicar clave actual");                        
            }
            if (nuevaClave == null || nuevaClave.trim().isEmpty()){
                throw new Exception("Debe indicar la clave nueva");
            }   
        } catch (Exception e) {
        }
    }
    public void eliminarUsurio(String correoElectronico) throws Exception {
        try {
            if (correoElectronico == null || correoElectronico.trim().isEmpty()){
                throw new Exception("Debe indicar el correo electronico");
            }
            dao.eliminarUsuario(correoElectronico);
            
        } catch (Exception e) {
            throw e;
        }
    }
    public Usuario buscarUsuerioPorCorreoElectronico (String corroElectronico) throws Exception {
        try {
            if (corroElectronico == null || corroElectronico.trim().isEmpty()){
                throw new Exception("Debe indicar un correo Electronico");
            }
            Usuario usuario = dao.buscarUsuarioporCorreoElectronico(corroElectronico);
            return usuario;
        } catch (Exception e) {
            throw e;
        }
    }
    
//    public Usuario buscarUsuarioPorId(Integer id) throws Exception {
//        try {
//            if (id == null){
//                throw new Exception("Debe indicar el id");
//            }
//            Usuario ususrio = dao.bus
//        } catch (Exception e) {
//            throw e;
//        }
    }

    


