/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author JoséAgustín
 */
public class Gato extends Animal {
    
        @Override
    public void hacerRuido(){
        System.out.println("Miauuuu");
    }

    @Override
    public String toString() {
        return "Gato{" + '}';
    }
    
}
