/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional7;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Condicional7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float peso,estatura,imc;
        String paciente,dni;
        System.out.println("ingrese su nombre");
        paciente=entrada.next();
        System.out.println("ingrese su numero de documento");
        dni=entrada.next();
        System.out.println("ingrese su peso en kilogramos");
        peso=entrada.nextFloat();
        System.out.println("ingrese su estatura en metros");
        estatura=entrada.nextFloat();
        imc=peso/(estatura*estatura);
        System.out.println("su IMC es de "+imc);
        if (imc>=18.5 && imc<=24.9){
            System.out.println("peso normal");
        }
        else if (imc>=25 && imc<=30){
            System.out.println("sobrepeso");
        }
        else{
            System.out.println("estas obeso");
        }
        
    }
    
}
