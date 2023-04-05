/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_8_9_10;

import java.util.Scanner;

/**
 *
 * @author JoséAgustín
 */
public class Ejercicio3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
 int n,numero,c=0,c1=0,c2=0,c3=0,c4=0;
        System.out.println("Ingree un numero");
      n = leer.nextInt();
 int vector[] = new int[n];
  for (int i = 0; i < n; i++) {

            vector[i] = (int) (Math.random() * 265);

        }
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
        //System.out.println("");
        
 for(int pepito =0; pepito<n;pepito++){
     if ( vector[pepito]<=9) {
         System.out.println("su numero tiene un digito " + pepito);
         c++;
     }if(vector[pepito]>=10 && vector[pepito]<=99) {
           System.out.println("su numero tiene dos digito " + pepito);
           c1++;
     
     }if(vector[pepito]>=100 && vector[pepito]<=999){
          System.out.println("su numero tiene 3 digito " + pepito);
           c2++;
     }if(vector[pepito]>=1000 && vector[pepito]<=9999){
          System.out.println("su numero tiene 4 digito " + pepito);
           c3++; 
     }if(vector[pepito]>=10000 && vector[pepito]<=99999){
         System.out.println("su numero tiene 5 digito "+ pepito);
           c3++;
    }
 }   
    }  
}