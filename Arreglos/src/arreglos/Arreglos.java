/*
 * Realizar la multiplicación de un vector por una matriz
 * Dado un vector 1xN y una matriz NxM, el resultado es 1xM
 * Ej. vector 1x2 * matriz 2x3 = producto 1x3
 * v=3,5 * m= 4.8.6 = 3*4+5*2,3*8+5*1,3*6+5*7 = 22,29,53
 *            2.1.7
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración y craeción de un vector
        //tipo nombreVector = new tipo(tamaño);
        
        //declaro un arreglo de una dimensión
        int[] vector;
        // crear en memeoria (construir/dimansionar) con el valor por defecto (cero para los enteros)
        vector = new int [2];
        //los dos pasos en una linea
        int[] producto = new int[3];
        //Declaración y creación de matriz
        //tipo [] nombreMatriz = tipo[filas][columnas]
        
        // declaración e inicialización con valore presdeterminados
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};
        
        //declaración y creación de arrglos genericos
        //tipo [][] ...[] nombreArreglo = new tipo[cardinalidad 1][cardinalidad 2]...[cardinalidad N][]
        
        System.out.println("Ingrese los valores del vector de tamaño"+vector.length+":");
        Scanner leer = new Scanner(System.in);
        
        //int = , porque los subindices de los arreglos en java inician en cero
        for (int i = 0; i < vector.length; i++) {
        System.out.println("v["+i+"]=");
        //acceder al valor 1 del vector
        vector[i] = leer.nextInt();   
        }
    //multiplica vector por matriz
    
    int sum;
    // para cada columna de la matriz...
    for (int j = 0; j < matriz[0].length; j++){
        sum = 0;
        //recorro el vector y multiplico
        for (int i = 0; i < vector.length; i++){
            sum += vector[i] * matriz[i][j];
        }
        producto[j] = sum;
    }
    String aux = "";
    //mostrar vector
    System.out.println("* Vector:");
    //bucle for "mejorado" 
    //for (tipo elemento : arreglo)
    for (int elemento: vector) {
        aux = aux + " " + elemento;
    }
    System.out.println("\n* Matriz:");
    //para cada fila de la matriz
    for (int[] fila : matriz){
        aux = "";
        //para cada elemento de la fila
        for (int elemento: fila){
        }
        System.out.println(aux);
        
        //mostrar resultado
        aux = "";
        System.out.println("\n* Vector x Matriz");
        for (int elemento: producto){
            aux += " " + elemento;
        }
        System.out.println(aux);
    }
}
}    