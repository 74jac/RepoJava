/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package dia_3_4_5_ej_extra;

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
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10");
        int num = leer.nextInt();
        String NumRomanos = " ";

        switch (num) {
            case 1:
                NumRomanos = "I";
                break;
            case 2:
                NumRomanos = "II";
                break;
            case 3:
                NumRomanos = "III";
                break;
            case 4:
                NumRomanos = "IV";
                break;
            case 5:
                NumRomanos = "V";
                break;
            case 6:
                NumRomanos = "VI";
                break;
            case 7:
                NumRomanos = "VII";
                break;
            case 8:
                NumRomanos = "VIII";
                break;
            case 9:
                NumRomanos = "IX";
                break;
            case 10:
                NumRomanos = "X";
                break;

            default:
                System.out.println("El numero ingresado es incorrecto");
                break;
        }

        System.out.println("El numero romano es: " + NumRomanos);
    }
    
}
