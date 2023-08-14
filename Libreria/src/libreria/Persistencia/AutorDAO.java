/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.Persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Entidades.Autor;



/**
 *
 * @author JoséAgustín
 */
public class AutorDAO {

    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("LibreriaPU");
    private EntityManager em = EMF.createEntityManager();
    
    public void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }

    public void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    public void guardar(Autor autor){
        conectar();
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
        desconectar();
    }

    public void eliminar(Autor autor){
        conectar();
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
        desconectar();
    }

    public void editar(Autor autor){
        conectar();
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Autor buscarPorNombre(String nombre) throws Exception {
        conectar();
        Autor autor = em.find(Autor.class, nombre);
        desconectar();
        return autor;
    }

    public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> direcciones = em.createQuery("SELECT d FROM Autor d")
                .getResultList();
        desconectar();
        return direcciones;
    }
}
    
    
  