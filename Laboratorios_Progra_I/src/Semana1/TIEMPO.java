package Semana1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */

import java.util.Scanner;


public class TIEMPO {
    
   public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lea=new Scanner (System.in);
    lea.useDelimiter("\n");
      int horas, minutos, segundos;
        
        System.out.println(" Ingrese un numero de segundos: ");
           int SegundosIng = lea.nextInt();
        String mensaje = (SegundosIng <= 0) ? "No se permite ese valor" : "Valor permitido";
        System.out.println( mensaje );
        
        if (SegundosIng >= 0){
            
            System.out.println(" 1 Hora = 3600 Segundos ");
            System.out.println(" 1 minuto = 60 Segundos ");
            
             horas= (SegundosIng / 3600);
             minutos= (SegundosIng % 3600 / 60);
            segundos = ( SegundosIng % 60);
                    
        System.out.println("Horas: " + horas + "  Minutos: "+minutos+ "  Segundos: " +segundos );

            
        }
        
    }
   
    
}
    
    

