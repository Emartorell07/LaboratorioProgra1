/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1;

/**
 *
 * @author eduar
 */

import java.util.Scanner;

public class FECHA {
     public static void main(String[] args) {
        // TODO code application logic here   
        Scanner lea=new Scanner (System.in);
    lea.useDelimiter("\n");
    
    String fechaCompleta1, mes1, dia1, year1, fechaCompleta2,mes2, dia2, year2;
    int totaldia1, totaldia2, diferencia;
    
    
    
            
    
    System.out.println(" Ingresa la primera fecha en formato DD/MM/AAAA:   ");
    fechaCompleta1= lea.next();
    System.out.println(" Ingresa la segunda fecha en formato DD/MM/AAAA:   ");
    fechaCompleta2= lea.next();
    
         dia1= (fechaCompleta1.substring(0,2));  
         mes1= (fechaCompleta1.substring(3,5));
         year1= (fechaCompleta1.substring(6,10));
         
         dia2= (fechaCompleta2.substring(0,2));
         mes2= (fechaCompleta2.substring(3,5));
         year2= (fechaCompleta2.substring(6,10));
         
        int year11 = Integer.parseInt(year1);
        int mes11 = Integer.parseInt(mes1);
        int dia11 =Integer.parseInt(dia1);
        int year22 =Integer.parseInt(year2);
        int mes22 = Integer.parseInt(mes2);
        int dia22 = Integer.parseInt(dia2);
         
         totaldia1 = (year11 * 360 + mes11*30 + dia11);
        totaldia2 = (year22 * 360 + mes22* 30 + dia22 );
        diferencia= (totaldia1 - totaldia2);
        System.out.println("Hay una diferencia de" + Math.abs(diferencia) + "dias");
        
         
         
         
         
         
         
    
    
    
    
    
  
    
    
    
}
}