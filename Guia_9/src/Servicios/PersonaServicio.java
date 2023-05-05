/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class PersonaServicio {
     Scanner input = new Scanner(System.in);
    public Persona crearPersona(){
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        p1.setNombre(input.next());
        System.out.println("Ingrese el dia de nacimiento: ");
        int dia= input.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes= input.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int anio= input.nextInt();
        
        Date fecha =new Date(anio-1900,mes-1,dia);
        p1.setNacimiento(fecha);
      
        return p1;
        
        
        }
    public int edad(Date fecha){
        
            Date hoy= new Date();
        int result =(hoy.getYear() - fecha.getYear()); 
        
        if (fecha.getMonth()>hoy.getMonth()) {
              result=result-1;
        }
        
        return result;
        }    
    
    public boolean menorQue (Persona p1, int result){
        System.out.println("Indique la edad a consultar: ");
        int consulta = input.nextInt();
        boolean menor=false; 
        
        if (consulta < result) {
            return true;
        }
        return menor;
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println("Nombre" + p1.getNombre());
        System.out.println("fecha de nacimiento" + p1.getNacimiento());
    }
    
     
}
