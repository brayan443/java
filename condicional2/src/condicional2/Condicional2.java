/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional2;

import java.util.Scanner;

/**
 *
 * @author BRAYAN
 */
public class Condicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int edad;
        System.out.println("ingrese su edad");
        edad=entrada.nextInt();
        if (edad<18){
            System.out.println("usted es aún un niño");
        }
    }
    }
    

