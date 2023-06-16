/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.AlojamientoExtrahotelero;
import Entidades.Camping;
import Entidades.Residencia;
import java.util.ArrayList;

/**
 *
 * @author Karen
 */
public class ExtraHoteleroService {
    ArrayList<AlojamientoExtrahotelero> listaExtraHoteleros = new ArrayList();
    
    public ArrayList<AlojamientoExtrahotelero> listaExtraHoteleros(){
        
        Camping c1 = new Camping(4, 2, true, "No", 1000, "Aca", "Aconcagua 1320", "Tigre","Sra. Maria Fuentes");
        Camping c2 = new Camping(8, 4, false, "Si", 2000, "Zoeva", "Anaconda 354", "Tigre", "Sr. Han Solo");
        Camping c3 = new Camping(12, 6, true, "Si", 3000, "El rio", "Cañuelas 1478", "Tigre", "Sr. Adolfo Dominguez");
        Residencia r1 = new Residencia(4, true, false, "No", 2000, "La paz", "Serrito 7896", "Tigre", "Sra. Jannis Jopplin");
        Residencia r2 = new Residencia(12, false, true, "Si", 6000, "Heredia", "Hidalgo 2357", "Tigre", "Sr. Gustavo Cerati");
        Residencia r3 = new Residencia(20, true, true, "Si", 10000, "Las cabañas", "Villanueva 5687", "Tigre", "Sr. Gerardo Rozin");
        
        listaExtraHoteleros.add(c1);
        listaExtraHoteleros.add(c2);
        listaExtraHoteleros.add(c3);
        listaExtraHoteleros.add(r1);
        listaExtraHoteleros.add(r2);
        listaExtraHoteleros.add(r3);
        

        return listaExtraHoteleros;
    }
    
    public void mostrarLista(){
        for (AlojamientoExtrahotelero listaExtraHotelero : listaExtraHoteleros) {
            System.out.println(listaExtraHotelero);
            
        }
    }
    
    public void tieneResto(){
        System.out.println("Los campings con restaurante son: ");
        for (AlojamientoExtrahotelero lista : listaExtraHoteleros) {
            if (lista instanceof Camping) {
                if(((Camping) lista).getRestaurant())
                    System.out.println(lista);
                
            }
        }
    }
    
    public void tieneDescuento(){
        System.out.println("Las residencias con descuento son: ");
        for (AlojamientoExtrahotelero aux : listaExtraHoteleros) {
            if (aux instanceof Residencia) {
               if(((Residencia) aux).isDescuentoAgremios())
                    System.out.println(aux);
                
            }
            
        }
    }
    
}
