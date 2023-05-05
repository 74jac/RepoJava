/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

        
/**
 *
 * @author JoséAgustín
 */
public class FechaService {
    
    
    Scanner scan = new Scanner(System.in);

public Date fechaNacimiento(){
        System.out.println("Ingrese el dia de su nacimiento");
        int dia = scan.nextInt();

        System.out.println("Ingrese el mes de su nacimiento");
        int mes = scan.nextInt();

        System.out.println("Ingrese el año de su nacimiento");
        int anio = scan.nextInt();

        Date fecha = new Date(anio-1900, mes-1,dia);
     
        
        return fecha;  
        
    }

public Date fechaActual(){
    
    
    return new Date();
    

}        
public int diferencia(Date fechaActual, Date fechaNacimiento) {
        int diferencia = fechaActual.getYear() - fechaNacimiento.getYear();
        Calendar calNacimiento = Calendar.getInstance();
        calNacimiento.setTime(fechaNacimiento);
        if (fechaNacimiento.getMonth() > fechaActual.getMonth()) {
            diferencia--;

        }else if (fechaNacimiento.getMonth() == fechaActual.getMonth()){
            if (fechaNacimiento.getDay() > fechaActual.getDay()) {
            diferencia--;
        }
        }
        return diferencia;
    }
    
    
}
