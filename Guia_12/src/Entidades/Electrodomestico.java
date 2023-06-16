/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double precio, peso;
    protected char consumoEnergetico;
    protected String color;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, double peso, char consumoEnergetico, String color) {
        this.precio = precio;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", consumoEnergetico: " + consumoEnergetico + ", color: " + color + '}';
    }
    

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    public void comprobarConsumoEnergetico(char letra) {

        switch (letra) {
            case 'A':
                consumoEnergetico = 'A';
                break;
            case 'a':
                consumoEnergetico = 'A';
                break;
            case 'B':
                consumoEnergetico = 'B';
                break;
            case 'b':
                consumoEnergetico = 'B';
                break;
            case 'C':
                consumoEnergetico = 'C';
                break;
            case 'c':
                consumoEnergetico = 'C';
                break;
            case 'D':
                consumoEnergetico = 'D';
                break;
            case 'd':
                consumoEnergetico = 'D';
                break;
            case 'E':
                consumoEnergetico = 'E';

                break;
            case 'e':
                consumoEnergetico = 'E';
                break;
            case 'F':
                consumoEnergetico = 'F';
                break;
            case 'f':
                consumoEnergetico = 'F';
                break;
            default:
                System.out.println("El consumo elegido no es valido, se aplicara F por defecto.");
                consumoEnergetico = 'F';
                break;
        }
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    public void comprobarColor(String color1) {
        switch (color1.toLowerCase()) {
            case "blanco":
                color = "blanco";
                break;
            case "negro":
                color = "negro";
                break;
            case "rojo":
                color = "rojo";
                break;
            case "azul":
                color = "azul";
                break;
            case "gris":
                color = "gris";
                break;
            default:
                System.out.println("El color ingresado no es valido, sera blanco por defecto");
                color = "blanco";

        }
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    
    public void crearElectrodomestico() {

        System.out.println("Ingrese el color que desea");
        String color1 = leer.next();
        comprobarColor(color1);
        System.out.println("Ingrese el consumo energetico");
        char letra = leer.next().charAt(0);
        comprobarConsumoEnergetico(letra);
        System.out.println("Ingrese el peso");
        peso=leer.nextDouble();


        /*El precio base es de 1000*/
        precio = 1000;

    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:*/
    
    public double precioFinal() {
        ///Sumar al precio el valor del consumo energetico
        switch (consumoEnergetico) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;

        }

        ///Se le suma el precio segun el peso
        
        if (peso >= 1 && peso <= 19) {
            precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            precio += 500;

        } else if (peso >= 50 && peso <= 79) {
            precio += 800;

        } else if (peso > 80){
            precio+=1000;
        }
        
        return precio;
        
        
    }

}
