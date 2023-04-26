/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raiz;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Me
 */
public class ServiciosRaiz {
    
    
    public Raiz CrearRaiz() {
        Scanner sc = new Scanner(System.in);
        Raiz r = new Raiz();
        System.out.println("ingresar A");
        r.setA(sc.nextDouble());
        System.out.println("ingresar B");
        r.setB(sc.nextDouble());
        System.out.println("ingresar C");
        r.setC(sc.nextDouble());
        return r;
    }

    public double getDiscriminante(Raiz r) {
        return pow(r.getB(), 2) - 4 * r.getA() * r.getC();
    }

    public boolean tieneRaices(Raiz r) {
        return getDiscriminante(r) >= 0;
    }

    public boolean tieneRaiz(Raiz r) {
        return getDiscriminante(r) == 0;
    }

    public void obtenerRaices(Raiz r) {
        double raiz1 = (-r.getB() + Math.sqrt(pow(r.getB(), 2) - (4 * r.getA() * r.getC()))) / (2 * r.getA());// raiz1 = +
        double raiz2 = (-r.getB() - Math.sqrt(pow(r.getB(), 2) - (4 * r.getA() * r.getC()))) / (2 * r.getA());// raiz2 = -

        if (raiz1 == raiz2) {
            System.out.println("Tiene una sola raiz : " + raiz1);   
        } else {
            System.out.println("Tiene dos raices:");
            System.out.println("Raiz 1 = " + raiz1);
            System.out.println("Raiz 2 = " + raiz2);
        }
    }

    public void obtenerRaiz(Raiz r) {
        tieneRaiz(r);
        if (tieneRaiz(r) == true) {
            double raizUnica = (double) ((-r.getB() + Math.sqrt(pow(r.getB(), 2) - (4 * r.getA() * r.getC()))) / (2 * r.getA()));
            System.out.println("Tiene unica raiz: " + raizUnica);
        }
    }

    public void calcular(Raiz r) {
        tieneRaices(r);
        tieneRaiz(r);
        obtenerRaices(r);
        obtenerRaiz(r);
    }
}
