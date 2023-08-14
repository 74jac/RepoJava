/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import Entidades.Fabricante;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.eclipse.persistence.internal.oxm.Constants.UUID;

/**
 *
 * @author JoséAgustín
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TiendaPU");
        EntityManager em = emf.createEntityManager();
        
        Fabricante f1 = new Fabricante();
//        f1.setId(UUID.randomUUID.toString());
        f1.setCodigo(1);
        f1.setNombre("Asus");
        
        em.getTransaction().begin();
        em.persist(f1);
        em.getTransaction().commit();
        
                
        
    }
    
}
