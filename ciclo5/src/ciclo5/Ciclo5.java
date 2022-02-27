/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo5;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Ciclo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       String nombre;
	int opcion;
	System.out.println("1.captura  nombre \n 2.saludar persona \n 3.salir del sistema");
 opcion=entrada.nextInt();
	do
            switch (opcion){
               
                case 1:{
                    System.out.println("ingresa tu nombre");
                    nombre=entrada.next();
                    System.out.println("1.captura  nombre \n 2.saludar persona \n 3.salir del sistema");
 opcion=entrada.nextInt();
                    break;
                }
                case 2:{
                    System.out.println("ingresa tu nombre");
                nombre=entrada.next();
                    System.out.println("hola"+nombre);
                    System.out.println("1.captura  nombre \n 2.saludar persona \n 3.salir del sistema");
 opcion=entrada.nextInt();
                    break;
                }
                case 3:{
                    System.out.println("ingresa tu nombre");
                    nombre=entrada.next();
                    System.out.println("adios"+nombre);
                    break;
                }
                
            }
        while( opcion!=3);
        }}
        
    
            
        
            
    

