/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Entidades.Libro;

/**
 *
 * @author JoséAgustín
 */
public class LibroDAO {
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

    public void guardar(Libro libro){
        conectar();
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
        desconectar();
    }

    public void eliminar(Libro libro){
        conectar();
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
        desconectar();
    }

    public void editar(Libro libro){
        conectar();
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
        desconectar();
    }
    public Libro buscarPorIsbn(String Isbn) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, Isbn);
        desconectar();
        return libro;
    }
    public Libro buscarPorTitulo(String titulo) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, titulo);
        desconectar();
        return libro;
    }
}
