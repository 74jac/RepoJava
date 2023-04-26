/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario 
los dos números y los ingresa en los atributos del objeto. Después, a través de 
otro método calcular y devolver la distancia que existe entre los dos puntos que
existen en la clase Puntos.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Puntos {

    public int coordX1;
    public int coordX2;
    public int coordY1;
    public int coordY2;

    public Puntos(int coordX1, int coordX2, int coordY1, int coordY2) {
        this.coordX1 = coordX1;
        this.coordX2 = coordX2;
        this.coordY1 = coordY1;
        this.coordY2 = coordY2;
    }
    public Puntos (){
        
    }
    public int getCoordX1() {
        return coordX1;
    }

    public void setCoordX1(int coordX1) {
        this.coordX1 = coordX1;
    }

    public int getCoordX2() {
        return coordX2;
    }

    public void setCoordX2(int coordX2) {
        this.coordX2 = coordX2;
    }

    public int getCoordY1() {
        return coordY1;
    }

    public void setCoordY1(int coordY1) {
        this.coordY1 = coordY1;
    }

    public int getCoordY2() {
        return coordY2;
    }

    public void setCoordY2(int coordY2) {
        this.coordY2 = coordY2;
    }
    
    
Scanner leer = new Scanner(System.in);    
public int creaPuntos(){
    coordX1= leer.nextInt();
    coordX2= leer.nextInt();
    coordY1= leer.nextInt();
    coordY2= leer.nextInt();
    return coordX1;
    
}    
public double creaDistancia(){
    double dista;
    dista = Math.sqrt((Math.pow(coordX2-coordX1,2))+(Math.pow(coordY2-coordY1,2)));
    
    return dista;
}
}
