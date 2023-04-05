/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_8_9_10;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    int [][] matriz = new int [4] [4] ;
    for (int f=0 ; f<4 ; f++ ) {
        for (int c=0 ; c<4 ; c++ ) {
            matriz[f][c] = (int) (Math.random() *10);
        }
    }
    for (int f=0 ; f<4 ; f++ ) {
        for (int c=0 ; c<4 ; c++ ) {
            System.out.print("["+matriz[f][c]+"]");  //muesta la matriz
        }
        System.out.println("");
    }
    
     System.out.println("------------------");
        
    for (int c=0 ; c<4 ; c++ ) {
        for (int f=0 ; f<4 ; f++ ) {
            System.out.print("["+matriz[f][c]+"]"); //imprime la traspuesta
        }
        System.out.println("");
    }
    
    }
    
    
}
 