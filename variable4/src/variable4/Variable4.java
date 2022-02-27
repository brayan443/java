/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable4;

import java.util.Scanner;

/**
 *
 * @author BRAYAN
 */
public class Variable4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //4.	Realizar un programa el cual solicite el nombre de una ciudad capital y el país. Al finalizar debe imprimir en pantalla el siguiente mensaje 
//      "La ciudad [Nombre de la Ciudad], es la capital del país [Nombre del País]

    Scanner entrada=new Scanner(System.in);
    String ciudad,pais;
        System.out.println("ingrese el nombre de una ciudad capital");
        ciudad=entrada.next();
        System.out.println("ingrese el nombre del pais ");
        pais=entrada.next();
        
        System.out.println("la ciudad "+ciudad+" ,es la capital del pais "+pais);
    }
    
}
