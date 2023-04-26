/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8;


import Entidades.Cafetera;
import Servicios.CafeteraServicios;
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
        Cafetera cafe = new Cafetera();
        CafeteraServicios cfs = new CafeteraServicios();
        String salir = "si";        

        int Opcion = 0;
        do {
            System.out.println("Seleccione una opcion");
            System.out.println("");

            System.out.println("    1)_ Llenar cafetera");

            System.out.println("    2)_ Servir taza");

            System.out.println("    3)_ Vaciar cafetera");

            System.out.println("    4)_ Agregar cafe");

            System.out.println("    5)_ Salir");

            Opcion = leer.nextInt();

            switch (Opcion) {

                case 1:
                    cfs.llenarCafetera();
                    break;

                case 2:
                    cfs.servirTaza();
                    break;
                case 3:
                    cfs.vaciarCafetera(cafe);
                    break;
                case 4:
                    cfs.agregarCafe(cafe);
                    break;
                case 5:
                    System.out.println("desea continuar? SI/NO");
                    salir = leer.next();
                    if ("no".equalsIgnoreCase(salir)) {
                        System.out.println("hasta luego gracias");

                    } else {
                        System.out.println("gracias por elegirnos");
                    }
                    break;
                default:
                    System.out.println("no ha ingresado una Opcion valida");

            }

        } while ("si".equalsIgnoreCase(salir));
    }
}
    
    

