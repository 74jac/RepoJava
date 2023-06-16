/*
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package Entidades;

/**
 *
 * @author Karen
 */
public class Hotel5E extends Hotel4E {
    
    protected int cantSalonesConferencia, cantSuites, cantLimosinas;

    public Hotel5E() {
    }

    public Hotel5E(int cantSalonesConferencia, int cantSuites, int cantLimosinas) {
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5E(int cantSalonesConferencia, int cantSuites, int cantLimosinas, int capacidadRestaurante, String gimnasio, String nombreRestaurante) {
        super(capacidadRestaurante, gimnasio, nombreRestaurante);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5E(int cantSalonesConferencia, int cantSuites, int cantLimosinas, int capacidadRestaurante, String gimnasio, String nombreRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion) {
        super(capacidadRestaurante, gimnasio, nombreRestaurante, cantHabitaciones, numCamas, cantPisos, precioHabitacion);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5E(int cantSalonesConferencia, int cantSuites, int cantLimosinas, int capacidadRestaurante, String gimnasio, String nombreRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(capacidadRestaurante, gimnasio, nombreRestaurante, cantHabitaciones, numCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerenteEncargado);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

  

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5E{" +"nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerenteEncargado=" + gerenteEncargado +"cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + "capacidadRestaurante=" + capacidadRestaurante + ", gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + "cantSalonesConferencia=" + cantSalonesConferencia + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }
    
    
    
    
}
