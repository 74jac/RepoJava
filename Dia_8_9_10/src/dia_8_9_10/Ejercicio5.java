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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N = 3 ;
        int[][] matriz = new int[N][N];
        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {
                System.out.println("Ingrese el valor de matriz[" + f + "," + c + "]");
                matriz[f][c] = leer.nextInt();
            }
        }
        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {
                System.out.print("[" + matriz[f][c] + "]");  //muesta la matriz
            }
            System.out.println("");
        }
        System.out.println("------------------");

        for (int c = 0; c < N; c++) {
            for (int f = 0; f < N; f++) {
                System.out.print("[" + matriz[f][c] + "]"); //imprime la traspuesta
            }
            System.out.println("");
        }
        System.out.println("Que su matriz sea antisimetria es: "+verAntisimetrica(matriz,N) );
    }

    public static boolean verAntisimetrica(int[][] matriz,int N) {
      int aux=0 ;  
    
      for (int f=0 ; f<N ; f++ ) {
        for (int c=0 ; c<N ; c++ ) {                  
          if(matriz[f][c]+matriz[c][f]==0) {
            aux++ ; 
        }
        }    
      }
      return(aux==N*N) ;
    }
}
   
