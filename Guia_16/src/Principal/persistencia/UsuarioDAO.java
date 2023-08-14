package Principal.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import principal.dominio.usuario.Usuario;

public final class UsuarioDAO extends DAO{
    public void guardarUsusario(Usuario usuario) throws Exception{
        try {
            if (usuario ==null){
                throw new Exception("Debe indicar un ususario");
            }
            String sql = "INSERT INTO usuario (correo_electronico, clave)"
                    + "VALUES ( '" + usuario.getCorreoElectronico() + "' , '" + usuario.getClave() + "' );";
          
        } catch (Exception e) {
            throw e;
        }
    }
    public void modificarUsuario(Usuario usuario) throws Exception{
        try {
            if (usuario ==null){
                throw new Exception("Debe indicar el usuario que desea modificar");
            }
            String sql = "UPDATE usuario SET "
                    + "clave = '" + usuario.getClave() + "' WHERE correo_electronico = '" + usuario.getCorreoElectronico() + "' );";
            insertarModificerEliminar(sql);
                
        } catch (Exception e) {
            throw e;
        }
    }
    public void eliminarUsuario(String correoElectronico) throws Exception{
        try {
            String sql = "DELETE FROM usuario WHERE correo_electronico = '" + correoElectronico + "'";
            insertarModificerEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
        
    }    
    public Usuario buscarUsuarioporCorreoElectronico(String correoElectronico) throws Exception{
        try {
            String sql = "SELECT * FROM usuario "
                    + "WHERE correo_electronico = '" + correoElectronico + "'";
            consultarBase(sql);
            
            Usuario usuario = null;
            while (resultado.next()){
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
                
            }
            desconectarBase();
            return usuario;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    public Collection<Usuario> listaUsuario() throws Exception{
        
        try {
            String sql = "SELECT correo_electronico, clave FROM usuario ";
            conectarBase();
            Usuario usuario = null;
            Collection<Usuario> usuarios = new ArrayList();
            while (resultado.next()){
                usuario = new Usuario();
                usuario.setCorreoElectronico(resultado.getString(1));
                usuario.setClave(resultado.getString(2));
                usuarios.add(usuario);
            }
            desconectarBase();
            return usuarios;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    } 
}
