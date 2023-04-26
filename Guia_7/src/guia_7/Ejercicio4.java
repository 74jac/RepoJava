/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para 
crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo 
y un método para calcular el perímetro del rectángulo. Por último, 
tendremos un método que dibujará el rectángulo mediante asteriscos 
usando la base y la altura. Se deberán además definir los métodos getters, 
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package guia_7;
import Ejercicio4.Rectangulo;
/**
 *
 * @author JoséAgustín
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rectangulo recta = new Rectangulo();
           

        System.out.println("Ingrese la base y la altura de rectangulo");
        recta.creaRectangulo();
 
        System.out.println("Superficie " + recta.creaSuperficie());
        System.out.println("Perimetro " + recta.creaPerimetro()); 
        System.out.println("---------------------");
        recta.creaDibujo();
    }
    
}
