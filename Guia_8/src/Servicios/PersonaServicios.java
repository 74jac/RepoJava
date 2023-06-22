/*
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.

c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
 */
package Servicios;
import Entidades.Persona;
import java.util.Scanner;
/**
 *
 * @author JoséAgustín
 */
public class PersonaServicios {
    
    public Persona crearPersona(){
        Persona ps = new Persona();

        
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        ps.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad de la persona: ");
        ps.setEdad(leer.nextInt());
        System.out.println("Ingresar sexo de la persona (H, M o O)");
        //ps.setSexo(leer.next());
        
        do {
            System.out.println("Ingrese el sexo: ");
            String se = (leer.next());

            if ("f".equalsIgnoreCase(se) || "m".equalsIgnoreCase(se) || "o".equalsIgnoreCase(se)) {
                ps.setSexo(se);
            } else {
                System.out.println("Dato no válido, reintente");
            }

        } while (!"f".equalsIgnoreCase(ps.getSexo()) && !"m".equalsIgnoreCase(ps.getSexo()) && !"o".equalsIgnoreCase(ps.getSexo()));
        
        System.out.println("Ingresar el peso de la persona: ");
        ps.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona: ");
        ps.setAltura(leer.nextDouble());
        return ps;
    }
    
    public boolean esMayorDeEdad(Persona ps){
        if (ps.getEdad() > 18){
            
        }
        return true;
} 

    public int calcularIMC (Persona ps){
        int funcion=0;
        double pesoIdeal;
        pesoIdeal = Math.pow((ps.getPeso() / ps.getAltura()),2);
        if (pesoIdeal<20){
            funcion = -1;
            
        }else if (pesoIdeal >=20 && pesoIdeal<=25){
            funcion = 0;
        }else if (pesoIdeal >25) {
            funcion = 1;
        }
        return funcion;
}
/*
Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
    */
  
}
