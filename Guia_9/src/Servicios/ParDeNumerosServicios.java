/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author JoséAgustín
 */
public class ParDeNumerosServicios {
   ParDeNumeros n = new ParDeNumeros();

    public void Mostrar() {
        System.out.println("Numero 1 :" + n.getNum1());
        System.out.println("Numero 2 : " + n.getNum2());
    }

    public void DevolverMayor() {
        if (n.getNum1() > n.getNum2()) {
            System.out.println("El mayor numero es: " + n.getNum1());
        } else {
            System.out.println("El mayor numero es: " + n.getNum2());
        }
    }

    public void CalcularPotencia() {
        double mayor = Math.max(n.getNum1(), n.getNum2());
        double menor = Math.min(n.getNum1(), n.getNum2());
        System.out.println("La potencia del mayor valor, " + mayor + " elevado a " + menor + " es: " + Math.pow(mayor, menor));
    }

    public void CalcularRaiz() {
        double mayor = Math.max(n.getNum1(), n.getNum2());
        double menor = Math.min(n.getNum1(), n.getNum2());
        System.out.println("La raiz cuadrada del menor valor: "+menor+" es "+Math.sqrt(menor));
    }
} 

