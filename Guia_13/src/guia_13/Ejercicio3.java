/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         //CASO A - No hago nada... veo que pasa.
//        int numero1 = 10, numero2 = 0; //Modificar numero2 a cero y ver lo que pasa
//        int resultado = numero1 / numero2;
//        System.out.println("La division es: " + resultado);
//
//        //CASO B - Preveo lo que puede pasar
//        int numero1 = 10, numero2 = 0; //Modificar numero2 a cero y ver lo que pasa
//        try {
//            int resultado = numero1 / numero2;
//            System.out.println("La division es: " + resultado);
//        } catch (ArithmeticException e) {
//            System.out.println("NO SE PUEDE DIVIDIR POR CERO");
//            System.out.println(e.getMessage());
//        } catch (Exception e) { 
//            System.out.println("Aca ocurrio algo que no tuve en cuenta");           
//        } finally {            
//            System.out.println("FIN PROGRAMA");
//        }
//        //CASO C - Ver manejo de que entra un dato Cadena cuando esperaba numero
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese un numero entero");
//        
//        try {
//            int numeroI = leer.nextInt();
//            System.out.println("El numero ingresado es:" + numeroI);
//        } catch (InputMismatchException e) {
//            System.out.println(e.toString() +   " UPS....OCURRIO ALGO INESPERADO");
//        } finally {
//            System.out.println("FIN");
////        }
////    }
//        System.out.println("Intrese un numero: ");
//        String num0 =leer.next();
//        int num = Integer.parseInt(num0);
//        
//        System.out.println("Ingrese otro numero: ");
//        String num1 = leer.next();
//        int num2 = Integer.parseInt(num1);
        //        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        DivisionNumero DN = new DivisionNumero();
//
//        System.out.println("Ingrese el primer numero");
//        String num1 = leer.next();
//        System.out.println("Ingrese el segundo");
//        String num2 = leer.next();
//
//        int numero1AConvertir = 0;
//        int numero2AConvertir = 0;
//        try {
//
//             numero1AConvertir = Integer.parseInt(num1);
//
//             numero2AConvertir = Integer.parseInt(num2);
//
//        } catch (NumberFormatException e) {
//            System.out.println(e.getMessage() + " Ingresaste una letra..");
//           System.out.println("Ingrese el primer numero");
//         num1 = leer.next();
//        System.out.println("Ingrese el segundo");
//        num2 = leer.next();
//        numero1AConvertir = Integer.parseInt(num1);
//
//        numero2AConvertir = Integer.parseInt(num2);
//        
//        }
//
//        try{
//            System.out.println(DN.DivisionNumero(numero1AConvertir, numero2AConvertir));
//       
//    }catch (ArithmeticException a){
//        
//            System.out.println(a + " -----< Division x cero");
//    }
//    }
//}
        Scanner scanner = new Scanner(System.in);
        String a, b;
        int c = 0, d = 0;
        
        System.out.print("Ingrese el primer numero: ");
        a = scanner.nextLine();
        System.out.print("Ingrese el segundo numero: ");
        b = scanner.nextLine();

        try {
            c = Integer.parseInt(a);
            d = Integer.parseInt(b);
            try {
                int division = c/d;

                System.out.print("La division es: ");
                System.out.println(division);
            } catch (Exception e) {
                System.out.println("Error numerico: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error de string: " + e.getMessage());
        }
    }
    }
    
