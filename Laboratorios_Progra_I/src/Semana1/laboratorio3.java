/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class laboratorio3 {
    public static void main (String []args){
        Scanner lea= new Scanner(System.in);
        Random rand =new Random();
        
        int opcion, cantpal, cantidad;
        String pal, alreves=""; 
        int contador1=0, contador2=0, contador3=0, contador4=0;
   
        
         // Menú que se repite hasta que elijamos salir
        do {
            System.out.println("*** Menu Principal ***");
            System.out.println("1.  Voltear palabras");
            System.out.println("2.  Numero Perfecto");
            System.out.println("3.  Numero primo");
            System.out.println("4.  Votaciones");
            System.out.println("5.  Salir");
            
            opcion = lea.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("\nOpcion 1 seleccionada");
                    System.out.println("Ingresa cantidad de palabras que desea");
                    cantpal= lea.nextInt();
                    System.out.println("Ingresa las palabras que deseas");
                    for (int i= 0; i< cantpal; i++){
                        System.out.println("Palabra "+(i+1)+ ": ");
                        pal =lea.next();
                       
                        
                    for (int j= pal.length() -1; j>=0; j--){
                    alreves += pal.charAt(j);
 
                    }    
                  
                          System.out.println("Al reves: "+alreves);

                    }

                    contador1++;
                    
                    break;
                    
                case 2:
                    System.out.println("\nOpcion 2 seleccionada");
                    System.out.println("Ingresa el numero que deseas: ");
                    int numero= lea.nextInt();
                    int numper=0;
                            
                for (int i=1; i < numero; i++){
                   if (numero % i ==0){
                       numper += i;
                   }                     
                }    
                if (numero==numper){
                    System.out.println("Numero perfecto");
                }else{ 
                    System.out.println("No es numero perfecto");
                }
                contador2++;
                    break;
                    
                case 3:
                    System.out.println("\nOpcion 3 seleccionada");
                    
                    int num= rand.nextInt(100)+1;
                    
                    System.out.println("Numero generado: " +num);
                    
                    int divisores =0;
                    String ldiv= "";
                    for (int i=1; i<= num; i++){
                        if (num % i== 0){
                            ldiv += i + "";
                            divisores++;
                                
                            }
                    }
                    if (divisores ==2){
                        System.out.println(+num+ " es primo");
                    }else{
                        System.out.println(+num+ " no es primo");
                    }
                    System.out.println("Divisores de " +num+ ": " +ldiv);
                    
                    contador3++;
                    
                    break;
                    
                    
                    
                    
                    
                    
                case 4:
                    System.out.println("\nOpcion 4 seleccionada");
                    break;
                    
                    
                    
                case 5:
                    System.out.println("\nHasta luego");
                    
                    System.out.println("Opcion 1: " +contador1+ " veces");
                    System.out.println("Opcion 2: " +contador2+ " veces");
                    System.out.println("Opcion 3: " +contador3+ " veces");
                    break;
                    
                    
                default:
                    System.out.println("\nOpcin no valida");
            }
            
        } while(opcion != 5); // Se repite hasta que elijan salir (5)
        
    }
}
    
    
    

