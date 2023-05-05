/*Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo 
B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.*/
package servicio;

import java.util.Arrays;

/**
 *
 * @author Jonatan
 */
public class ArregloService {

    public void inicializarA(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
        }

    }

    public void mostrar(double[] a) {
        System.out.println(Arrays.toString(a));
    }

    public void ordenar(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * -1;
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * -1;
        }
    }

    public void inicializarB(double[] a, double[] b) {
        System.arraycopy(a, 0, b, 0, 10);
        Arrays.fill(b, 9, 19, 0.5);
        // Arrays.fill(b,b.length / 2, b.length, 0.5); 
    }

}
