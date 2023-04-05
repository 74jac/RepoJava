/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine si 
este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package dia_8_9_10;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
        int N = 3;
        int[][] matriz = new int[N][N];
        System.out.println("Ingrese valores magicos:");
        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {
                System.out.print("[" + f + "," + c + "]:");
                matriz[f][c] = leer.nextInt();
            }
        }
       if (ComprobarFilas(matriz, N) && ComprobarColumnas(matriz,N) && ComprobarDiagonales(matriz,N)) {
           System.out.println("Su matriz rebosa de MAGIAAAAA");
       }else {
           System.out.println("Su matriz es carente de magia :( ");
       }
    }

    public static boolean ComprobarFilas(int[][] matriz, int N) {
        int[] vectorSumaFila = new int[N];
        int suma = 0;
        boolean filasMagicas = false;

        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {        //se suma cada fila y se guarda en un vector los resultados
                suma += matriz[f][c];
            }
            vectorSumaFila[f] = suma;
            suma = 0;
        }
        
        for (int i = 0; i < N; i++) {
            if (vectorSumaFila[0] == vectorSumaFila[i]) {
                filasMagicas = true;
            } else {
                filasMagicas = false;
            }
        }
        return (filasMagicas);
    }

    public static boolean ComprobarColumnas(int[][] matriz, int N) {
        int[] vectorSumacolumna = new int[N];
        int suma = 0;
        boolean columnasMagicas = false;

        for (int c = 0; c < N; c++) {
            for (int f = 0; f < N; f++) {        //se suma cada columnas y se guarda en un vector los resultados
               suma += matriz[f][c];
            }
            vectorSumacolumna[c] = suma;
            suma = 0;
        }
        for (int i = 0; i < N; i++) {
            if (vectorSumacolumna[0] == vectorSumacolumna[i]) {
                columnasMagicas = true;
            } else {
                columnasMagicas = false;
            }
        }
        return (columnasMagicas);
    }

    public static boolean ComprobarDiagonales(int[][] matriz, int N) {
        boolean diagonalesMagicas = false  ;
        int suma1 = 0 , suma2 =0 ;
         int aux = N-1 ;
        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {
                if (f == c) {
                 suma1 += matriz[f][c];
                }
            }
        }
        for (int f=0 ; f<N ; f++){
            suma2 += matriz[f][aux] ;
            aux = aux-1 ;
        }  
        if (suma1==suma2) {
            diagonalesMagicas = true ;
        }else {
            diagonalesMagicas = false ;
        }
        return (diagonalesMagicas);
    }
}
 
