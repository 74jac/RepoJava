/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author JoséAgustín
 */
public class ArregloServicio {
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
