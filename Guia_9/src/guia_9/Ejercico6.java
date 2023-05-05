/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita
un programa para organizar la información de cada curso. 
Para ello, crearemos una 
clase entidad
    - Curso:
       - atributos: nombreCurso
                   cantidadHorasPorDia
                   cantidadDiasPorSemana, 
                   turno (mañana o tarde)
                   precioPorHora
                   alumnos. (Donde alumnos  es un arreglo de tipo String de dimensión 5 (cinco), 
                            donde se alojarán los nombres de cada alumno. 
       - métodos:
                    Un constructor por defecto.
                    Un constructor con todos los atributos como parámetro.
                    Métodos getters y setters de cada atributo.
       - service
                    Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese 
el nombre de cada alumno.
                    Método crearCurso(): el método crear curso, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
                    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en 
una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el 
precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.

 */
package guia_9;

import Entidades.Curso;
import Servicios.ServiceCurso;

/**
 *
 * @author PC SABRINA
 */
public class Ejercico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso c = new Curso();
        ServiceCurso s = new ServiceCurso();
        
        s.crearCurso(c);
        System.out.println(" su ganancia es: " + s.calcularGananciaSemanal(c));

    }
 
}
