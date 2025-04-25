/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana1;

/**
 *
 * @author eduar
 */
import java.util.Scanner;
public class Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner teclado = new Scanner (System.in).useDelimiter("\n"); 
   

    
System.out.print("Ingresa tu nombre completo");
String nombre= teclado.next();

System.out.print("Ingresa las horas de trabajo mensual : ");
int HorasDeTrabajo= teclado.nextInt();

System.out.print("Ingresa la Tarifa deseada : ");
double TarifaPorHora= teclado.nextDouble();
    
double pagoTotal= HorasDeTrabajo * TarifaPorHora;

double PagoSemanal= pagoTotal / 4.3; 






System.out.println("Nombre del Empleado : \""+nombre+"\"");
System.out.println("Horas Trabajadas Mensualmente: "+HorasDeTrabajo+"");
System.out.println("Ingresa la tarifa deseada : " +TarifaPorHora);
System.out.println("El Pago Total seria : " + pagoTotal);
System.out.println("Su pago semanal es : " + PagoSemanal);








        
    }
}
