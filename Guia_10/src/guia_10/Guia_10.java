/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;


import Entidades.Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author JoséAgustín
 */
public class Guia_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listado = new ArrayList();
        int x=20;
        int y=30;
        int z=40;
        int r=50;
        int s=60;
        listado.add(x);
        listado.add(y);
        listado.add(z);
        listado.add(r);
        listado.add(s);
        System.out.println(listado);
               
        
        
        TreeSet<String> personaA= new TreeSet();
        String e = "Pepe";
        String t = "juan";
        String u = "sofia";
        String i = "juan";
        String o = "Pepe";


        
        personaA.add(e);
        personaA.add(t);
        personaA.add(u);
        personaA.add(i);
        personaA.add(o);


        System.out.println(personaA);
        
        
        HashMap<Integer, String> personas = new HashMap();
       int dni = 24247525;
       String nombre="pepe";
       personas.put(dni, nombre);
       int dni2=4565455;
       String nombre2="josefa";
       personas.put(dni2, nombre2);
        System.out.println(personas);
        
     /* Toma la Lista, el Conjunto y el Mapa que hiciste previamente y 
    elimina en cada uno un objeto de
cada forma que aprendiste arriba.*/   
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n") ;
      
        ArrayList<String> listado = new ArrayList<>();
        System.out.println("Agregar objetos a Lista");
        listado.add("a");
        listado.add("d");
        listado.add("c");
        listado.add("d");
        listado.add("e");
        System.out.println(listado.toString());
        System.out.println("Remover elementos de Lista");
        listado.remove("d");
        listado.remove(0);
        System.out.println(listado.toString());
        System.out.println("Recorrer Lista");
        for (String lista : listado) {
            System.out.print("[ "+lista+" ]");
        }
        System.out.println("");
        
        System.out.println("---");
        TreeSet<String> pedidos = new TreeSet();
        System.out.println("Agregar Objetos a Conjunto");
        pedidos.add("z");
        pedidos.add("y");
        pedidos.add("x");
        pedidos.add("w");
        pedidos.add("x");
        System.out.println(pedidos.toString());
        System.out.println("Remover elemento de Conjunto");
        pedidos.remove("x");
        System.out.println(pedidos.toString());
        System.out.println("Recorrer Conjunto");
        for (String bebida : pedidos) {
            System.out.print("[ "+bebida+" ]");
        }
        System.out.println("");
       
        System.out.println("---");
        HashMap<Integer,String> personas = new HashMap<>();
        System.out.println("Agregar Objetos a Mapa");
        personas.put(5, "b");
        personas.put(2, "v");
        personas.put(2, "x");
        personas.put(4, "b");
        personas.put(1, "c");
        System.out.println(personas.toString());
        System.out.println("Remover elemento de Mapa");
        personas.remove(1);
        personas.remove(2,"x");
        System.out.println(personas.toString());
        System.out.println("Recorrer Mapa");
        System.out.println("ForEach Llaves");
        for (Integer llave : personas.keySet()) {
            System.out.print("[ "+llave+" ]");
        }
        System.out.println("");
        System.out.println("ForEach Valores");
        for (String valor : personas.values()) {
            System.out.print("[ "+valor+" ]");
        }
        System.out.println("");
        System.out.println("ForEach Map.Entry (Mapa Completo)");
        for (Map.Entry<Integer,String> mapa : personas.entrySet()) {
            System.out.print("[ Llave: "+mapa.getKey()+" - Valor: "+mapa.getValue()+" ]");
        }
        System.out.println(""); */
        
        /* MANOS A LA OBRA – DETECCIÓN DE ERRORES
HashMap<Integer> personas = new HashMap<>;
String n1 = “Albus”;
String n2 = “Severus”;
personas.add(n1);
personas.add(n2); 
       
        HashMap<Integer,String> personas3 = new HashMap<>();
        //personas.add(n1);
        personas3.put(1, "Albus");
        String n2 = "Severus";
        int n3 = 2;
        //String n1 = “Albus”;
        //String n2 = “Severus”;
        //personas.add(n2);
        personas3.put(n3, n2);
        for (Map.Entry<Integer,String> pers : personas3.entrySet()) {
            System.out.print("[ Persona "+pers.getKey()+", "+pers.getValue()+" ]");
        }
        System.out.println("");
        
       
       /* MANOS A LA OBRA - DETECCIÓN DE ERRORES
ArrayList<String> = new ArrayList()
bebidas.put(“café);
bebidas.add(“té”);
Iterator<String> it =bebidas.iterator();
whale (it.next()){
if (it.next().equals(“café”)){
it.remove();
}*/
       
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("mate");
        bebidas.add("café");
        bebidas.add("té");
        System.out.println("1° impresion --");
        System.out.println(bebidas.toString());
        bebidas.add(1, "capuccino");
        System.out.println("2° impresion modificando orden --");
        System.out.println(bebidas.toString());
        System.out.println("3° impresion verificando Iterator --");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
            System.out.println(bebidas.toString());
        }
        System.out.println("4° impresion final --");
        System.out.println(bebidas.toString());
        
        
        /* EJERCICIO LISTA LIBROS
¡Es tu turno! Crea una lista de Libros y muestra el 
       título de cada uno con un bucle.
        
        ArrayList<Libro> Libros = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese Nombre de Libro " + (i + 1));
            Libro L = new Libro(leer.next());
            Libros.add(L);
        }
        System.out.println(Libros.toString());
        for (Libro l : Libros) {
            System.out.println("Nombre: " + l);
        }
        public void mostrar() {

        for (Alumno aux : listaAlumnos) {
            System.out.println(aux.getNombre());
            System.out.println(aux.getNotas());

        }

    }
     
        
//        /* EJERCICIO LISTA LIBROS
//¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.*/
//        
//        ArrayList<Libro> libros = new ArrayList();
//        Libro l1 = new Libro("amanecer");
//        Libro l2 = new Libro("mañana");
//        Libro l3 = new Libro("mediodia");
//        Libro l4 = new Libro("tarde");
//        Libro l5 = new Libro("anochecer");
//        
//        libros.add(l1);
//        libros.add(l2);
//        libros.add(l3);
//        libros.add(l4);
//        libros.add(l5);
//        
//        for (Libro l : libros) {
//            System.out.println(l);
//        }
        
        
        
        
