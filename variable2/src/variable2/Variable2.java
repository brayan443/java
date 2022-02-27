/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable2;

import java.util.Scanner;

/**
 *
 * @author BRAYAN
 */
public class Variable2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2.	Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.

    Scanner entrada=new Scanner(System.in);
String nombre;
String apellido1;
String apellido2;
int edad;
float estatura;
        System.out.println("ingrese un nombre");
        nombre=entrada.next();
        System.out.println("ingrese el primer apellido");
       apellido1=entrada.next();
        System.out.println("ingrese el segundo apellido");
       apellido2=entrada.next();
        System.out.println("ingrese su edad");
        edad=entrada.nextInt();
        System.out.println("ingrese su estatura");
        estatura=entrada.nextFloat();
        System.out.println("Bienvenido: "+nombre+" "+apellido1+" "+apellido2+" su edad es: "+edad+" mide "+estatura);
    }
    
}
