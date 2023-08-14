/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JoséAgustín
 */
public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASS = "root";
    private final String DATABASE = "perros";
    private final String DRIVER = "con.mysql.jdbc.Driver";
    
    protected void conectarBase() throws Exception{
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?userSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } 
    }
    protected void desconectarBase() throws Exception {
            try {
                if (resultado != null){
                    resultado.close();
                }
                if (sentencia !=null) {
                    sentencia.close();
                }
                if (conexion !=null) {
                    conexion.close();
                }
                
            } catch (Exception e) {
                throw e;
            }
    }    
    protected void insertarModificerEliminar(String sql) throws Exception {
        
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
                    
        } catch (SQLException | ClassNotFoundException ex) {
            //conexion.rollback();
            /*
            Descomentar la linea anteriror si desean tener en cuenta el rollback.
            Correr el siguiente script en Workbench
                    
                    SET autocommit=1;
                    COMMIT;
                    
                    **Sin rollback igual anda
                */
            throw ex;
        } finally {
        desconectarBase();
        }   
    }
    protected void consultarBase(String sql) throws Exception {
        try {
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException ex) {
            throw ex;
        }

        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
