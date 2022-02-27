/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable1;

import java.util.Scanner;

/**
 *
 * @author BRAYAN
 */
public class Variable1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       1.	Realizar un programa el cual solicite su nombre y apellidos.

 Scanner entrada=new Scanner(System.in);
String nombre;
String apellido1;
String apellido2;
        System.out.println("ingrese un nombre");
        nombre=entrada.next();
        System.out.println("ingrese el primer apellido");
       apellido1=entrada.next();
        System.out.println("ingrese el segundo apellido");
       apellido2=entrada.next();
        System.out.println("Bienvenido: "+nombre+" "+apellido1+" "+apellido2);

    }
    
}
