/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Hotel4E;
import Entidades.Hotel5E;
import Entidades.Hoteles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class HotelService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Hoteles> listaHoteles = new ArrayList();

    public ArrayList<Hoteles> listadoHoteles() {
        Hoteles h = new Hoteles(10, 20, 2, 50, "Hotel del plata", "Irigoyen 1020", "Punta del Este", "Sr. Cosme Fulanito");
        Hotel4E h41 = new Hotel4E(30, "A", "El campeon", 20, 35, 3, 50, "Bariloche", "Meeks 1234", "Punta del Este", "Sra. Lola Pallooza");
        Hotel4E h42 = new Hotel4E(50, "B", "Babilonia", 20, 35, 4, 50, "Hechizo", "Emilio Castro 1990", "Punta del Este", "Sr. Extralapaquetel");
        Hotel4E h43 = new Hotel4E(100, "A", "Sugar", 30, 40, 5, 50, "Casacablanca", "Ventura Bustos 1984", "Punta del Este", "Sr. Aquiles Bailo");
        Hotel5E h51 = new Hotel5E(1, 2, 8, 30, "B", "Delicius", 30, 40, 6, 50, "Hilton", "Murature 1992", "Punta del Este", "Sr. Fernando Grandote");
        Hotel5E h52 = new Hotel5E(2, 4, 10, 50, "A", "Lumiere", 40, 55, 8, 50, "Luxury", "Pastor Obligado 2030", "Punta del Este", "Sr. Federico Moura");
        Hotel5E h53 = new Hotel5E(3, 5, 15, 100, "A", "Pascali", 50, 75, 16, 50, "Plaza", "Callao 666", "Punta del Este", "Sr. Freddie Mercury");

        listaHoteles.add(h);
        listaHoteles.add(h41);
        listaHoteles.add(h42);
        listaHoteles.add(h43);
        listaHoteles.add(h51);
        listaHoteles.add(h52);
        listaHoteles.add(h53);
      

        return listaHoteles;

    }

    public ArrayList<Hoteles> calcularPrecio() {
        int valorGim = 0;
        int valorRest = 0;
        int valorLimo = 0;
        for (Hoteles aux : listaHoteles) {

            if (aux instanceof Hoteles) {
                // Object object = (Object) aux;
                aux.setPrecioHabitacion(aux.getPrecioHabitacion() + aux.getNumCamas());
                continue;
            }

            if (aux instanceof Hotel4E) {
                //Object object = (Object) aux;
                if (((Hotel4E) aux).getGimnasio().equalsIgnoreCase("A")) {
                    valorGim = 50;
                } else if (((Hotel4E) aux).getGimnasio().equalsIgnoreCase("B")) {
                    valorGim = 30;
                }
                if (((Hotel4E) aux).getCapacidadRestaurante() < 30) {
                    valorRest = 10;
                } else if (((Hotel4E) aux).getCapacidadRestaurante() > 30 && ((Hotel4E) aux).getCapacidadRestaurante() < 50) {
                    valorRest = 30;
                } else if (((Hotel4E) aux).getCapacidadRestaurante() > 50) {
                    valorRest = 50;
                }
                aux.setPrecioHabitacion(aux.getPrecioHabitacion() + aux.getNumCamas() + valorGim + valorRest);

            }

            if (aux instanceof Hotel5E) {
                //Object object = (Object) aux;
                if (((Hotel5E) aux).getGimnasio().equalsIgnoreCase("A")) {
                    valorGim = 50;
                } else if (((Hotel5E) aux).getGimnasio().equalsIgnoreCase("B")) {
                    valorGim = 30;
                }
                if (((Hotel5E) aux).getCapacidadRestaurante() < 30) {
                    valorRest = 10;
                } else if (((Hotel5E) aux).getCapacidadRestaurante() > 30 && ((Hotel5E) aux).getCapacidadRestaurante() < 50) {
                    valorRest = 30;
                } else if (((Hotel5E) aux).getCapacidadRestaurante() > 50) {
                    valorRest = 50;
                }
                aux.setPrecioHabitacion(aux.getPrecioHabitacion() + aux.getNumCamas() + valorGim + valorRest + (((Hotel5E) aux).getCantLimosinas() * 15));
            }

        }

        return listaHoteles;

    }

    public void mostrarLista() {
        System.out.println("Los hoteles disponibles son: ");
        for (Hoteles aux : listaHoteles) {
            System.out.println(aux);
        }
    }

    public void ordenarHoteles() {

        Comparator<Hoteles> mayorAmenor = new Comparator<Hoteles>() {
            public int compare(Hoteles h1, Hoteles h2) {
                return Double.compare(h2.getPrecioHabitacion(), h1.getPrecioHabitacion());
            }
        };
        
        Collections.sort(listaHoteles, mayorAmenor);
        mostrarLista();

    }

}
