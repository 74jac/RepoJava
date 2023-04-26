/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package dia_3_4_5_ejercicios;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de lados del cuadrado:");
        int num = input.nextInt();
        int num2 = input.nextInt();

for (int j = 1; j <= num; j++) {
            if ((j==1)||(j==num)){
                for (int i = 1; i <= num2; i++) {
                    System.out.print("* ");
                }
                System.out.println("");
            } else {
                System.out.print("* ");
                for (int i = 2; i <= num2 - 1; i++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }
        }
    }
}