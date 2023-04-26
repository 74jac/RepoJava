/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8;
import Servicios.CuentaBancariaServicios;
import Entidades.CuentaBancaria;
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
 
        Scanner kmo = new Scanner(System.in).useDelimiter("\n");
        CuentaBancaria cb = new CuentaBancaria();
        CuentaBancariaServicios cbs = new CuentaBancariaServicios();

        int Opcion = 0;

        System.out.println("   crear cuenta");
        cbs.crearCuenta();
        String salir = "si";

        do {
            System.out.println("que operacion desea realisar");
            System.out.println("");

            System.out.println("    1)_ Ingresar dinero");

            System.out.println("    2)_ Retirar dinero");

            System.out.println("    3)_ Extraccion rapida");

            System.out.println("    4)_ Consulta De Saldo");

            System.out.println("    5)_ Consultar Datos");

            System.out.println("    6)_ Salir");

            Opcion = kmo.nextInt();

            switch (Opcion) {

                case 1:
                    cbs.ingresar(Opcion);
                    break;

                case 2:
                    cbs.retirar(Opcion);
                    break;
                case 3:
                    cbs.extracionRapida();
                    break;
                case 4:
                    cbs.consultaSaldo();
                    break;
                case 5:
                    cbs.consultarDatos();
                    break;
                case 6:
                    System.out.println("desea continuar? SI/NO");
                    salir = kmo.next();
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
