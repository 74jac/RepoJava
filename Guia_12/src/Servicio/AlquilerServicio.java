/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.Motor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class AlquilerServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Barco b1;
    Alquiler alquiler;

    public Alquiler ingresarAmarre() {

        Alquiler alquiler = new Alquiler();
        System.out.println("  -Ingresando alquiler-  ");
        System.out.println("Nombre: ");
        alquiler.setNombre(sc.next());
        System.out.println("DNI: ");
        alquiler.setDNI(sc.nextLong());
        System.out.println("Ingrese fecha de inicio: ");
        String fechaInicio = sc.next();
        alquiler.setFechaAlquiler(LocalDate.parse(fechaInicio, formatter));
        System.out.println("Ingrese fecha de devolucion: ");
        String fechaDevolucion = sc.next();
        alquiler.setFechaAlquiler(LocalDate.parse(fechaDevolucion, formatter));
        alquiler.setBarco(IngresarBarco());
        return alquiler;// Returna el alquiler con un barco ingresado para guardarlo en una coleccion.
    }

    public Barco IngresarBarco() {

        System.out.println("Ingrese que tipo de barco es: ");
        System.out.println("1 - Velero.");
        System.out.println("2 - Barco a motor.");
        System.out.println("3 - Yates de lujo.");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("-VELERO-");
                Velero v1 = new Velero();
                System.out.println("Ingrese Matricula: ");
                v1.setMatricula(sc.nextInt());
                System.out.println("Ingrese eslora: ");
                v1.setEslora(sc.nextInt());
                System.out.println("Ingrese año de fabricacion");
                v1.setAñoFabricacion(sc.nextInt());
                System.out.println("Ingrese cantidad de mastiles: ");
                v1.setCantMastiles(sc.nextInt());
                b1 = v1;
                break;
            case 2:
                System.out.println("-BARCO A MOTOR-");
                Motor m1 = new Motor();
                System.out.println("Ingrese Matricula: ");
                m1.setMatricula(sc.nextInt());
                System.out.println("Ingrese eslora: ");
                m1.setEslora(sc.nextInt());
                System.out.println("Ingrese año de fabricacion");
                m1.setAñoFabricacion(sc.nextInt());
                System.out.println("Ingrese potencia CV: ");
                m1.setCv(sc.nextInt());
                b1 = m1;
                break;
            case 3:
                System.out.println("-YATE-");
                Yate y1 = new Yate();
                System.out.println("Ingrese Matricula: ");
                y1.setMatricula(sc.nextInt());
                System.out.println("Ingrese eslora: ");
                y1.setEslora(sc.nextInt());
                System.out.println("Ingrese año de fabricacion");
                y1.setAñoFabricacion(sc.nextInt());
                System.out.println("Ingrese potencia CV: ");
                y1.setCv(sc.nextInt());
                System.out.println("Ingrese cantidad de camarotes: ");
                y1.setCantCamarotes(sc.nextInt());
                b1 = y1;
                break;
            case 4:
            default:
        }

        return b1;
    }
    
    public void Mostrar(Alquiler alquiler) {
        b1 = alquiler.getBarco();
        System.out.println("Precio de alquiler: "+b1.calcularAlquiler());
    }
}
