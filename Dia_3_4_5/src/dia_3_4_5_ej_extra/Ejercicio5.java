/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package dia_3_4_5_ej_extra;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del tratamiento");
        double total =0;
        double pago = 0;
        double costo = 0;
        double valor = leer.nextDouble();
        System.out.println("Ingrese su plan");
        String TipoPlan = leer.next();
        
        switch (TipoPlan) {
            case "A": {
                pago = costo * 0.5;
                System.out.println("usted pagara " + total);
                break;
            }
            case "a": {
                pago = costo * 0.50;
                System.out.println("usted pagara " + total);
                break;
            }
            case "B": {
                pago = costo * 0.35;
                System.out.println("usted pagara " + total);
                break;
            }
            case "b": {
                pago = costo * 0.5;
                System.out.println("usted pagara " + total);
                break;
            }
            case "C": {

                System.out.println("usted pagara " + total);
                break;
            }
            case "c": {

                System.out.println("usted pagara " + total);
                break;
            }
    }
}   
}
