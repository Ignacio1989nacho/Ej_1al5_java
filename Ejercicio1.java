/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoJavaPsint;
import java.util.Scanner;
/**
 *
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
* 
* EJERCICIOS DEL 1 al 5

 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      int num1 = leer.nextInt();
      int num2 = leer.nextInt();
      
      
        System.out.println(num1 + num2);
    }
    
    
    
}
