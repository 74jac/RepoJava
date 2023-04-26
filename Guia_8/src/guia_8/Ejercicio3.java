/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
 

Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 */
package guia_8;
import Servicios.PersonaServicios;
import Entidades.Persona;
        
/**
 *
 * @author JoséAgustín
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicios pss = new PersonaServicios();
        
        
        Persona ps1 = pss.crearPersona();
        System.out.println("La Persona es: " + pss.esMayorDeEdad(ps1));
        System.out.println("Su IMC es: " + pss.calcularIMC(ps1));
        Persona ps2 = pss.crearPersona();
        System.out.println("La Persona es: " + pss.esMayorDeEdad(ps2));
        System.out.println("Su IMC es: " + pss.calcularIMC(ps2));
        Persona ps3 = pss.crearPersona();
        System.out.println("La Persona es: " + pss.esMayorDeEdad(ps3));
        System.out.println("Su IMC es: " + pss.calcularIMC(ps3));
        Persona ps4 = pss.crearPersona();
        System.out.println("La Persona es: " + pss.esMayorDeEdad(ps4));
        System.out.println("Su IMC es: " + pss.calcularIMC(ps4));
        
        
        
        
        
        
        
        
        
    }
    
}
