/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author JoséAgustín
 */
public class Juego {
    public class JUEGO {
    
    ArrayList<Jugador> jugadores= new ArrayList();
    Revolverdeagua revolvito= new Revolverdeagua();

    public JUEGO() {
    }
    
    
    
    public void llenarJuego(ArrayList<Jugador>js2,Revolverdeagua r2){
        jugadores=js2;
        revolvito=r2;
    }
        
   public boolean ronda(int i){
        boolean juegoSigue = true;
        jugadores.get(i).disparo(revolvito);
        if (jugadores.get(i).isMojado()) {
            juegoSigue=false;
        }
        return juegoSigue;
    }
   
   
            

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolverdeagua getRevolvito() {
        return revolvito;
    }

    public void setRevolvito(Revolverdeagua revolvito) {
        this.revolvito = revolvito;
    }
    
    
    }
}
