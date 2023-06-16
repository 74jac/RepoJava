/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_11;

/**
 *
 * @author JoséAgustín
 */
public class Guia_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public static void main(String[] args) {
       
        Dni dni = new Dni('A', 12345678);
        Persona persona = new Persona("Juan", "Perez", dni);

        System.out.println("Serie del DNI de la persona: " + persona.getDni().getSerie());
        System.out.println("Número del DNI de la persona: " + persona.getDni().getNumero());
        
        // Jugando con los objetos
        persona.getDni().setSerie('B');
        persona.getDni().setNumero(87654321);
        
        System.out.println("Nueva serie del DNI de la persona: " + persona.getDni().getSerie());
        System.out.println("Nuevo número del DNI de la persona: " + persona.getDni().getNumero());
    }
}
public class Dni {
     private char serie;
    private int numero;

    public Dni(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
public class Persona {
    private String nombre;
    private String apellido;
    private Dni dni;

    public Persona(String nombre, String apellido, Dni dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }
}
    }
    
}
