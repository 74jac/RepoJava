/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class CadenaServicios {
    Scanner leer = new Scanner(System.in);
    Cadena c = new Cadena();

    public void mostrarVocales() {
        System.out.println("Ingrese una frase");
        c.setFrase(leer.nextLine());
        c.setLongitud(c.getFrase().length());

        int contador = 0;

        for (int i = 0; i < c.getLongitud(); i++) {
            char letra = c.getFrase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;

            }

        }
        System.out.println("La cantidad de vocales es " + contador);
    }

    public void invertirFrase() {

        String fraseInvertida = "";
        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += c.getFrase().charAt(i);

        }
    
        System.out.println("La frase invertida es " + fraseInvertida);
    }
    

    public void vecesRepetido() {

        System.out.println("Ingrese letra a buscar");
        String letra = leer.nextLine();
        int aux = c.getFrase().indexOf(letra);
        int contador = 0;

        while (aux != -1) {
            contador++;
            aux = c.getFrase().indexOf(letra, aux + 1);
        }

        System.out.println("La cantidad de " + letra + " es " + contador);
    }

    public void compararLongitud(){
        System.out.println("Ingrese una nueva frase para comparar");
        String frase1 = leer.nextLine();
        if (frase1.length() > c.getLongitud()) {
            System.out.println("La nueva frase es más larga");
            
        }
        else{
            System.out.println("La nueva frase es mas corta");
        }
    }
    public void unirFrases(){
        System.out.println("Ingrese otra nueva frase para combinar");
        String frase2 = leer.nextLine();
        String concatenar = c.getFrase().concat(" " + frase2);
        System.out.println("Las frases unidas forman " + concatenar);
    }
    public void reemplazar(){
        System.out.println("ingrese el caracter por el cual desea reemplazar la letra a");
        String re = leer.next();
        System.out.println("la frase queda de la siguiente manera: " + c.getFrase().replace("a", re));
        System.out.println("");
    }
    
    public boolean contiene() {
        System.out.println("ingresa una letra a comparar en la frase");
        char cf = leer.next().charAt(0);
        for (int i = 0; i < c.getFrase().length(); i++) {
            if (cf == (c.getFrase().charAt(i))) {
                return true;
            }
        }
        return (false);
        }
    
}
    

