/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package guia_12;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Karen
 */
public class Ejercicio2y3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Lavadora lavadora = new Lavadora();
        Televisor tele= new Televisor();
        System.out.println("Lavadora");
        lavadora.crearLavadora();
        lavadora.precioFinal();
        System.out.println(lavadora);
        System.out.println("Televisor");
        tele.crearTelevisor();
        tele.precioFinal();
        System.out.println(tele);*/
        ArrayList<Electrodomestico> equipos = new ArrayList();

        Electrodomestico lav1 = new Lavadora(10, 1000, 15, 'D', "blanco");
        Electrodomestico lav2 = new Lavadora(40, 2000, 40, 'C', "gris");
        Electrodomestico tele1 = new Televisor(32, false, 4000, 4, 'A', "negro");
        Electrodomestico tele2 = new Televisor(58, true, 7500, 10, 'B', "azul");

        equipos.add(lav1);
        equipos.add(lav2);
        equipos.add(tele1);
        equipos.add(tele2);

        for (Electrodomestico equipo : equipos) {
            System.out.println(equipo.precioFinal());
        }

        double sumaTeles = 0;
        double sumaLav = 0;
        double sumaEquipos = 0;

        System.out.println("----------------------------------------");
        for (Electrodomestico equipo : equipos) {

            sumaEquipos += equipo.getPrecio();
            if (equipo instanceof Televisor) {
                sumaTeles += equipo.getPrecio();

            }
            if (equipo instanceof Lavadora) {
                sumaLav += equipo.getPrecio();
            }

        }

        System.out.println("Total tvs: " + sumaTeles);
        System.out.println("Total lavadoras: " + sumaLav);
        System.out.println("Total electrodomesticos: " + sumaEquipos);

        // TODO code application logic here
    }

}
