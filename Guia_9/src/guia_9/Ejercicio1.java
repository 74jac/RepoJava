/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9;

import Entidades.Cadena;
import Servicios.CadenaServicios;
/**
 *
 * @author JoséAgustín
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CadenaServicios cs = new CadenaServicios();
       Cadena c1 = new Cadena();

        cs.mostrarVocales();
        cs.invertirFrase();
        cs.vecesRepetido();
        cs.compararLongitud();
        cs.unirFrases();
        cs.reemplazar();
        System.out.println(cs.contiene());
    }

}
    
    

