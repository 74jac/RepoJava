/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7.circunferencia;

/**
 *
 * @author JoséAgustín
 */
import java.util.Scanner;

public class Circunferencia {

    public double radio ;
    
    public Circunferencia(){
        this.radio = 0;

}

    public Circunferencia(double radio) {
        this.radio = radio;
    }



    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
   Scanner leer = new Scanner (System.in);
public double crearCircunferencia(){
radio = leer.nextDouble();
return radio;
}
  public double crearArea(){
double area;
area= (3.14 * Math.pow(radio, 2));

return area;


}
    public double crearPerimetro(){
double perimetro;
perimetro = (2*3.14*radio);

return perimetro;
    }
}

