/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoJavaPsint;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio4 {
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("ingresa la cantidad de grados:");
    
    int grados = leer.nextInt();
    
    
    double grados_f = 32 + (9*grados/5);
    
        System.out.println(grados_f);
    }
    
}
