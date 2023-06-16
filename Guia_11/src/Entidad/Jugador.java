/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author JoséAgustín
 */
public class Jugador {
    private int ID;
    private String jugador;
    private boolean mojado;

    public Jugador() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        
        
        this.jugador = jugador;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    
    
    public boolean disparo(Revolverdeagua r)
    { 
        boolean disparo_acertado=false;
        
        disparo_acertado=r.mojar();
        
        if(!disparo_acertado)
            r.siguientechorro();
        
        mojado=disparo_acertado;
        
        return mojado;
        
    }

    public Jugador int ID, String jugador) {
        
        
        this.ID = ID;
        
        
             
        this.jugador = jugador+ID;
      
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", jugador=" + jugador + ", mojado=" + mojado + "}\n";
    }
    
}
