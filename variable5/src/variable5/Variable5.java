/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable5;

import java.util.Scanner;

/**
 *
 * @author BRAYAN
 */
public class Variable5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //5.	Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota y su nombre completo.
//        Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje: [Nombre de Mascota] es un(a) [Tipo de Mascota], el cual, tiene [Edad de la Mascota] años de edad y [Nombre Completo]
//es actualmente su dueño(a).
Scanner entrada=new Scanner(System.in);
String nombre,nombremascota,tipo;
String apellido1;
String apellido2;
int edadmascota;
        System.out.println("ingrese el nombre de su mascota ");
        nombremascota=entrada.next();
        System.out.println("ingresa la edad de tu mascota");
        edadmascota=entrada.nextInt();
        System.out.println("ingrese tipo de mascota");
        tipo=entrada.next();
       System.out.println("ingrese un nombre");
        nombre=entrada.next();
        System.out.println("ingrese el primer apellido");
       apellido1=entrada.next();
        System.out.println("ingrese el segundo apellido");
       apellido2=entrada.next();
       
        System.out.println(nombremascota+" es un : "+tipo+" el cual,tiene "+edadmascota+" años de edad y "+nombre+" "+apellido1+" "+apellido2+ " es actualmente su dueño");
    }
    
}
