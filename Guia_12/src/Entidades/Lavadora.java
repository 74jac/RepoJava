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
public class Lavadora extends Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, double peso, char consumoEnergetico, String color) {
        super(precio, peso, consumoEnergetico, color);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Carga: " + carga + ", Peso: " + peso+ ", Color: "+ color + '\n' + "Consumo energetico: " + consumoEnergetico + ", Precio: " + precio + '\n';
    }
    
    

    /*• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/
    public void crearLavadora() {
        crearElectrodomestico();
        System.out.println("Cuantos kg de carga desea en su lavarropas?");
        carga = leer.nextInt();

    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/

    @Override
    public double precioFinal() {
        /*Con la palabra reservada super traemos todo el
        contenido del metodo precioFinal() sin sobreescribirlo*/
        super.precioFinal();
        
        if (carga > 30) {
            precio += 500;
        }
        
        return precio;

    }

}
