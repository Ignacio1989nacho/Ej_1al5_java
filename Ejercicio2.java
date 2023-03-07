/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
    
   public static void main(String [] args){
   
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingresa tu nombre:");
       
       String nombre = leer.nextLine();
       
       System.out.println("Ingresa tu apellido:");
       
       String apellido = leer.nextLine();
       
       
       System.out.println("Tu nombre y apellido son:"+nombre+" "+apellido);
   
   }
    
}
