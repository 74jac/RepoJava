/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_11;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolverdeagua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Jugador> jugadores_ruleta_rusa= new ArrayList();
        
        Juego jueguito= new Juego();
        Revolverdeagua revolver= new Revolverdeagua();
        
        
        int identificador=0;
        
        System.out.println("Se va a iniciar un juego. Seleccione la cantidad de jugadores:");
        int cantidadJugadores = leer.nextInt();
        if (cantidadJugadores<1||cantidadJugadores>6) {
            cantidadJugadores=6;
        }
       
        for (int i = 0; i < cantidadJugadores; i++) {
            
            System.out.println("Ingrese nombre de jugador");
            String nom=leer.next();
            identificador+=1;
            
            
            jugadores_ruleta_rusa.add(new JUGADOR(identificador,nom));
            
            
        }
        
        revolver.llenarRevolver();
        
        
        System.out.println(jugadores_ruleta_rusa.toString());
        System.out.println(revolver.toString());
        
        jueguito.llenarJuego(jugadores_ruleta_rusa, revolver);
        
      
        boolean juegoSigue = true;
        int turno = 0;
        while (juegoSigue) {
            if (turno == (cantidadJugadores)){
                turno = 0;
            }
            System.out.println("El " + jueguito.getJugadores().get(turno).getJugador() + " procede a disparar");
            juegoSigue = jueguito.ronda(turno);
            if (juegoSigue) {
                System.out.println("El " + jueguito.getJugadores().get(turno).getJugador() + " se salva");
            } else {
                System.out.println("El " + jueguito.getJugadores().get(turno).getJugador() + " se pego un corchazo en la cabeza");
                System.out.println("Juego finalizado");
            }
            turno++;
        }
        System.out.println("");
        
    }       
        
        
        
        
        
        
    

