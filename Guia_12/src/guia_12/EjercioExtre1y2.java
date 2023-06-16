/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_12;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.Motor;
import Entidades.Velero;
import Entidades.Yate;
import Servicio.AlquilerServicio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EjercioExtre1y2 {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Barco b1;
    Alquiler alquiler;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alquiler a2 = new Alquiler();
        AlquilerServicio a1 = new AlquilerServicio();
        a2 = a1.ingresarAmarre();
        a1.Mostrar(a2);
    }
}
