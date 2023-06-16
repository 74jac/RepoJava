/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author JoséAgustín
 */
public class Revolverdeagua {
    private int posicion_actual, posicion_actual_Agua;

    public Revolverdeagua() {
       
        
    }

    public void llenarRevolver()
    {
        int posicion_tambor, posicion_cargado_tambor;
        
        posicion_actual= new Random().nextInt(7);
        posicion_actual_Agua= new Random().nextInt(7);
    }
    
    public boolean mojar()
    {
        boolean acierto;
        if(posicion_actual==posicion_actual_Agua)
            acierto=true;
        else
            acierto=false;
        
        return acierto;
        
        
    }
    
    public int siguientechorro()
    {
        if(posicion_actual==6)
            posicion_actual=1;
        else
             posicion_actual+=1;
                     
        return posicion_actual;
    
    }

    @Override
    public String toString() {
        return "Revolverdeagua{" + "posicion_actual=" + posicion_actual + ", posicion_actual_Agua=" + posicion_actual_Agua + '}';
    }

    public int getPosicion_actual() {
        return posicion_actual;
    }

    public void setPosicion_actual(int posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public int getPosicion_actual_Agua() {
        return posicion_actual_Agua;
    }

    public void setPosicion_actual_Agua(int posicion_actual_Agua) {
        this.posicion_actual_Agua = posicion_actual_Agua;
    }
    
    
}
