package Servicios;

/**
 *
 * @author JoséAgustín
 */

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicios {
Cafetera cafe = new Cafetera();

Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
    public Cafetera llenarCafetera(){
        System.out.println("llene la cafetara");
        System.out.println("La capacidad maxima es: " + cafe.capacidadMaxima);
        System.out.println("La capacidad actual es: " + cafe.capacidadActual);
        cafe.setCapacidadActual(leer.nextInt());

        if (cafe.capacidadMaxima == cafe.capacidadActual) {
            System.out.println("La cafetera esta al maximo " + cafe.capacidadMaxima);

        } else if (cafe.capacidadActual > cafe.capacidadMaxima) {
            System.out.println("Es demasiado, ponga menos");
        } else {
            System.out.println("La cafetera contienen: " + cafe.capacidadActual + "ml de agua");
        }
        return cafe;
    }
   
    public void servirTaza() {
        int taza;
        System.out.println("Ingrese el tamano de la taza en ml");
        taza = leer.nextInt();
        if (cafe.getCapacidadActual()<taza){
        System.out.println("Agua insuficiente, llene la cafetera");
        cafe.capacidadActual += taza;
        }else{
            System.out.println("Preparando cafe......");
        }
        cafe.capacidadActual -= taza;
        System.out.println("Capacidad actual " + cafe.capacidadActual);
    }
    public void vaciarCafetera(Cafetera cafe){
        cafe.setCapacidadActual(0);
        System.out.println("Capacidad actual " + cafe.capacidadActual);
    }
    public void agregarCafe(Cafetera cafe){
        System.out.println("Agregar cafe (kilos) ");
       
        cafe.setCantidadCafe(leer.nextInt());
        System.out.println("La cantidad de cafe disponible es de: " + cafe.getCantidadCafe());
    }
    }


