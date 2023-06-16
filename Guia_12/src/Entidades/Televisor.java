/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Karen
 */
public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizador, double precio, double peso, char consumoEnergetico, String color) {
        super(precio, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "Peso: " + peso + ", Color: " + color + ", Consumo energetico: " + consumoEnergetico + '\n' + "Precio: " + precio + ", Resolucion:" + resolucion + ", Sintonizador: " + sintonizador + '\n';
    }

    /*Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.*/
    public void crearTelevisor() {
        crearElectrodomestico();
        System.out.println("De cuantas pulgadas quiere su tv?");
        resolucion = leer.nextDouble();
        System.out.println("Lo desea con sintonizador?");
        String resp = leer.next();

        if (resp.equalsIgnoreCase("si")) {
            sintonizador = true;
        } else {
            sintonizador = false;
        }
    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/
    @Override
    public double precioFinal() {
        /*Con la palabra reservada super traemos todo el
        contenido del metodo precioFinal() sin sobreescribirlo*/
        super.precioFinal();

        if (resolucion > 40) {
            double inc = precio * 0.30;
            precio += inc;
        }

        if (sintonizador) {
            precio += 500;
        }
        return precio;

    }

}
