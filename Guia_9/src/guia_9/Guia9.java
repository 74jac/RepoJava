/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9;

import java.util.Arrays;

/**
 *
 * @author JoséAgustín
 */
public class Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector1 = {4, 5, 6};
        int[] vector2 = {4, 5, 6};
       
//Retorna true o false, si dos arreglos del mismo tipo de dato son iguales.
 System.out.println(Arrays.equals(vector1, vector2));
        
 //Este método lo que hace es inicializar todo el arreglo con la variable o 
 //valor que pasamos como argumento. Este método se puede usar con cualquier tipo 
 //de dato y le podemos decir desde y hasta que índice queremos que llene 
 //con ese valor.
 Arrays.fill(vector1,0);       
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector1[i]);
        }
        System.out.println("---------");
        //System.out.println(vector2.toString());
//        System.out.println(type);
        
//        Integer[] vector1 = {1,2,3,4};
//        int[] vector2 = {4,3,2,1};
        
        
        
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector1[i]);
        }
        
        System.out.println(Arrays.toString(vector1));
        
        //Arrays.sort(vector2);
        //Arrays.sort(vector2,0,2);
        
        
        System.out.println(Arrays.toString(vector2));

        Arrays.fill(vector2, 1, vector2.length, 6);
        
        
        for (int i = 1; i < vector1.length; i++) {
            vector1[i] = 6;
        }
        
        
        System.out.println(Arrays.toString(vector1));
        System.out.println(Arrays.toString(vector2));
        
        
        
        Integer var1 = 8;
        
//        System.out.println(vector1[1].compareTo(10));
        
        System.out.println((vector2[1] == vector1[1]));
        
        
        
        
        
        Double var2 = var1.doubleValue();


        System.out.println(var2);
        System.out.println(var1.equals(var2.intValue()));
        System.out.println(var1.equals(var1+1-1));
        System.out.println(var2.equals(2));
        
        
        System.out.println((double)var1 / 3);
        
        String svar1= var1.toString();
       
//        System.out.println(2 + parseInt(svar1));
        
        
        
        //DATE
//        Date tiempo1 = new Date(2);
//        Date tiempo2 = new Date(1);
       
        
//        System.out.println(tiempo1);
        
        //tiempo1.setTime(999999999999L);
        
        
        
//        System.out.println(tiempo1);
        
//        System.out.println(tiempo1.before(tiempo2));
        
        
//        System.out.println(tiempo1.compareTo(tiempo2));    
    }
}
    
    
        
     
        
        
    
    
    

