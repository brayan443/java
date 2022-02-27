/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional3;

import java.util.Scanner;

/**
 *
 * @author BRAYAN
 */
public class Condicional3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
         String nombre,apellido1,apellido2;
         int edad;
         System.out.println("ingrese su nombre");
         nombre=entrada.next();
         System.out.println("ingrese su primer apellido");
         apellido1=entrada.next();
         System.out.println("ingrese su segundo apellido");
         apellido2=entrada.next();
         System.out.println("ingrese su edad");
         edad=entrada.nextInt();
         if (edad>=18){
             System.out.println(nombre+" "+apellido1+" "+apellido2+" usted es mayor de edad, por lo tanto puede entrar a la fiesta");    
         }
         else{
             System.out.println(nombre+" "+apellido1+" "+apellido2+" usted es menor de edad, por lo tanto no puede entrar a la fiesta, por favor devuélvase a su casa");
         }
    }
    
}
