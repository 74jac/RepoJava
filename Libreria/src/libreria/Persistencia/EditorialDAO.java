/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Entidades.Autor;
import libreria.Entidades.Editorial;

/**
 *
 * @author JoséAgustín
 */
public class EditorialDAO {
    
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

    public void guardar(Editorial editorial){
        conectar();
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
        desconectar();
    }

    public void eliminar(Editorial editorial){
        conectar();
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
        desconectar();
    }

    public void editar(Editorial editorial){
        conectar();
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
        desconectar();
    }
}
