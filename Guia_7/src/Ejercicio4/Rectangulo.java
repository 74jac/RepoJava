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
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
  
    
    
Scanner leer = new Scanner(System.in);    
    public void creaRectangulo() {
        base = leer.nextInt();
        altura = leer.nextInt();
       
    }
    
    public int creaSuperficie(){
        int superficie = base * altura;
        return superficie;
    }
    
    public int creaPerimetro(){
        int perimetro = (base + altura) * 2;
        return perimetro;
    }
    public void creaDibujo(){
        
for (int j = 1; j <= base; j++) {
            if ((j==1)||(j==base)){
                for (int i = 1; i <= altura; i++) {
                    System.out.print("* ");
                }
                System.out.println("");
            } else {
                System.out.print("* ");
                for (int i = 2; i <= altura - 1; i++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }
        }
    }
}
      
      

 
        
    
    

