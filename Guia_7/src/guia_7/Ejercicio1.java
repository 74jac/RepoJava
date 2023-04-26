/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import Ejerciciopoo.libro.Libro;
import java.util.Scanner;


/**
 *
 * @author JoséAgustín
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una clase llamada Libro que contenga los
        siguientes atributos: ISBN, Título, Autor, 
        Número de páginas, y un constructor con todos
        los atributos pasados por parámetro y un constructor
        vacío. Crear un método para cargar un libro pidiendo 
        los datos al usuario y luego informar mediante otro método 
        el número de ISBN, el título, el autor del libro y el número 
        de páginas.*/


Scanner leer = new Scanner(System.in);
Libro nuevoLibro = new Libro();
Libro nuevoLibro1 = new Libro(1234, "El barco nadando en frases", "Marcos Pilaze", 256);
        System.out.println("Ingrese el ISBN del libro");
        nuevoLibro.ISBN = leer.nextLong();
        System.out.println("Ingrese el Titulo del libro");
        nuevoLibro.Titulo = leer.next();
        System.out.println("Ingrese el Nombre del - AUTOR' - del libro");
        nuevoLibro.Autor = leer.next();
        System.out.println("Ingrese el las Cantidades de paginas del libro");
        nuevoLibro.NumeroPaginas = leer.nextInt();

        System.out.println("El numero identificador del libro, ISBN es " + nuevoLibro.ISBN
                + ", EL titulo del libor es " + nuevoLibro.Titulo + ", EL nombre del Autor es "
                + nuevoLibro.Autor + ", Y la cantidad de paginas es "
                + nuevoLibro.NumeroPaginas);

        System.out.println("El numero identificador del libro, ISBN es "
                + nuevoLibro1.ISBN + ", EL titulo del libor es " + nuevoLibro1.Titulo
                + ", EL nombre del Autor es " + nuevoLibro1.Autor + ", Y la cantidad de paginas es "
                + nuevoLibro1.NumeroPaginas);

    }
    
}     
