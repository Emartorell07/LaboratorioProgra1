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


public class PAGOS {
    
    public static void main(String[] args) {
        // TODO code application logic here   
        Scanner lea=new Scanner (System.in);
        
        String nombre, apellido, CodigoEmpleado, categoria, horastrabajadas, horasext ; 
   
        
        System.out.println(" Ingresa tu Codigo de Empleado: ");
        CodigoEmpleado= lea.next();
        System.out.println(" Ingrese su Primer Nombre: ");
        nombre= lea.next();
        System.out.println(" Ingrese su Primer Apellido: ");
        apellido= lea.next();
        System.out.println(" Ingresa las horas trabajadas:  ");
        horastrabajadas= lea.next();
        System.out.println(" Ingresa la categoria a la que perteneces: ");
        categoria= lea.next();
       
        
        
        int horatra = Integer.parseInt(horastrabajadas);
        int HorasExt = Integer.parseInt(horasext);
        int cat = Integer.parseInt(categoria);
        
        
        
        
        if (horatra >= 40){
            
            
            HorasExt= (horatra - 40);
            
            System.out.println(" Que categoria perteneces? ");
            
            switch (categoria){
                case "categoria 1 ":
                    System.out.println(" Perteneces a la categoria 1 ");
                    
                    break;
                case "categoria 2 ":
                    System.out.println("Perteneces a la categoria 2");
                    
                    
                    
                    
                    break;
                    
                case "categoria 3":
                    System.out.println("Perteneces a la categoria 3");
                    
                    break;
                    
                case "categoria 4":
                        System.out.println(" Perteneces a la categoria 4");
                            
                        break;
                        
                        
                    
                    
                
                
                
                
                
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }    
}
