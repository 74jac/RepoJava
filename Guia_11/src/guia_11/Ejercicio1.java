/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_11;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);

        Persona p = new Persona();
        ArrayList<Persona> pe = new ArrayList();
        ArrayList<Persona> per = new ArrayList();

        int c = 0;
        do {
            System.out.println("Ingrese el nombre del dueño");
            p.setNombre(leer.next());
            System.out.println("Ingrese el apellido del dueño");
            p.setApellido(leer.next());
            System.out.println("Ingrese el edad  del dueño");
            p.setEdad(leer.nextInt());
            System.out.println("Ingrese el dni del dueño");
            p.setDocumento(leer.nextInt());

            per.add(p);
            p.setPersona(per);

            c++;
        } while (c < 2);

        for (Persona aux : per) {
            System.out.println(aux);
        }
        ;
    }
    
}
