/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_3_4_5;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
   	Scanner leer = new Scanner(System.in);
  	 
   	String respuesta = "S";
  	 
   	while (respuesta.equalsIgnoreCase("S")) {
      	 
    	System.out.println("Desea continuar?");
    	respuesta = leer.nextLine();
   	   }
    }
    
}
