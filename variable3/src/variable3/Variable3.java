/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable3;

import java.util.Scanner;

/**
 *
 * @author BRAYAN
 */
public class Variable3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //3.	Realizar un programa el cual solicite su nombre y apellidos, también debe capturar nombre y apellidos de su padre y madre.
//       Al finalizar debe imprimir en pantalla el siguiente mensaje "Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y [Nombre del Padre].

     Scanner entrada=new Scanner(System.in);
String nombre;
String apellido1;
String apellido2;
String nombremadre;
String apellidomadre1;
String apellidomadre2;
String nombrepadre;
String apellidopadre1;
String apellidopadre2;
        System.out.println("ingrese un nombre");
        nombre=entrada.next();
        System.out.println("ingrese el primer apellido");
       apellido1=entrada.next();
        System.out.println("ingrese el segundo apellido");
       apellido2=entrada.next();
        
        
        System.out.println("ingrese el nombre de su madre");
        nombremadre=entrada.next();
        System.out.println("ingrese el primer apellido de su madre");
       apellidomadre1=entrada.next();
        System.out.println("ingrese el segundo apellido de su madre");
       apellidomadre2=entrada.next();
       
       System.out.println("ingrese el nombre de su padre");
        nombrepadre=entrada.next();
        System.out.println("ingrese el primer apellido de su padre");
       apellidopadre1=entrada.next();
        System.out.println("ingrese el segundo apellido de su padre");
       apellidopadre2=entrada.next();
      
        System.out.println("yo"+nombre+" "+apellido1+" "+apellido2+" ,soy hijo de "+nombremadre+" "+apellidomadre1+" "+apellidomadre2+" y "+nombrepadre+" "+apellidopadre1+" "+apellidopadre2);
    }
    
}
