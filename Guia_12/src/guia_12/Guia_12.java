/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_12;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoséAgustín
 */
public class Guia_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Animal> Animales = new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        Animales.add(a);
        Animales.add(b);
        Animales.add(c);
        
        for (Animal aux : Animales) {
            System.out.println("Los animales de la lista son:" + aux.toString());
            aux.hacerRuido();
        }
        
        
        
    }
    
}
