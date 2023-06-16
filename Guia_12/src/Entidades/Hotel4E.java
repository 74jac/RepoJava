/*
 • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package Entidades;

/**
 *
 * @author Karen
 */
public class Hotel4E extends Hoteles {
    protected int capacidadRestaurante;
    protected String gimnasio, nombreRestaurante;

    public Hotel4E() {
    }

    public Hotel4E(int capacidadRestaurante, String gimnasio, String nombreRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
    }

    public Hotel4E(int capacidadRestaurante, String gimnasio, String nombreRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitacion);
        this.capacidadRestaurante = capacidadRestaurante;
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
    }

    public Hotel4E(int capacidadRestaurante, String gimnasio, String nombreRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerenteEncargado);
        this.capacidadRestaurante = capacidadRestaurante;
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
    }

 

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel4E{" +"nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerenteEncargado=" + gerenteEncargado +"cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + "capacidadRestaurante=" + capacidadRestaurante + ", gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + '}';
    }
    
    
    
    
    
    
}
